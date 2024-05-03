package com.javatechie.jwt.api.mapper;

import com.javatechie.jwt.api.dto.TbInvSupplierItemDTO;
import com.javatechie.jwt.api.entity.TbInvSupplierItem;
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
public class TbInvSupplierItemMapperImpl implements TbInvSupplierItemMapper {

    @Override
    public TbInvSupplierItemDTO asDTO(TbInvSupplierItem entity) {
        if ( entity == null ) {
            return null;
        }

        TbInvSupplierItemDTO tbInvSupplierItemDTO = new TbInvSupplierItemDTO();

        tbInvSupplierItemDTO.setId( entity.getId() );
        tbInvSupplierItemDTO.setItemId( entity.getItemId() );
        tbInvSupplierItemDTO.setSuppierId( entity.getSuppierId() );
        tbInvSupplierItemDTO.setUnitPrice( entity.getUnitPrice() );

        return tbInvSupplierItemDTO;
    }

    @Override
    public List<TbInvSupplierItem> asEntityList(List<TbInvSupplierItemDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TbInvSupplierItem> list = new ArrayList<TbInvSupplierItem>( dtoList.size() );
        for ( TbInvSupplierItemDTO tbInvSupplierItemDTO : dtoList ) {
            list.add( asEntity( tbInvSupplierItemDTO ) );
        }

        return list;
    }

    @Override
    public List<TbInvSupplierItemDTO> asDTOList(List<TbInvSupplierItem> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TbInvSupplierItemDTO> list = new ArrayList<TbInvSupplierItemDTO>( entityList.size() );
        for ( TbInvSupplierItem tbInvSupplierItem : entityList ) {
            list.add( asDTO( tbInvSupplierItem ) );
        }

        return list;
    }

    @Override
    public TbInvSupplierItem asEntity(TbInvSupplierItemDTO dto) {
        if ( dto == null ) {
            return null;
        }

        TbInvSupplierItem tbInvSupplierItem = new TbInvSupplierItem();

        tbInvSupplierItem.setId( dto.getId() );
        tbInvSupplierItem.setItemId( dto.getItemId() );
        tbInvSupplierItem.setSuppierId( dto.getSuppierId() );
        tbInvSupplierItem.setUnitPrice( dto.getUnitPrice() );

        return tbInvSupplierItem;
    }
}
