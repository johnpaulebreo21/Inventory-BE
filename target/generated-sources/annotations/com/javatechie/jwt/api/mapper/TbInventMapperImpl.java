package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInventDTO;
import com.javatechie.jwt.api.entity.TbInvent;
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
public class TbInventMapperImpl implements TbInventMapper {

    @Override
    public TbInventDTO asDTO(TbInvent entity) {
        if ( entity == null ) {
            return null;
        }

        TbInventDTO tbInventDTO = new TbInventDTO();

        tbInventDTO.setId( entity.getId() );
        tbInventDTO.setItemId( entity.getItemId() );
        tbInventDTO.setLocationId( entity.getLocationId() );
        tbInventDTO.setQuantity( entity.getQuantity() );

        return tbInventDTO;
    }

    @Override
    public List<TbInvent> asEntityList(List<TbInventDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TbInvent> list = new ArrayList<TbInvent>( dtoList.size() );
        for ( TbInventDTO tbInventDTO : dtoList ) {
            list.add( asEntity( tbInventDTO ) );
        }

        return list;
    }

    @Override
    public List<TbInventDTO> asDTOList(List<TbInvent> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TbInventDTO> list = new ArrayList<TbInventDTO>( entityList.size() );
        for ( TbInvent tbInvent : entityList ) {
            list.add( asDTO( tbInvent ) );
        }

        return list;
    }

    @Override
    public TbInvent asEntity(TbInventDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TbInvent tbInvent = new TbInvent();

        tbInvent.setId( dto.getId() );
        tbInvent.setItemId( dto.getItemId() );
        tbInvent.setLocationId( dto.getLocationId() );
        tbInvent.setQuantity( dto.getQuantity() );

        return tbInvent;
    }
}
