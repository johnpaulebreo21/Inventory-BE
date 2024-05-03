package com.javatechie.jwt.api.controller;

import com.javatechie.jwt.api.dto.TbInvSupplierItemDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "TbInvSupplierItem API")
public interface TbInvSupplierItemController {
    @ApiOperation("Add new data")
    public TbInvSupplierItemDTO save(@RequestBody TbInvSupplierItemDTO tbInvSupplierItem);

    @ApiOperation("Find by Id")
    public TbInvSupplierItemDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete based on primary key")
    public void delete(@PathVariable("id") Long id);

    @ApiOperation("Find all data")
    public List<TbInvSupplierItemDTO> list();

    @ApiOperation("Pagination request")
    public Page<TbInvSupplierItemDTO> pageQuery(Pageable pageable);

    @ApiOperation("Update one data")
    public TbInvSupplierItemDTO update(@RequestBody TbInvSupplierItemDTO dto, @PathVariable("id") Long id);
}