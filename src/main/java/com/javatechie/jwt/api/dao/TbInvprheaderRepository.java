package com.javatechie.jwt.api.dao;

import com.javatechie.jwt.api.entity.TbInvprheader;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbInvprheaderRepository extends PagingAndSortingRepository<TbInvprheader, Long> {
}