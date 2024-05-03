package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInvSupplierDTO;
import com.javatechie.jwt.api.entity.TbInvSupplier;
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
public class TbInvSupplierMapperImpl implements TbInvSupplierMapper {

    @Override
    public TbInvSupplierDTO asDTO(TbInvSupplier entity) {
        if ( entity == null ) {
            return null;
        }

        TbInvSupplierDTO tbInvSupplierDTO = new TbInvSupplierDTO();

        tbInvSupplierDTO.setId( entity.getId() );
        tbInvSupplierDTO.setStatus( entity.getStatus() );
        tbInvSupplierDTO.setSupplierAddress( entity.getSupplierAddress() );
        tbInvSupplierDTO.setSupplierName( entity.getSupplierName() );

        return tbInvSupplierDTO;
    }

    @Override
    public List<TbInvSupplier> asEntityList(List<TbInvSupplierDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TbInvSupplier> list = new ArrayList<TbInvSupplier>( dtoList.size() );
        for ( TbInvSupplierDTO tbInvSupplierDTO : dtoList ) {
            list.add( asEntity( tbInvSupplierDTO ) );
        }

        return list;
    }

    @Override
    public List<TbInvSupplierDTO> asDTOList(List<TbInvSupplier> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TbInvSupplierDTO> list = new ArrayList<TbInvSupplierDTO>( entityList.size() );
        for ( TbInvSupplier tbInvSupplier : entityList ) {
            list.add( asDTO( tbInvSupplier ) );
        }

        return list;
    }

    @Override
    public TbInvSupplier asEntity(TbInvSupplierDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TbInvSupplier tbInvSupplier = new TbInvSupplier();

        tbInvSupplier.setId( dto.getId() );
        tbInvSupplier.setStatus( dto.getStatus() );
        tbInvSupplier.setSupplierAddress( dto.getSupplierAddress() );
        tbInvSupplier.setSupplierName( dto.getSupplierName() );

        return tbInvSupplier;
    }
}
