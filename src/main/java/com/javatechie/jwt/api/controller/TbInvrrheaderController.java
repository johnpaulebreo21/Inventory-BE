package com.javatechie.jwt.api.controller;

import com.javatechie.jwt.api.dto.TbInvrrheaderDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "TbInvrrheader API")
public interface TbInvrrheaderController {
    @ApiOperation("Add new data")
    public TbInvrrheaderDTO save(@RequestBody TbInvrrheaderDTO tbInvrrheader);

    @ApiOperation("Find by Id")
    public TbInvrrheaderDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete based on primary key")
    public void delete(@PathVariable("id") Long id);

    @ApiOperation("Find all data")
    public List<TbInvrrheaderDTO> list();

    @ApiOperation("Pagination request")
    public Page<TbInvrrheaderDTO> pageQuery(Pageable pageable);

    @ApiOperation("Update one data")
    public TbInvrrheaderDTO update(@RequestBody TbInvrrheaderDTO dto, @PathVariable("id") Long id);
}