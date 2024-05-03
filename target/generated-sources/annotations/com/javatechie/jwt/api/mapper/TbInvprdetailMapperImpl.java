package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInvprdetailDTO;
import com.javatechie.jwt.api.entity.TbInvprdetail;
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
public class TbInvprdetailMapperImpl implements TbInvprdetailMapper {

    @Override
    public TbInvprdetailDTO asDTO(TbInvprdetail entity) {
        if ( entity == null ) {
            return null;
        }

        TbInvprdetailDTO tbInvprdetailDTO = new TbInvprdetailDTO();

        tbInvprdetailDTO.setId( entity.getId() );
        tbInvprdetailDTO.setItemId( entity.getItemId() );
        tbInvprdetailDTO.setPrheaderId( entity.getPrheaderId() );
        tbInvprdetailDTO.setQuantity( entity.getQuantity() );

        return tbInvprdetailDTO;
    }

    @Override
    public List<TbInvprdetail> asEntityList(List<TbInvprdetailDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TbInvprdetail> list = new ArrayList<TbInvprdetail>( dtoList.size() );
        for ( TbInvprdetailDTO tbInvprdetailDTO : dtoList ) {
            list.add( asEntity( tbInvprdetailDTO ) );
        }

        return list;
    }

    @Override
    public List<TbInvprdetailDTO> asDTOList(List<TbInvprdetail> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TbInvprdetailDTO> list = new ArrayList<TbInvprdetailDTO>( entityList.size() );
        for ( TbInvprdetail tbInvprdetail : entityList ) {
            list.add( asDTO( tbInvprdetail ) );
        }

        return list;
    }

    @Override
    public TbInvprdetail asEntity(TbInvprdetailDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TbInvprdetail tbInvprdetail = new TbInvprdetail();

        tbInvprdetail.setId( dto.getId() );
        tbInvprdetail.setItemId( dto.getItemId() );
        tbInvprdetail.setPrheaderId( dto.getPrheaderId() );
        tbInvprdetail.setQuantity( dto.getQuantity() );

        return tbInvprdetail;
    }
}
