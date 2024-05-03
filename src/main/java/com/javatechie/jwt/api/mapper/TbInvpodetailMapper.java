package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInvpodetailDTO;
import com.javatechie.jwt.api.entity.TbInvpodetail;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TbInvpodetailMapper extends GenericMapper<TbInvpodetail, TbInvpodetailDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    TbInvpodetail asEntity(TbInvpodetailDTO dto);
}