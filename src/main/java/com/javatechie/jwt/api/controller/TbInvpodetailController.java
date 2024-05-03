package com.javatechie.jwt.api.controller;

import com.javatechie.jwt.api.dto.TbInvpodetailDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Api(tags = "TbInvpodetail API")
public interface TbInvpodetailController {
    @ApiOperation("Add new data")
    public TbInvpodetailDTO save(@RequestBody TbInvpodetailDTO tbInvpodetail);

    @ApiOperation("Find by Id")
    public TbInvpodetailDTO findById(@PathVariable("id") Long id);

    @ApiOperation("Delete based on primary key")
    public void delete(@PathVariable("id") Long id);

    @ApiOperation("Find all data")
    public List<TbInvpodetailDTO> list();

    @ApiOperation("Pagination request")
    public Page<TbInvpodetailDTO> pageQuery(Pageable pageable);

    @ApiOperation("Update one data")
    public TbInvpodetailDTO update(@RequestBody TbInvpodetailDTO dto, @PathVariable("id") Long id);
}