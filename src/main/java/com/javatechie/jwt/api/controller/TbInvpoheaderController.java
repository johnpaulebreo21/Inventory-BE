package com.javatechie.jwt.api.controller;

import com.javatechie.jwt.api.dto.TbInvpoheaderDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "TbInvpoheader API")
public interface TbInvpoheaderController {
    @ApiOperation("Add new data")
    public TbInvpoheaderDTO save(@RequestBody TbInvpoheaderDTO tbInvpoheader);

    @ApiOperation("Find by Id")
    public TbInvpoheaderDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete based on primary key")
    public void delete(@PathVariable("id") Long id);

    @ApiOperation("Find all data")
    public List<TbInvpoheaderDTO> list();

    @ApiOperation("Pagination request")
    public Page<TbInvpoheaderDTO> pageQuery(Pageable pageable);

    @ApiOperation("Update one data")
    public TbInvpoheaderDTO update(@RequestBody TbInvpoheaderDTO dto, @PathVariable("id") Long id);
}