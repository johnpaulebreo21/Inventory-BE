package com.javatechie.jwt.api.service.impl;

import com.javatechie.jwt.api.dao.TbInvrrheaderRepository;
import com.javatechie.jwt.api.dto.TbInvrrheaderDTO;
import com.javatechie.jwt.api.entity.TbInvrrheader;
import com.javatechie.jwt.api.mapper.TbInvrrheaderMapper;
import com.javatechie.jwt.api.service.TbInvrrheaderService;
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
public class TbInvrrheaderServiceImpl implements TbInvrrheaderService {
    private final TbInvrrheaderRepository repository;

    public TbInvrrheaderServiceImpl(TbInvrrheaderRepository repository) {
        this.repository = repository;
    }

    @Override
    public TbInvrrheader save(TbInvrrheader entity) {
        return repository.save(entity);
    }

    @Override
    public List<TbInvrrheader> save(List<TbInvrrheader> entities) {
        return (List<TbInvrrheader>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<TbInvrrheader> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<TbInvrrheader> findAll() {
        return (List<TbInvrrheader>) repository.findAll();
    }

    @Override
    public Page<TbInvrrheader> findAll(Pageable pageable) {
        Page<TbInvrrheader> entityPage = repository.findAll(pageable);
        List<TbInvrrheader> entities = entityPage.getContent();
        return new PageImpl<>(entities, pageable, entityPage.getTotalElements());
    }

    @Override
    public TbInvrrheader update(TbInvrrheader entity, Long id) {
        Optional<TbInvrrheader> optional = findById(id);
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }
}