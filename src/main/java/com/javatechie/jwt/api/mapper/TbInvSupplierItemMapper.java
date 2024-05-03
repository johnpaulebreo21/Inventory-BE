package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInvSupplierItemDTO;
import com.javatechie.jwt.api.entity.TbInvSupplierItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TbInvSupplierItemMapper extends GenericMapper<TbInvSupplierItem, TbInvSupplierItemDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    TbInvSupplierItem asEntity(TbInvSupplierItemDTO dto);
}