package com.javatechie.jwt.api.controller;

import com.javatechie.jwt.api.dto.TbInvMasterDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "TbInvMaster API")
public interface TbInvMasterController {
    @ApiOperation("Add new data")
    public TbInvMasterDTO save(@RequestBody TbInvMasterDTO tbInvMaster);

    @ApiOperation("Find by Id")
    public TbInvMasterDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete based on primary key")
    public void delete(@PathVariable("id") Long id);

    @ApiOperation("Find all data")
    public List<TbInvMasterDTO> list();

    @ApiOperation("Pagination request")
    public Page<TbInvMasterDTO> pageQuery(Pageable pageable);

    @ApiOperation("Update one data")
    public TbInvMasterDTO update(@RequestBody TbInvMasterDTO dto, @PathVariable("id") Long id);
}