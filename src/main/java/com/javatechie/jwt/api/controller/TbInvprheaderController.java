package com.javatechie.jwt.api.controller;

import com.javatechie.jwt.api.dto.TbInvprheaderDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "TbInvprheader API")
public interface TbInvprheaderController {
    @ApiOperation("Add new data")
    public TbInvprheaderDTO save(@RequestBody TbInvprheaderDTO tbInvprheader);

    @ApiOperation("Find by Id")
    public TbInvprheaderDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete based on primary key")
    public void delete(@PathVariable("id") Long id);

    @ApiOperation("Find all data")
    public List<TbInvprheaderDTO> list();

    @ApiOperation("Pagination request")
    public Page<TbInvprheaderDTO> pageQuery(Pageable pageable);

    @ApiOperation("Update one data")
    public TbInvprheaderDTO update(@RequestBody TbInvprheaderDTO dto, @PathVariable("id") Long id);
}