package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInvprheaderDTO;
import com.javatechie.jwt.api.entity.TbInvprheader;
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
public class TbInvprheaderMapperImpl implements TbInvprheaderMapper {

    @Override
    public TbInvprheaderDTO asDTO(TbInvprheader entity) {
        if ( entity == null ) {
            return null;
        }

        TbInvprheaderDTO tbInvprheaderDTO = new TbInvprheaderDTO();

        tbInvprheaderDTO.setId( entity.getId() );

        return tbInvprheaderDTO;
    }

    @Override
    public List<TbInvprheader> asEntityList(List<TbInvprheaderDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TbInvprheader> list = new ArrayList<TbInvprheader>( dtoList.size() );
        for ( TbInvprheaderDTO tbInvprheaderDTO : dtoList ) {
            list.add( asEntity( tbInvprheaderDTO ) );
        }

        return list;
    }

    @Override
    public List<TbInvprheaderDTO> asDTOList(List<TbInvprheader> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TbInvprheaderDTO> list = new ArrayList<TbInvprheaderDTO>( entityList.size() );
        for ( TbInvprheader tbInvprheader : entityList ) {
            list.add( asDTO( tbInvprheader ) );
        }

        return list;
    }

    @Override
    public TbInvprheader asEntity(TbInvprheaderDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TbInvprheader tbInvprheader = new TbInvprheader();

        tbInvprheader.setId( dto.getId() );

        return tbInvprheader;
    }
}
