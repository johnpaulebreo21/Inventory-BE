package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInvrrdetailDTO;
import com.javatechie.jwt.api.entity.TbInvrrdetail;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TbInvrrdetailMapper extends GenericMapper<TbInvrrdetail, TbInvrrdetailDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    TbInvrrdetail asEntity(TbInvrrdetailDTO dto);
}