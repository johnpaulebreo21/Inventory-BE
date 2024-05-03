package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInvpoheaderDTO;
import com.javatechie.jwt.api.entity.TbInvpoheader;
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
public class TbInvpoheaderMapperImpl implements TbInvpoheaderMapper {

    @Override
    public TbInvpoheaderDTO asDTO(TbInvpoheader entity) {
        if ( entity == null ) {
            return null;
        }

        TbInvpoheaderDTO tbInvpoheaderDTO = new TbInvpoheaderDTO();

        tbInvpoheaderDTO.setId( entity.getId() );
        tbInvpoheaderDTO.setSupplierId( entity.getSupplierId() );

        return tbInvpoheaderDTO;
    }

    @Override
    public List<TbInvpoheader> asEntityList(List<TbInvpoheaderDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TbInvpoheader> list = new ArrayList<TbInvpoheader>( dtoList.size() );
        for ( TbInvpoheaderDTO tbInvpoheaderDTO : dtoList ) {
            list.add( asEntity( tbInvpoheaderDTO ) );
        }

        return list;
    }

    @Override
    public List<TbInvpoheaderDTO> asDTOList(List<TbInvpoheader> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TbInvpoheaderDTO> list = new ArrayList<TbInvpoheaderDTO>( entityList.size() );
        for ( TbInvpoheader tbInvpoheader : entityList ) {
            list.add( asDTO( tbInvpoheader ) );
        }

        return list;
    }

    @Override
    public TbInvpoheader asEntity(TbInvpoheaderDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TbInvpoheader tbInvpoheader = new TbInvpoheader();

        tbInvpoheader.setId( dto.getId() );
        tbInvpoheader.setSupplierId( dto.getSupplierId() );

        return tbInvpoheader;
    }
}
