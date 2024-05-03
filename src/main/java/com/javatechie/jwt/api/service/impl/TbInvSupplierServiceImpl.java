package com.javatechie.jwt.api.service.impl;

import com.javatechie.jwt.api.dao.TbInvSupplierRepository;
import com.javatechie.jwt.api.dto.TbInvSupplierDTO;
import com.javatechie.jwt.api.entity.TbInvSupplier;
import com.javatechie.jwt.api.mapper.TbInvSupplierMapper;
import com.javatechie.jwt.api.service.TbInvSupplierService;
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
public class TbInvSupplierServiceImpl implements TbInvSupplierService {
    private final TbInvSupplierRepository repository;

    public TbInvSupplierServiceImpl(TbInvSupplierRepository repository) {
        this.repository = repository;
    }

    @Override
    public TbInvSupplier save(TbInvSupplier entity) {
        return repository.save(entity);
    }

    @Override
    public List<TbInvSupplier> save(List<TbInvSupplier> entities) {
        return (List<TbInvSupplier>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<TbInvSupplier> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<TbInvSupplier> findAll() {
        return (List<TbInvSupplier>) repository.findAll();
    }

    @Override
    public Page<TbInvSupplier> findAll(Pageable pageable) {
        Page<TbInvSupplier> entityPage = repository.findAll(pageable);
        List<TbInvSupplier> entities = entityPage.getContent();
        return new PageImpl<>(entities, pageable, entityPage.getTotalElements());
    }

    @Override
    public TbInvSupplier update(TbInvSupplier entity, Long id) {
        Optional<TbInvSupplier> optional = findById(id);
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }
}