package com.javatechie.jwt.api.dao;

import com.javatechie.jwt.api.entity.TbInvLocation;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbInvLocationRepository extends PagingAndSortingRepository<TbInvLocation, Long> {
}