package com.javatechie.jwt.api.controller.impl;

import com.javatechie.jwt.api.controller.TbInvpoheaderController;
import com.javatechie.jwt.api.dto.TbInvpoheaderDTO;
import com.javatechie.jwt.api.entity.TbInvpoheader;
import com.javatechie.jwt.api.mapper.TbInvpoheaderMapper;
import com.javatechie.jwt.api.service.TbInvpoheaderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("api/rest/tb-invpoheader")
@RestController
public class TbInvpoheaderControllerImpl implements TbInvpoheaderController {
    private final TbInvpoheaderService tbInvpoheaderService;
    private final TbInvpoheaderMapper tbInvpoheaderMapper;

    public TbInvpoheaderControllerImpl(TbInvpoheaderService tbInvpoheaderService, TbInvpoheaderMapper tbInvpoheaderMapper) {
        this.tbInvpoheaderService = tbInvpoheaderService;
        this.tbInvpoheaderMapper = tbInvpoheaderMapper;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TbInvpoheaderDTO save(@RequestBody TbInvpoheaderDTO tbInvpoheaderDTO) {
        TbInvpoheader tbInvpoheader = tbInvpoheaderMapper.asEntity(tbInvpoheaderDTO);
        return tbInvpoheaderMapper.asDTO(tbInvpoheaderService.save(tbInvpoheader));
    }

    @Override
    @GetMapping("/{id}")
    public TbInvpoheaderDTO findById(@PathVariable("id") Long id) {
        TbInvpoheader tbInvpoheader = tbInvpoheaderService.findById(id).orElse(null);
        return tbInvpoheaderMapper.asDTO(tbInvpoheader);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        tbInvpoheaderService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<TbInvpoheaderDTO> list() {
        return tbInvpoheaderMapper.asDTOList(tbInvpoheaderService.findAll());
    }

    @Override
    @GetMapping("/page-query")
    public Page<TbInvpoheaderDTO> pageQuery(Pageable pageable) {
        Page<TbInvpoheader> tbInvpoheaderPage = tbInvpoheaderService.findAll(pageable);
        List<TbInvpoheaderDTO> dtoList = tbInvpoheaderPage
                .stream()
                .map(tbInvpoheaderMapper::asDTO).collect(Collectors.toList());
        return new PageImpl<>(dtoList, pageable, tbInvpoheaderPage.getTotalElements());
    }

    @Override
    @PutMapping("/{id}")
    public TbInvpoheaderDTO update(@RequestBody TbInvpoheaderDTO tbInvpoheaderDTO, @PathVariable("id") Long id) {
        TbInvpoheader tbInvpoheader = tbInvpoheaderMapper.asEntity(tbInvpoheaderDTO);
        return tbInvpoheaderMapper.asDTO(tbInvpoheaderService.update(tbInvpoheader, id));
    }
}