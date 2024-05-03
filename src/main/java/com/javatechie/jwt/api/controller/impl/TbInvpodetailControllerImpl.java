package com.javatechie.jwt.api.controller.impl;

import com.javatechie.jwt.api.controller.TbInvpodetailController;
import com.javatechie.jwt.api.dto.TbInvpodetailDTO;
import com.javatechie.jwt.api.entity.TbInvpodetail;
import com.javatechie.jwt.api.mapper.TbInvpodetailMapper;
import com.javatechie.jwt.api.service.TbInvpodetailService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("api/rest/tb-invpodetail")
@RestController
public class TbInvpodetailControllerImpl implements TbInvpodetailController {
    private final TbInvpodetailService tbInvpodetailService;
    private final TbInvpodetailMapper tbInvpodetailMapper;

    public TbInvpodetailControllerImpl(TbInvpodetailService tbInvpodetailService, TbInvpodetailMapper tbInvpodetailMapper) {
        this.tbInvpodetailService = tbInvpodetailService;
        this.tbInvpodetailMapper = tbInvpodetailMapper;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TbInvpodetailDTO save(@RequestBody TbInvpodetailDTO tbInvpodetailDTO) {
        TbInvpodetail tbInvpodetail = tbInvpodetailMapper.asEntity(tbInvpodetailDTO);
        return tbInvpodetailMapper.asDTO(tbInvpodetailService.save(tbInvpodetail));
    }

    @Override
    @GetMapping("/{id}")
    public TbInvpodetailDTO findById(@PathVariable("id") Long id) {
        TbInvpodetail tbInvpodetail = tbInvpodetailService.findById(id).orElse(null);
        return tbInvpodetailMapper.asDTO(tbInvpodetail);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        tbInvpodetailService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<TbInvpodetailDTO> list() {
        return tbInvpodetailMapper.asDTOList(tbInvpodetailService.findAll());
    }

    @Override
    @GetMapping("/page-query")
    public Page<TbInvpodetailDTO> pageQuery(Pageable pageable) {
        Page<TbInvpodetail> tbInvpodetailPage = tbInvpodetailService.findAll(pageable);
        List<TbInvpodetailDTO> dtoList = tbInvpodetailPage
                .stream()
                .map(tbInvpodetailMapper::asDTO).collect(Collectors.toList());
        return new PageImpl<>(dtoList, pageable, tbInvpodetailPage.getTotalElements());
    }

    @Override
    @PutMapping("/{id}")
    public TbInvpodetailDTO update(@RequestBody TbInvpodetailDTO tbInvpodetailDTO, @PathVariable("id") Long id) {
        TbInvpodetail tbInvpodetail = tbInvpodetailMapper.asEntity(tbInvpodetailDTO);
        return tbInvpodetailMapper.asDTO(tbInvpodetailService.update(tbInvpodetail, id));
    }
}