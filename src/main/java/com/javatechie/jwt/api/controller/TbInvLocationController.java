package com.javatechie.jwt.api.controller;

import com.javatechie.jwt.api.dto.TbInvLocationDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "TbInvLocation API")
public interface TbInvLocationController {
    @ApiOperation("Add new data")
    public TbInvLocationDTO save(@RequestBody TbInvLocationDTO tbInvLocation);

    @ApiOperation("Find by Id")
    public TbInvLocationDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete based on primary key")
    public void delete(@PathVariable("id") Long id);

    @ApiOperation("Find all data")
    public List<TbInvLocationDTO> list();

    @ApiOperation("Pagination request")
    public Page<TbInvLocationDTO> pageQuery(Pageable pageable);

    @ApiOperation("Update one data")
    public TbInvLocationDTO update(@RequestBody TbInvLocationDTO dto, @PathVariable("id") Long id);
}