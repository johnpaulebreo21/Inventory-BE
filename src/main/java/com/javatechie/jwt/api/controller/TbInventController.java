package com.javatechie.jwt.api.controller;

import com.javatechie.jwt.api.dto.TbInventDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "TbInvent API")
public interface TbInventController {
    @ApiOperation("Add new data")
    public TbInventDTO save(@RequestBody TbInventDTO tbInvent);

    @ApiOperation("Find by Id")
    public TbInventDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete based on primary key")
    public void delete(@PathVariable("id") Long id);

    @ApiOperation("Find all data")
    public List<TbInventDTO> list();

    @ApiOperation("Pagination request")
    public Page<TbInventDTO> pageQuery(Pageable pageable);

    @ApiOperation("Update one data")
    public TbInventDTO update(@RequestBody TbInventDTO dto, @PathVariable("id") Long id);
}