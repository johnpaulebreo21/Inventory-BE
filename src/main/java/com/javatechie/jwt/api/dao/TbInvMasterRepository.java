package com.javatechie.jwt.api.dao;

import com.javatechie.jwt.api.entity.TbInvMaster;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TbInvMasterRepository extends PagingAndSortingRepository<TbInvMaster, Long> {
}