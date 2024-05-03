package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInvrrheaderDTO;
import com.javatechie.jwt.api.entity.TbInvrrheader;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-28T15:33:02+0800",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class TbInvrrheaderMapperImpl implements TbInvrrheaderMapper {

    @Override
    public TbInvrrheaderDTO asDTO(TbInvrrheader entity) {
        if ( entity == null ) {
            return null;
        }

        TbInvrrheaderDTO tbInvrrheaderDTO = new TbInvrrheaderDTO();

        tbInvrrheaderDTO.setId( entity.getId() );

        return tbInvrrheaderDTO;
    }

    @Override
    public List<TbInvrrheader> asEntityList(List<TbInvrrheaderDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TbInvrrheader> list = new ArrayList<TbInvrrheader>( dtoList.size() );
        for ( TbInvrrheaderDTO tbInvrrheaderDTO : dtoList ) {
            list.add( asEntity( tbInvrrheaderDTO ) );
        }

        return list;
    }

    @Override
    public List<TbInvrrheaderDTO> asDTOList(List<TbInvrrheader> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TbInvrrheaderDTO> list = new ArrayList<TbInvrrheaderDTO>( entityList.size() );
        for ( TbInvrrheader tbInvrrheader : entityList ) {
            list.add( asDTO( tbInvrrheader ) );
        }

        return list;
    }

    @Override
    public TbInvrrheader asEntity(TbInvrrheaderDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TbInvrrheader tbInvrrheader = new TbInvrrheader();

        tbInvrrheader.setId( dto.getId() );

        return tbInvrrheader;
    }
}
