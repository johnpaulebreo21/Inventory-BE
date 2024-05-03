package com.javatechie.jwt.api.service.impl;

import com.javatechie.jwt.api.dao.TbInvpodetailRepository;
import com.javatechie.jwt.api.dto.TbInvpodetailDTO;
import com.javatechie.jwt.api.entity.TbInvpodetail;
import com.javatechie.jwt.api.mapper.TbInvpodetailMapper;
import com.javatechie.jwt.api.service.TbInvpodetailService;
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
public class TbInvpodetailServiceImpl implements TbInvpodetailService {
    private final TbInvpodetailRepository repository;

    public TbInvpodetailServiceImpl(TbInvpodetailRepository repository) {
        this.repository = repository;
    }

    @Override
    public TbInvpodetail save(TbInvpodetail entity) {
        return repository.save(entity);
    }

    @Override
    public List<TbInvpodetail> save(List<TbInvpodetail> entities) {
        return (List<TbInvpodetail>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<TbInvpodetail> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<TbInvpodetail> findAll() {
        return (List<TbInvpodetail>) repository.findAll();
    }

    @Override
    public Page<TbInvpodetail> findAll(Pageable pageable) {
        Page<TbInvpodetail> entityPage = repository.findAll(pageable);
        List<TbInvpodetail> entities = entityPage.getContent();
        return new PageImpl<>(entities, pageable, entityPage.getTotalElements());
    }

    @Override
    public TbInvpodetail update(TbInvpodetail entity, Long id) {
        Optional<TbInvpodetail> optional = findById(id);
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }
}