package com.javatechie.jwt.api.controller.impl;

import com.javatechie.jwt.api.controller.TbInvSupplierItemController;
import com.javatechie.jwt.api.dto.TbInvSupplierItemDTO;
import com.javatechie.jwt.api.entity.TbInvSupplierItem;
import com.javatechie.jwt.api.mapper.TbInvSupplierItemMapper;
import com.javatechie.jwt.api.service.TbInvSupplierItemService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("api/rest/tb-inv-supplier-item")
@RestController
public class TbInvSupplierItemControllerImpl implements TbInvSupplierItemController {
    private final TbInvSupplierItemService tbInvSupplierItemService;
    private final TbInvSupplierItemMapper tbInvSupplierItemMapper;

    public TbInvSupplierItemControllerImpl(TbInvSupplierItemService tbInvSupplierItemService, TbInvSupplierItemMapper tbInvSupplierItemMapper) {
        this.tbInvSupplierItemService = tbInvSupplierItemService;
        this.tbInvSupplierItemMapper = tbInvSupplierItemMapper;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TbInvSupplierItemDTO save(@RequestBody TbInvSupplierItemDTO tbInvSupplierItemDTO) {
        TbInvSupplierItem tbInvSupplierItem = tbInvSupplierItemMapper.asEntity(tbInvSupplierItemDTO);
        return tbInvSupplierItemMapper.asDTO(tbInvSupplierItemService.save(tbInvSupplierItem));
    }

    @Override
    @GetMapping("/{id}")
    public TbInvSupplierItemDTO findById(@PathVariable("id") Long id) {
        TbInvSupplierItem tbInvSupplierItem = tbInvSupplierItemService.findById(id).orElse(null);
        return tbInvSupplierItemMapper.asDTO(tbInvSupplierItem);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        tbInvSupplierItemService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<TbInvSupplierItemDTO> list() {
        return tbInvSupplierItemMapper.asDTOList(tbInvSupplierItemService.findAll());
    }

    @Override
    @GetMapping("/page-query")
    public Page<TbInvSupplierItemDTO> pageQuery(Pageable pageable) {
        Page<TbInvSupplierItem> tbInvSupplierItemPage = tbInvSupplierItemService.findAll(pageable);
        List<TbInvSupplierItemDTO> dtoList = tbInvSupplierItemPage
                .stream()
                .map(tbInvSupplierItemMapper::asDTO).collect(Collectors.toList());
        return new PageImpl<>(dtoList, pageable, tbInvSupplierItemPage.getTotalElements());
    }

    @Override
    @PutMapping("/{id}")
    public TbInvSupplierItemDTO update(@RequestBody TbInvSupplierItemDTO tbInvSupplierItemDTO, @PathVariable("id") Long id) {
        TbInvSupplierItem tbInvSupplierItem = tbInvSupplierItemMapper.asEntity(tbInvSupplierItemDTO);
        return tbInvSupplierItemMapper.asDTO(tbInvSupplierItemService.update(tbInvSupplierItem, id));
    }
}