package com.javatechie.jwt.api.controller.impl;

import com.javatechie.jwt.api.controller.TbInvrrheaderController;
import com.javatechie.jwt.api.dto.TbInvrrheaderDTO;
import com.javatechie.jwt.api.entity.TbInvrrheader;
import com.javatechie.jwt.api.mapper.TbInvrrheaderMapper;
import com.javatechie.jwt.api.service.TbInvrrheaderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("api/rest/tb-invrrheader")
@RestController
public class TbInvrrheaderControllerImpl implements TbInvrrheaderController {
    private final TbInvrrheaderService tbInvrrheaderService;
    private final TbInvrrheaderMapper tbInvrrheaderMapper;

    public TbInvrrheaderControllerImpl(TbInvrrheaderService tbInvrrheaderService, TbInvrrheaderMapper tbInvrrheaderMapper) {
        this.tbInvrrheaderService = tbInvrrheaderService;
        this.tbInvrrheaderMapper = tbInvrrheaderMapper;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TbInvrrheaderDTO save(@RequestBody TbInvrrheaderDTO tbInvrrheaderDTO) {
        TbInvrrheader tbInvrrheader = tbInvrrheaderMapper.asEntity(tbInvrrheaderDTO);
        return tbInvrrheaderMapper.asDTO(tbInvrrheaderService.save(tbInvrrheader));
    }

    @Override
    @GetMapping("/{id}")
    public TbInvrrheaderDTO findById(@PathVariable("id") Long id) {
        TbInvrrheader tbInvrrheader = tbInvrrheaderService.findById(id).orElse(null);
        return tbInvrrheaderMapper.asDTO(tbInvrrheader);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        tbInvrrheaderService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<TbInvrrheaderDTO> list() {
        return tbInvrrheaderMapper.asDTOList(tbInvrrheaderService.findAll());
    }

    @Override
    @GetMapping("/page-query")
    public Page<TbInvrrheaderDTO> pageQuery(Pageable pageable) {
        Page<TbInvrrheader> tbInvrrheaderPage = tbInvrrheaderService.findAll(pageable);
        List<TbInvrrheaderDTO> dtoList = tbInvrrheaderPage
                .stream()
                .map(tbInvrrheaderMapper::asDTO).collect(Collectors.toList());
        return new PageImpl<>(dtoList, pageable, tbInvrrheaderPage.getTotalElements());
    }

    @Override
    @PutMapping("/{id}")
    public TbInvrrheaderDTO update(@RequestBody TbInvrrheaderDTO tbInvrrheaderDTO, @PathVariable("id") Long id) {
        TbInvrrheader tbInvrrheader = tbInvrrheaderMapper.asEntity(tbInvrrheaderDTO);
        return tbInvrrheaderMapper.asDTO(tbInvrrheaderService.update(tbInvrrheader, id));
    }
}