package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInvprdetailDTO;
import com.javatechie.jwt.api.entity.TbInvprdetail;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TbInvprdetailMapper extends GenericMapper<TbInvprdetail, TbInvprdetailDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    TbInvprdetail asEntity(TbInvprdetailDTO dto);
}