package com.javatechie.jwt.api.service.impl;

import com.javatechie.jwt.api.dao.TbInvSupplierItemRepository;
import com.javatechie.jwt.api.dto.TbInvSupplierItemDTO;
import com.javatechie.jwt.api.entity.TbInvSupplierItem;
import com.javatechie.jwt.api.mapper.TbInvSupplierItemMapper;
import com.javatechie.jwt.api.service.TbInvSupplierItemService;
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
public class TbInvSupplierItemServiceImpl implements TbInvSupplierItemService {
    private final TbInvSupplierItemRepository repository;

    public TbInvSupplierItemServiceImpl(TbInvSupplierItemRepository repository) {
        this.repository = repository;
    }

    @Override
    public TbInvSupplierItem save(TbInvSupplierItem entity) {
        return repository.save(entity);
    }

    @Override
    public List<TbInvSupplierItem> save(List<TbInvSupplierItem> entities) {
        return (List<TbInvSupplierItem>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<TbInvSupplierItem> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<TbInvSupplierItem> findAll() {
        return (List<TbInvSupplierItem>) repository.findAll();
    }

    @Override
    public Page<TbInvSupplierItem> findAll(Pageable pageable) {
        Page<TbInvSupplierItem> entityPage = repository.findAll(pageable);
        List<TbInvSupplierItem> entities = entityPage.getContent();
        return new PageImpl<>(entities, pageable, entityPage.getTotalElements());
    }

    @Override
    public TbInvSupplierItem update(TbInvSupplierItem entity, Long id) {
        Optional<TbInvSupplierItem> optional = findById(id);
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }
}