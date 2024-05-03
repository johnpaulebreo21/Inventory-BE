package com.javatechie.jwt.api.controller.impl;

import com.javatechie.jwt.api.controller.TbInventController;
import com.javatechie.jwt.api.dto.TbInventDTO;
import com.javatechie.jwt.api.entity.TbInvent;
import com.javatechie.jwt.api.mapper.TbInventMapper;
import com.javatechie.jwt.api.service.TbInventService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("/api/rest/tb-invent")
@RestController
public class TbInventControllerImpl implements TbInventController {
    private final TbInventService tbInventService;
    private final TbInventMapper tbInventMapper;

    public TbInventControllerImpl(TbInventService tbInventService, TbInventMapper tbInventMapper) {
        this.tbInventService = tbInventService;
        this.tbInventMapper = tbInventMapper;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TbInventDTO save(@RequestBody TbInventDTO tbInventDTO) {
        TbInvent tbInvent = tbInventMapper.asEntity(tbInventDTO);
        return tbInventMapper.asDTO(tbInventService.save(tbInvent));
    }

    @Override
    @GetMapping("/{id}")
    public TbInventDTO findById(@PathVariable("id") Long id) {
        TbInvent tbInvent = tbInventService.findById(id).orElse(null);
        return tbInventMapper.asDTO(tbInvent);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        tbInventService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<TbInventDTO> list() {
        return tbInventMapper.asDTOList(tbInventService.findAll());
    }

    @Override
    @GetMapping("/page-query")
    public Page<TbInventDTO> pageQuery(Pageable pageable) {
        Page<TbInvent> tbInventPage = tbInventService.findAll(pageable);
        List<TbInventDTO> dtoList = tbInventPage
                .stream()
                .map(tbInventMapper::asDTO).collect(Collectors.toList());
        return new PageImpl<>(dtoList, pageable, tbInventPage.getTotalElements());
    }

    @Override
    @PutMapping("/{id}")
    public TbInventDTO update(@RequestBody TbInventDTO tbInventDTO, @PathVariable("id") Long id) {
        TbInvent tbInvent = tbInventMapper.asEntity(tbInventDTO);
        return tbInventMapper.asDTO(tbInventService.update(tbInvent, id));
    }
}