package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInvMasterDTO;
import com.javatechie.jwt.api.entity.TbInvMaster;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-28T15:33:03+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class TbInvMasterMapperImpl implements TbInvMasterMapper {

    @Override
    public TbInvMasterDTO asDTO(TbInvMaster entity) {
        if ( entity == null ) {
            return null;
        }

        TbInvMasterDTO tbInvMasterDTO = new TbInvMasterDTO();

        tbInvMasterDTO.setId( entity.getId() );
        tbInvMasterDTO.setItemDesc( entity.getItemDesc() );
        tbInvMasterDTO.setItemName( entity.getItemName() );
        tbInvMasterDTO.setStatus( entity.getStatus() );
        tbInvMasterDTO.setUnitPrice( entity.getUnitPrice() );

        return tbInvMasterDTO;
    }

    @Override
    public List<TbInvMaster> asEntityList(List<TbInvMasterDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TbInvMaster> list = new ArrayList<TbInvMaster>( dtoList.size() );
        for ( TbInvMasterDTO tbInvMasterDTO : dtoList ) {
            list.add( asEntity( tbInvMasterDTO ) );
        }

        return list;
    }

    @Override
    public List<TbInvMasterDTO> asDTOList(List<TbInvMaster> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TbInvMasterDTO> list = new ArrayList<TbInvMasterDTO>( entityList.size() );
        for ( TbInvMaster tbInvMaster : entityList ) {
            list.add( asDTO( tbInvMaster ) );
        }

        return list;
    }

    @Override
    public TbInvMaster asEntity(TbInvMasterDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TbInvMaster tbInvMaster = new TbInvMaster();

        tbInvMaster.setId( dto.getId() );
        tbInvMaster.setItemDesc( dto.getItemDesc() );
        tbInvMaster.setItemName( dto.getItemName() );
        tbInvMaster.setStatus( dto.getStatus() );
        tbInvMaster.setUnitPrice( dto.getUnitPrice() );

        return tbInvMaster;
    }
}
