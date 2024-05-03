package com.javatechie.jwt.api.dao;

import com.javatechie.jwt.api.entity.TbInvpodetail;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbInvpodetailRepository extends PagingAndSortingRepository<TbInvpodetail, Long> {
}