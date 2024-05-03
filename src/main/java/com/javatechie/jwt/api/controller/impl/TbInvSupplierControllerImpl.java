package com.javatechie.jwt.api.controller.impl;

import com.javatechie.jwt.api.controller.TbInvSupplierController;
import com.javatechie.jwt.api.dto.TbInvSupplierDTO;
import com.javatechie.jwt.api.entity.TbInvSupplier;
import com.javatechie.jwt.api.mapper.TbInvSupplierMapper;
import com.javatechie.jwt.api.service.TbInvSupplierService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("api/rest/tb-inv-supplier")
@RestController
public class TbInvSupplierControllerImpl implements TbInvSupplierController {
    private final TbInvSupplierService tbInvSupplierService;
    private final TbInvSupplierMapper tbInvSupplierMapper;

    public TbInvSupplierControllerImpl(TbInvSupplierService tbInvSupplierService, TbInvSupplierMapper tbInvSupplierMapper) {
        this.tbInvSupplierService = tbInvSupplierService;
        this.tbInvSupplierMapper = tbInvSupplierMapper;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TbInvSupplierDTO save(@RequestBody TbInvSupplierDTO tbInvSupplierDTO) {
        TbInvSupplier tbInvSupplier = tbInvSupplierMapper.asEntity(tbInvSupplierDTO);
        return tbInvSupplierMapper.asDTO(tbInvSupplierService.save(tbInvSupplier));
    }

    @Override
    @GetMapping("/{id}")
    public TbInvSupplierDTO findById(@PathVariable("id") Long id) {
        TbInvSupplier tbInvSupplier = tbInvSupplierService.findById(id).orElse(null);
        return tbInvSupplierMapper.asDTO(tbInvSupplier);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        tbInvSupplierService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<TbInvSupplierDTO> list() {
        return tbInvSupplierMapper.asDTOList(tbInvSupplierService.findAll());
    }

    @Override
    @GetMapping("/page-query")
    public Page<TbInvSupplierDTO> pageQuery(Pageable pageable) {
        Page<TbInvSupplier> tbInvSupplierPage = tbInvSupplierService.findAll(pageable);
        List<TbInvSupplierDTO> dtoList = tbInvSupplierPage
                .stream()
                .map(tbInvSupplierMapper::asDTO).collect(Collectors.toList());
        return new PageImpl<>(dtoList, pageable, tbInvSupplierPage.getTotalElements());
    }

    @Override
    @PutMapping("/{id}")
    public TbInvSupplierDTO update(@RequestBody TbInvSupplierDTO tbInvSupplierDTO, @PathVariable("id") Long id) {
        TbInvSupplier tbInvSupplier = tbInvSupplierMapper.asEntity(tbInvSupplierDTO);
        return tbInvSupplierMapper.asDTO(tbInvSupplierService.update(tbInvSupplier, id));
    }
}