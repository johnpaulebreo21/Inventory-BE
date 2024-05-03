package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInvLocationDTO;
import com.javatechie.jwt.api.entity.TbInvLocation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TbInvLocationMapper extends GenericMapper<TbInvLocation, TbInvLocationDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    TbInvLocation asEntity(TbInvLocationDTO dto);
}