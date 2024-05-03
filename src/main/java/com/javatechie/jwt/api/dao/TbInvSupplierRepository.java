package com.javatechie.jwt.api.dao;

import com.javatechie.jwt.api.entity.TbInvSupplier;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbInvSupplierRepository extends PagingAndSortingRepository<TbInvSupplier, Long> {
}