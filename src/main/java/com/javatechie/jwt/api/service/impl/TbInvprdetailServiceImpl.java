package com.javatechie.jwt.api.service.impl;

import com.javatechie.jwt.api.dao.TbInvprdetailRepository;
import com.javatechie.jwt.api.dto.TbInvprdetailDTO;
import com.javatechie.jwt.api.entity.TbInvprdetail;
import com.javatechie.jwt.api.mapper.TbInvprdetailMapper;
import com.javatechie.jwt.api.service.TbInvprdetailService;
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
public class TbInvprdetailServiceImpl implements TbInvprdetailService {
    private final TbInvprdetailRepository repository;

    public TbInvprdetailServiceImpl(TbInvprdetailRepository repository) {
        this.repository = repository;
    }

    @Override
    public TbInvprdetail save(TbInvprdetail entity) {
        return repository.save(entity);
    }

    @Override
    public List<TbInvprdetail> save(List<TbInvprdetail> entities) {
        return (List<TbInvprdetail>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<TbInvprdetail> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<TbInvprdetail> findAll() {
        return (List<TbInvprdetail>) repository.findAll();
    }

    @Override
    public Page<TbInvprdetail> findAll(Pageable pageable) {
        Page<TbInvprdetail> entityPage = repository.findAll(pageable);
        List<TbInvprdetail> entities = entityPage.getContent();
        return new PageImpl<>(entities, pageable, entityPage.getTotalElements());
    }

    @Override
    public TbInvprdetail update(TbInvprdetail entity, Long id) {
        Optional<TbInvprdetail> optional = findById(id);
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }
}