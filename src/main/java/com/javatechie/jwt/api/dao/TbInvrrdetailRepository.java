package com.javatechie.jwt.api.dao;

import com.javatechie.jwt.api.entity.TbInvrrdetail;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbInvrrdetailRepository extends PagingAndSortingRepository<TbInvrrdetail, Long> {
}