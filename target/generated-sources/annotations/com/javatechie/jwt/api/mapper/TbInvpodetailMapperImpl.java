package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInvpodetailDTO;
import com.javatechie.jwt.api.entity.TbInvpodetail;
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
public class TbInvpodetailMapperImpl implements TbInvpodetailMapper {

    @Override
    public TbInvpodetailDTO asDTO(TbInvpodetail entity) {
        if ( entity == null ) {
            return null;
        }

        TbInvpodetailDTO tbInvpodetailDTO = new TbInvpodetailDTO();

        tbInvpodetailDTO.setId( entity.getId() );
        tbInvpodetailDTO.setItemId( entity.getItemId() );
        tbInvpodetailDTO.setPoheaderId( entity.getPoheaderId() );
        tbInvpodetailDTO.setPrheaderId( entity.getPrheaderId() );
        tbInvpodetailDTO.setQuantity( entity.getQuantity() );
        tbInvpodetailDTO.setUnitPrice( entity.getUnitPrice() );

        return tbInvpodetailDTO;
    }

    @Override
    public List<TbInvpodetail> asEntityList(List<TbInvpodetailDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TbInvpodetail> list = new ArrayList<TbInvpodetail>( dtoList.size() );
        for ( TbInvpodetailDTO tbInvpodetailDTO : dtoList ) {
            list.add( asEntity( tbInvpodetailDTO ) );
        }

        return list;
    }

    @Override
    public List<TbInvpodetailDTO> asDTOList(List<TbInvpodetail> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TbInvpodetailDTO> list = new ArrayList<TbInvpodetailDTO>( entityList.size() );
        for ( TbInvpodetail tbInvpodetail : entityList ) {
            list.add( asDTO( tbInvpodetail ) );
        }

        return list;
    }

    @Override
    public TbInvpodetail asEntity(TbInvpodetailDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TbInvpodetail tbInvpodetail = new TbInvpodetail();

        tbInvpodetail.setId( dto.getId() );
        tbInvpodetail.setItemId( dto.getItemId() );
        tbInvpodetail.setPoheaderId( dto.getPoheaderId() );
        tbInvpodetail.setPrheaderId( dto.getPrheaderId() );
        tbInvpodetail.setQuantity( dto.getQuantity() );
        tbInvpodetail.setUnitPrice( dto.getUnitPrice() );

        return tbInvpodetail;
    }
}
