package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInvrrdetailDTO;
import com.javatechie.jwt.api.entity.TbInvrrdetail;
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
public class TbInvrrdetailMapperImpl implements TbInvrrdetailMapper {

    @Override
    public TbInvrrdetailDTO asDTO(TbInvrrdetail entity) {
        if ( entity == null ) {
            return null;
        }

        TbInvrrdetailDTO tbInvrrdetailDTO = new TbInvrrdetailDTO();

        tbInvrrdetailDTO.setId( entity.getId() );
        tbInvrrdetailDTO.setItemId( entity.getItemId() );
        tbInvrrdetailDTO.setPoheaderId( entity.getPoheaderId() );
        tbInvrrdetailDTO.setPrheaderId( entity.getPrheaderId() );
        tbInvrrdetailDTO.setQuantity( entity.getQuantity() );
        tbInvrrdetailDTO.setRrheaderId( entity.getRrheaderId() );
        tbInvrrdetailDTO.setUnitPrice( entity.getUnitPrice() );

        return tbInvrrdetailDTO;
    }

    @Override
    public List<TbInvrrdetail> asEntityList(List<TbInvrrdetailDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TbInvrrdetail> list = new ArrayList<TbInvrrdetail>( dtoList.size() );
        for ( TbInvrrdetailDTO tbInvrrdetailDTO : dtoList ) {
            list.add( asEntity( tbInvrrdetailDTO ) );
        }

        return list;
    }

    @Override
    public List<TbInvrrdetailDTO> asDTOList(List<TbInvrrdetail> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TbInvrrdetailDTO> list = new ArrayList<TbInvrrdetailDTO>( entityList.size() );
        for ( TbInvrrdetail tbInvrrdetail : entityList ) {
            list.add( asDTO( tbInvrrdetail ) );
        }

        return list;
    }

    @Override
    public TbInvrrdetail asEntity(TbInvrrdetailDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TbInvrrdetail tbInvrrdetail = new TbInvrrdetail();

        tbInvrrdetail.setId( dto.getId() );
        tbInvrrdetail.setItemId( dto.getItemId() );
        tbInvrrdetail.setPoheaderId( dto.getPoheaderId() );
        tbInvrrdetail.setPrheaderId( dto.getPrheaderId() );
        tbInvrrdetail.setQuantity( dto.getQuantity() );
        tbInvrrdetail.setRrheaderId( dto.getRrheaderId() );
        tbInvrrdetail.setUnitPrice( dto.getUnitPrice() );

        return tbInvrrdetail;
    }
}
