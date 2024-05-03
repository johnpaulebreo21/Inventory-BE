package com.javatechie.jwt.api.controller.impl;

import com.javatechie.jwt.api.controller.TbInvprheaderController;
import com.javatechie.jwt.api.dto.TbInvprheaderDTO;
import com.javatechie.jwt.api.entity.TbInvprheader;
import com.javatechie.jwt.api.mapper.TbInvprheaderMapper;
import com.javatechie.jwt.api.service.TbInvprheaderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("api/rest/tb-invprheader")
@RestController
public class TbInvprheaderControllerImpl implements TbInvprheaderController {
    private final TbInvprheaderService tbInvprheaderService;
    private final TbInvprheaderMapper tbInvprheaderMapper;

    public TbInvprheaderControllerImpl(TbInvprheaderService tbInvprheaderService, TbInvprheaderMapper tbInvprheaderMapper) {
        this.tbInvprheaderService = tbInvprheaderService;
        this.tbInvprheaderMapper = tbInvprheaderMapper;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TbInvprheaderDTO save(@RequestBody TbInvprheaderDTO tbInvprheaderDTO) {
        TbInvprheader tbInvprheader = tbInvprheaderMapper.asEntity(tbInvprheaderDTO);
        return tbInvprheaderMapper.asDTO(tbInvprheaderService.save(tbInvprheader));
    }

    @Override
    @GetMapping("/{id}")
    public TbInvprheaderDTO findById(@PathVariable("id") Long id) {
        TbInvprheader tbInvprheader = tbInvprheaderService.findById(id).orElse(null);
        return tbInvprheaderMapper.asDTO(tbInvprheader);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        tbInvprheaderService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<TbInvprheaderDTO> list() {
        return tbInvprheaderMapper.asDTOList(tbInvprheaderService.findAll());
    }

    @Override
    @GetMapping("/page-query")
    public Page<TbInvprheaderDTO> pageQuery(Pageable pageable) {
        Page<TbInvprheader> tbInvprheaderPage = tbInvprheaderService.findAll(pageable);
        List<TbInvprheaderDTO> dtoList = tbInvprheaderPage
                .stream()
                .map(tbInvprheaderMapper::asDTO).collect(Collectors.toList());
        return new PageImpl<>(dtoList, pageable, tbInvprheaderPage.getTotalElements());
    }

    @Override
    @PutMapping("/{id}")
    public TbInvprheaderDTO update(@RequestBody TbInvprheaderDTO tbInvprheaderDTO, @PathVariable("id") Long id) {
        TbInvprheader tbInvprheader = tbInvprheaderMapper.asEntity(tbInvprheaderDTO);
        return tbInvprheaderMapper.asDTO(tbInvprheaderService.update(tbInvprheader, id));
    }
}