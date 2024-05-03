package com.javatechie.jwt.api.service.impl;

import com.javatechie.jwt.api.dao.TbInvrrdetailRepository;
import com.javatechie.jwt.api.dto.TbInvrrdetailDTO;
import com.javatechie.jwt.api.entity.TbInvrrdetail;
import com.javatechie.jwt.api.mapper.TbInvrrdetailMapper;
import com.javatechie.jwt.api.service.TbInvrrdetailService;
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
public class TbInvrrdetailServiceImpl implements TbInvrrdetailService {
    private final TbInvrrdetailRepository repository;

    public TbInvrrdetailServiceImpl(TbInvrrdetailRepository repository) {
        this.repository = repository;
    }

    @Override
    public TbInvrrdetail save(TbInvrrdetail entity) {
        return repository.save(entity);
    }

    @Override
    public List<TbInvrrdetail> save(List<TbInvrrdetail> entities) {
        return (List<TbInvrrdetail>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<TbInvrrdetail> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<TbInvrrdetail> findAll() {
        return (List<TbInvrrdetail>) repository.findAll();
    }

    @Override
    public Page<TbInvrrdetail> findAll(Pageable pageable) {
        Page<TbInvrrdetail> entityPage = repository.findAll(pageable);
        List<TbInvrrdetail> entities = entityPage.getContent();
        return new PageImpl<>(entities, pageable, entityPage.getTotalElements());
    }

    @Override
    public TbInvrrdetail update(TbInvrrdetail entity, Long id) {
        Optional<TbInvrrdetail> optional = findById(id);
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }
}