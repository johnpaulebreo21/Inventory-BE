package com.javatechie.jwt.api.service.impl;

import com.javatechie.jwt.api.dao.TbInvMasterRepository;
import com.javatechie.jwt.api.dto.TbInvMasterDTO;
import com.javatechie.jwt.api.entity.TbInvMaster;
import com.javatechie.jwt.api.mapper.TbInvMasterMapper;
import com.javatechie.jwt.api.service.TbInvMasterService;
import org.mapstruct.factory.Mappers;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TbInvMasterServiceImpl implements TbInvMasterService {
    private final TbInvMasterRepository repository;

    public TbInvMasterServiceImpl(TbInvMasterRepository repository) {
        this.repository = repository;
    }

    @Override
    public TbInvMaster save(TbInvMaster entity) {
        return repository.save(entity);
    }

    @Override
    public List<TbInvMaster> save(List<TbInvMaster> entities) {
        return (List<TbInvMaster>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<TbInvMaster> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<TbInvMaster> findAll() {
        return (List<TbInvMaster>) repository.findAll();
    }

    @Override
    public Page<TbInvMaster> findAll(Pageable pageable) {
        Page<TbInvMaster> entityPage = repository.findAll(pageable);
        List<TbInvMaster> entities = entityPage.getContent();
        return new PageImpl<>(entities, pageable, entityPage.getTotalElements());
    }

    @Override
    public TbInvMaster update(TbInvMaster entity, Long id) {
        Optional<TbInvMaster> optional = findById(id);
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }
}