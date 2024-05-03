package com.javatechie.jwt.api.controller;

import com.javatechie.jwt.api.dto.TbInvSupplierDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "TbInvSupplier API")
public interface TbInvSupplierController {
    @ApiOperation("Add new data")
    public TbInvSupplierDTO save(@RequestBody TbInvSupplierDTO tbInvSupplier);

    @ApiOperation("Find by Id")
    public TbInvSupplierDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete based on primary key")
    public void delete(@PathVariable("id") Long id);

    @ApiOperation("Find all data")
    public List<TbInvSupplierDTO> list();

    @ApiOperation("Pagination request")
    public Page<TbInvSupplierDTO> pageQuery(Pageable pageable);

    @ApiOperation("Update one data")
    public TbInvSupplierDTO update(@RequestBody TbInvSupplierDTO dto, @PathVariable("id") Long id);
}