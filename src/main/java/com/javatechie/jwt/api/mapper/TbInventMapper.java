package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInventDTO;
import com.javatechie.jwt.api.entity.TbInvent;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TbInventMapper extends GenericMapper<TbInvent, TbInventDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    TbInvent asEntity(TbInventDTO dto);
}