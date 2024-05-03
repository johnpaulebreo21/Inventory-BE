package com.javatechie.jwt.api.controller.impl;

import com.javatechie.jwt.api.controller.TbInvrrdetailController;
import com.javatechie.jwt.api.dto.TbInvrrdetailDTO;
import com.javatechie.jwt.api.entity.TbInvrrdetail;
import com.javatechie.jwt.api.mapper.TbInvrrdetailMapper;
import com.javatechie.jwt.api.service.TbInvrrdetailService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("api/rest/tb-invrrdetail")
@RestController
public class TbInvrrdetailControllerImpl implements TbInvrrdetailController {
    private final TbInvrrdetailService tbInvrrdetailService;
    private final TbInvrrdetailMapper tbInvrrdetailMapper;

    public TbInvrrdetailControllerImpl(TbInvrrdetailService tbInvrrdetailService, TbInvrrdetailMapper tbInvrrdetailMapper) {
        this.tbInvrrdetailService = tbInvrrdetailService;
        this.tbInvrrdetailMapper = tbInvrrdetailMapper;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TbInvrrdetailDTO save(@RequestBody TbInvrrdetailDTO tbInvrrdetailDTO) {
        TbInvrrdetail tbInvrrdetail = tbInvrrdetailMapper.asEntity(tbInvrrdetailDTO);
        return tbInvrrdetailMapper.asDTO(tbInvrrdetailService.save(tbInvrrdetail));
    }

    @Override
    @GetMapping("/{id}")
    public TbInvrrdetailDTO findById(@PathVariable("id") Long id) {
        TbInvrrdetail tbInvrrdetail = tbInvrrdetailService.findById(id).orElse(null);
        return tbInvrrdetailMapper.asDTO(tbInvrrdetail);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        tbInvrrdetailService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<TbInvrrdetailDTO> list() {
        return tbInvrrdetailMapper.asDTOList(tbInvrrdetailService.findAll());
    }

    @Override
    @GetMapping("/page-query")
    public Page<TbInvrrdetailDTO> pageQuery(Pageable pageable) {
        Page<TbInvrrdetail> tbInvrrdetailPage = tbInvrrdetailService.findAll(pageable);
        List<TbInvrrdetailDTO> dtoList = tbInvrrdetailPage
                .stream()
                .map(tbInvrrdetailMapper::asDTO).collect(Collectors.toList());
        return new PageImpl<>(dtoList, pageable, tbInvrrdetailPage.getTotalElements());
    }

    @Override
    @PutMapping("/{id}")
    public TbInvrrdetailDTO update(@RequestBody TbInvrrdetailDTO tbInvrrdetailDTO, @PathVariable("id") Long id) {
        TbInvrrdetail tbInvrrdetail = tbInvrrdetailMapper.asEntity(tbInvrrdetailDTO);
        return tbInvrrdetailMapper.asDTO(tbInvrrdetailService.update(tbInvrrdetail, id));
    }
}