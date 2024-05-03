package com.javatechie.jwt.api.service.impl;

import com.javatechie.jwt.api.dao.TbInventRepository;
import com.javatechie.jwt.api.dto.TbInventDTO;
import com.javatechie.jwt.api.entity.TbInvent;
import com.javatechie.jwt.api.mapper.TbInventMapper;
import com.javatechie.jwt.api.service.TbInventService;
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
public class TbInventServiceImpl implements TbInventService {
    private final TbInventRepository repository;

    public TbInventServiceImpl(TbInventRepository repository) {
        this.repository = repository;
    }

    @Override
    public TbInvent save(TbInvent entity) {
        return repository.save(entity);
    }

    @Override
    public List<TbInvent> save(List<TbInvent> entities) {
        return (List<TbInvent>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<TbInvent> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<TbInvent> findAll() {
        return (List<TbInvent>) repository.findAll();
    }

    @Override
    public Page<TbInvent> findAll(Pageable pageable) {
        Page<TbInvent> entityPage = repository.findAll(pageable);
        List<TbInvent> entities = entityPage.getContent();
        return new PageImpl<>(entities, pageable, entityPage.getTotalElements());
    }

    @Override
    public TbInvent update(TbInvent entity, Long id) {
        Optional<TbInvent> optional = findById(id);
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }
}