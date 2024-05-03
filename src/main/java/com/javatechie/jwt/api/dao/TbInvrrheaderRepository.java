package com.javatechie.jwt.api.dao;

import com.javatechie.jwt.api.entity.TbInvrrheader;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbInvrrheaderRepository extends PagingAndSortingRepository<TbInvrrheader, Long> {
}