package com.javatechie.jwt.api.dao;

import com.javatechie.jwt.api.entity.TbInvprdetail;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbInvprdetailRepository extends PagingAndSortingRepository<TbInvprdetail, Long> {
}