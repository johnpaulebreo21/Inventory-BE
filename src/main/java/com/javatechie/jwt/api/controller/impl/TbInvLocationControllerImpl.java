package com.javatechie.jwt.api.controller.impl;

import com.javatechie.jwt.api.controller.TbInvLocationController;
import com.javatechie.jwt.api.dto.TbInvLocationDTO;
import com.javatechie.jwt.api.entity.TbInvLocation;
import com.javatechie.jwt.api.mapper.TbInvLocationMapper;
import com.javatechie.jwt.api.service.TbInvLocationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RequestMapping("api/rest/tb-inv-location")
@RestController
public class TbInvLocationControllerImpl implements TbInvLocationController {
    private final TbInvLocationService tbInvLocationService;
    private final TbInvLocationMapper tbInvLocationMapper;

    public TbInvLocationControllerImpl(TbInvLocationService tbInvLocationService, TbInvLocationMapper tbInvLocationMapper) {
        this.tbInvLocationService = tbInvLocationService;
        this.tbInvLocationMapper = tbInvLocationMapper;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TbInvLocationDTO save(@RequestBody TbInvLocationDTO tbInvLocationDTO) {
        TbInvLocation tbInvLocation = tbInvLocationMapper.asEntity(tbInvLocationDTO);
        return tbInvLocationMapper.asDTO(tbInvLocationService.save(tbInvLocation));
    }

    @Override
    @GetMapping("/{id}")
    public TbInvLocationDTO findById(@PathVariable("id") Long id) {
        TbInvLocation tbInvLocation = tbInvLocationService.findById(id).orElse(null);
        return tbInvLocationMapper.asDTO(tbInvLocation);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        tbInvLocationService.deleteById(id);
    }

    @Override
    @GetMapping
    public List<TbInvLocationDTO> list() {
        return tbInvLocationMapper.asDTOList(tbInvLocationService.findAll());
    }

    @Override
    @GetMapping("/page-query")
    public Page<TbInvLocationDTO> pageQuery(Pageable pageable) {
        Page<TbInvLocation> tbInvLocationPage = tbInvLocationService.findAll(pageable);
        List<TbInvLocationDTO> dtoList = tbInvLocationPage
                .stream()
                .map(tbInvLocationMapper::asDTO).collect(Collectors.toList());
        return new PageImpl<>(dtoList, pageable, tbInvLocationPage.getTotalElements());
    }

    @Override
    @PutMapping("/{id}")
    public TbInvLocationDTO update(@RequestBody TbInvLocationDTO tbInvLocationDTO, @PathVariable("id") Long id) {
        TbInvLocation tbInvLocation = tbInvLocationMapper.asEntity(tbInvLocationDTO);
        return tbInvLocationMapper.asDTO(tbInvLocationService.update(tbInvLocation, id));
    }
}