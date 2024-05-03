package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInvMasterDTO;
import com.javatechie.jwt.api.entity.TbInvMaster;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TbInvMasterMapper extends GenericMapper<TbInvMaster, TbInvMasterDTO> {
    @Override
    @Mapping(target = "id", ignore = false)
    TbInvMaster asEntity(TbInvMasterDTO dto);
}