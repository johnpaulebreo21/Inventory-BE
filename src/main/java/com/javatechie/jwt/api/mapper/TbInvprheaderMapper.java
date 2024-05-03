package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInvprheaderDTO;
import com.javatechie.jwt.api.entity.TbInvprheader;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TbInvprheaderMapper extends GenericMapper<TbInvprheader, TbInvprheaderDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    TbInvprheader asEntity(TbInvprheaderDTO dto);
}