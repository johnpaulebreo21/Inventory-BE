package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInvpoheaderDTO;
import com.javatechie.jwt.api.entity.TbInvpoheader;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TbInvpoheaderMapper extends GenericMapper<TbInvpoheader, TbInvpoheaderDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    TbInvpoheader asEntity(TbInvpoheaderDTO dto);
}