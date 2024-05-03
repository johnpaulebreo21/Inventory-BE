package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInvLocationDTO;
import com.javatechie.jwt.api.entity.TbInvLocation;
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
public class TbInvLocationMapperImpl implements TbInvLocationMapper {

    @Override
    public TbInvLocationDTO asDTO(TbInvLocation entity) {
        if ( entity == null ) {
            return null;
        }

        TbInvLocationDTO tbInvLocationDTO = new TbInvLocationDTO();

        tbInvLocationDTO.setId( entity.getId() );
        tbInvLocationDTO.setLocationName( entity.getLocationName() );
        tbInvLocationDTO.setStatus( entity.getStatus() );

        return tbInvLocationDTO;
    }

    @Override
    public List<TbInvLocation> asEntityList(List<TbInvLocationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TbInvLocation> list = new ArrayList<TbInvLocation>( dtoList.size() );
        for ( TbInvLocationDTO tbInvLocationDTO : dtoList ) {
            list.add( asEntity( tbInvLocationDTO ) );
        }

        return list;
    }

    @Override
    public List<TbInvLocationDTO> asDTOList(List<TbInvLocation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TbInvLocationDTO> list = new ArrayList<TbInvLocationDTO>( entityList.size() );
        for ( TbInvLocation tbInvLocation : entityList ) {
            list.add( asDTO( tbInvLocation ) );
        }

        return list;
    }

    @Override
    public TbInvLocation asEntity(TbInvLocationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TbInvLocation tbInvLocation = new TbInvLocation();

        tbInvLocation.setId( dto.getId() );
        tbInvLocation.setLocationName( dto.getLocationName() );
        tbInvLocation.setStatus( dto.getStatus() );

        return tbInvLocation;
    }
}
