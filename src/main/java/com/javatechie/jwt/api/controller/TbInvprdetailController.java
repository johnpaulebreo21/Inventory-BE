package com.javatechie.jwt.api.controller;

import com.javatechie.jwt.api.dto.TbInvprdetailDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "TbInvprdetail API")
public interface TbInvprdetailController {
    @ApiOperation("Add new data")
    public TbInvprdetailDTO save(@RequestBody TbInvprdetailDTO tbInvprdetail);

    @ApiOperation("Find by Id")
    public TbInvprdetailDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete based on primary key")
    public void delete(@PathVariable("id") Long id);

    @ApiOperation("Find all data")
    public List<TbInvprdetailDTO> list();

    @ApiOperation("Pagination request")
    public Page<TbInvprdetailDTO> pageQuery(Pageable pageable);

    @ApiOperation("Update one data")
    public TbInvprdetailDTO update(@RequestBody TbInvprdetailDTO dto, @PathVariable("id") Long id);
}