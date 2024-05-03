package com.javatechie.jwt.api.service.impl;

import com.javatechie.jwt.api.dao.TbInvpoheaderRepository;
import com.javatechie.jwt.api.dto.TbInvpoheaderDTO;
import com.javatechie.jwt.api.entity.TbInvpoheader;
import com.javatechie.jwt.api.mapper.TbInvpoheaderMapper;
import com.javatechie.jwt.api.service.TbInvpoheaderService;
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
public class TbInvpoheaderServiceImpl implements TbInvpoheaderService {
    private final TbInvpoheaderRepository repository;

    public TbInvpoheaderServiceImpl(TbInvpoheaderRepository repository) {
        this.repository = repository;
    }

    @Override
    public TbInvpoheader save(TbInvpoheader entity) {
        return repository.save(entity);
    }

    @Override
    public List<TbInvpoheader> save(List<TbInvpoheader> entities) {
        return (List<TbInvpoheader>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<TbInvpoheader> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<TbInvpoheader> findAll() {
        return (List<TbInvpoheader>) repository.findAll();
    }

    @Override
    public Page<TbInvpoheader> findAll(Pageable pageable) {
        Page<TbInvpoheader> entityPage = repository.findAll(pageable);
        List<TbInvpoheader> entities = entityPage.getContent();
        return new PageImpl<>(entities, pageable, entityPage.getTotalElements());
    }

    @Override
    public TbInvpoheader update(TbInvpoheader entity, Long id) {
        Optional<TbInvpoheader> optional = findById(id);
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }
}