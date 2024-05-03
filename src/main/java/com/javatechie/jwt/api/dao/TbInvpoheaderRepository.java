package com.javatechie.jwt.api.dao;

import com.javatechie.jwt.api.entity.TbInvpoheader;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbInvpoheaderRepository extends PagingAndSortingRepository<TbInvpoheader, Long> {
}