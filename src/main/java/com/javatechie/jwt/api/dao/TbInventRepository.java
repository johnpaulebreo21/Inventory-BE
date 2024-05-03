package com.javatechie.jwt.api.dao;

import com.javatechie.jwt.api.entity.TbInvent;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbInventRepository extends PagingAndSortingRepository<TbInvent, Long> {
}