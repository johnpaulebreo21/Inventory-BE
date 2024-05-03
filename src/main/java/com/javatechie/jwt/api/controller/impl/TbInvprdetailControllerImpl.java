package com.javatechie.jwt.api.controller.impl;

import com.javatechie.jwt.api.controller.TbInvprdetailController;
import com.javatechie.jwt.api.dto.TbInvprdetailDTO;
import com.javatechie.jwt.api.entity.TbInvprdetail;
import com.javatechie.jwt.api.mapper.TbInvprdetailMapper;
import com.javatechie.jwt.api.service.TbInvprdetailService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("api/rest/tb-invprdetail")
@RestController
public class TbInvprdetailControllerImpl implements TbInvprdetailController {
    private final TbInvprdetailService tbInvprdetailService;
    private final TbInvprdetailMapper tbInvprdetailMapper;

    public TbInvprdetailControllerImpl(TbInvprdetailService tbInvprdetailService, TbInvprdetailMapper tbInvprdetailMapper) {
        this.tbInvprdetailService = tbInvprdetailService;
        this.tbInvprdetailMapper = tbInvprdetailMapper;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TbInvprdetailDTO save(@RequestBody TbInvprdetailDTO tbInvprdetailDTO) {
        TbInvprdetail tbInvprdetail = tbInvprdetailMapper.asEntity(tbInvprdetailDTO);
        return tbInvprdetailMapper.asDTO(tbInvprdetailService.save(tbInvprdetail));
    }

    @Override
    @GetMapping("/{id}")
    public TbInvprdetailDTO findById(@PathVariable("id") Long id) {
        TbInvprdetail tbInvprdetail = tbInvprdetailService.findById(id).orElse(null);
        return tbInvprdetailMapper.asDTO(tbInvprdetail);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        tbInvprdetailService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<TbInvprdetailDTO> list() {
        return tbInvprdetailMapper.asDTOList(tbInvprdetailService.findAll());
    }

    @Override
    @GetMapping("/page-query")
    public Page<TbInvprdetailDTO> pageQuery(Pageable pageable) {
        Page<TbInvprdetail> tbInvprdetailPage = tbInvprdetailService.findAll(pageable);
        List<TbInvprdetailDTO> dtoList = tbInvprdetailPage
                .stream()
                .map(tbInvprdetailMapper::asDTO).collect(Collectors.toList());
        return new PageImpl<>(dtoList, pageable, tbInvprdetailPage.getTotalElements());
    }

    @Override
    @PutMapping("/{id}")
    public TbInvprdetailDTO update(@RequestBody TbInvprdetailDTO tbInvprdetailDTO, @PathVariable("id") Long id) {
        TbInvprdetail tbInvprdetail = tbInvprdetailMapper.asEntity(tbInvprdetailDTO);
        return tbInvprdetailMapper.asDTO(tbInvprdetailService.update(tbInvprdetail, id));
    }
}