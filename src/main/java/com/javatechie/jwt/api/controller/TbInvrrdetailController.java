package com.javatechie.jwt.api.controller;

import com.javatechie.jwt.api.dto.TbInvrrdetailDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "TbInvrrdetail API")
public interface TbInvrrdetailController {
    @ApiOperation("Add new data")
    public TbInvrrdetailDTO save(@RequestBody TbInvrrdetailDTO tbInvrrdetail);

    @ApiOperation("Find by Id")
    public TbInvrrdetailDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete based on primary key")
    public void delete(@PathVariable("id") Long id);

    @ApiOperation("Find all data")
    public List<TbInvrrdetailDTO> list();

    @ApiOperation("Pagination request")
    public Page<TbInvrrdetailDTO> pageQuery(Pageable pageable);

    @ApiOperation("Update one data")
    public TbInvrrdetailDTO update(@RequestBody TbInvrrdetailDTO dto, @PathVariable("id") Long id);
}