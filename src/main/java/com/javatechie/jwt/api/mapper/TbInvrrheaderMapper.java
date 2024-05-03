package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInvrrheaderDTO;
import com.javatechie.jwt.api.entity.TbInvrrheader;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TbInvrrheaderMapper extends GenericMapper<TbInvrrheader, TbInvrrheaderDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    TbInvrrheader asEntity(TbInvrrheaderDTO dto);
}