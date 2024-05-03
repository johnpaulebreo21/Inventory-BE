package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInvSupplierDTO;
import com.javatechie.jwt.api.entity.TbInvSupplier;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TbInvSupplierMapper extends GenericMapper<TbInvSupplier, TbInvSupplierDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    TbInvSupplier asEntity(TbInvSupplierDTO dto);
}