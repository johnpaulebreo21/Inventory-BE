package com.javatechie.jwt.api.dao;

import com.javatechie.jwt.api.entity.TbInvSupplierItem;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbInvSupplierItemRepository extends PagingAndSortingRepository<TbInvSupplierItem, Long> {
}