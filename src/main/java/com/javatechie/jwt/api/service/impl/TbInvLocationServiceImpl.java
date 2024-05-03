package com.javatechie.jwt.api.service.impl;

import com.javatechie.jwt.api.dao.TbInvLocationRepository;
import com.javatechie.jwt.api.dto.TbInvLocationDTO;
import com.javatechie.jwt.api.entity.TbInvLocation;
import com.javatechie.jwt.api.mapper.TbInvLocationMapper;
import com.javatechie.jwt.api.service.TbInvLocationService;
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
public class TbInvLocationServiceImpl implements TbInvLocationService {
    private final TbInvLocationRepository repository;

    public TbInvLocationServiceImpl(TbInvLocationRepository repository) {
        this.repository = repository;
    }

    @Override
    public TbInvLocation save(TbInvLocation entity) {
        return repository.save(entity);
    }

    @Override
    public List<TbInvLocation> save(List<TbInvLocation> entities) {
        return (List<TbInvLocation>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<TbInvLocation> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<TbInvLocation> findAll() {
        return (List<TbInvLocation>) repository.findAll();
    }

    @Override
    public Page<TbInvLocation> findAll(Pageable pageable) {
        Page<TbInvLocation> entityPage = repository.findAll(pageable);
        List<TbInvLocation> entities = entityPage.getContent();
        return new PageImpl<>(entities, pageable, entityPage.getTotalElements());
    }

    @Override
    public TbInvLocation update(TbInvLocation entity, Long id) {
        Optional<TbInvLocation> optional = findById(id);
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }
}