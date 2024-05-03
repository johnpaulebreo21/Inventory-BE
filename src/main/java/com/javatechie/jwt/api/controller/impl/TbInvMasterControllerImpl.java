package com.javatechie.jwt.api.controller.impl;

import com.javatechie.jwt.api.controller.TbInvMasterController;
import com.javatechie.jwt.api.dto.TbInvMasterDTO;
import com.javatechie.jwt.api.entity.TbInvMaster;
import com.javatechie.jwt.api.mapper.TbInvMasterMapper;
import com.javatechie.jwt.api.service.TbInvMasterService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("api/rest/tb-inv-master")
public class TbInvMasterControllerImpl implements TbInvMasterController {
    private final TbInvMasterService tbInvMasterService;
    private final TbInvMasterMapper tbInvMasterMapper;

    public TbInvMasterControllerImpl(TbInvMasterService tbInvMasterService, TbInvMasterMapper tbInvMasterMapper) {
        this.tbInvMasterService = tbInvMasterService;
        this.tbInvMasterMapper = tbInvMasterMapper;
    }

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TbInvMasterDTO save(@RequestBody TbInvMasterDTO tbInvMasterDTO) {
        TbInvMaster tbInvMaster = tbInvMasterMapper.asEntity(tbInvMasterDTO);
        return tbInvMasterMapper.asDTO(tbInvMasterService.save(tbInvMaster));
    }

    @Override
    @GetMapping("/{id}")
    public TbInvMasterDTO findById(@PathVariable("id") Long id) {
        TbInvMaster tbInvMaster = tbInvMasterService.findById(id).orElse(null);
        return tbInvMasterMapper.asDTO(tbInvMaster);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        tbInvMasterService.deleteById(id);
    }

    @Override
    @GetMapping
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    public List<TbInvMasterDTO> list() {
        return tbInvMasterMapper.asDTOList(tbInvMasterService.findAll());
    }

    @Override
    @GetMapping("/page-query")
    public Page<TbInvMasterDTO> pageQuery(Pageable pageable) {
        Page<TbInvMaster> tbInvMasterPage = tbInvMasterService.findAll(pageable);
        List<TbInvMasterDTO> dtoList = tbInvMasterPage
                .stream()
                .map(tbInvMasterMapper::asDTO).collect(Collectors.toList());
        return new PageImpl<>(dtoList, pageable, tbInvMasterPage.getTotalElements());
    }

    @Override
    @PutMapping("/{id}")
    public TbInvMasterDTO update(@RequestBody TbInvMasterDTO tbInvMasterDTO, @PathVariable("id") Long id) {
        TbInvMaster tbInvMaster = tbInvMasterMapper.asEntity(tbInvMasterDTO);
        return tbInvMasterMapper.asDTO(tbInvMasterService.update(tbInvMaster, id));
    }
}