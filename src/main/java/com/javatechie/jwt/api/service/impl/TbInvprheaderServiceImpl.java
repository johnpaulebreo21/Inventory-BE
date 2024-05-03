package com.javatechie.jwt.api.service.impl;

import com.javatechie.jwt.api.dao.TbInvprheaderRepository;
import com.javatechie.jwt.api.dto.TbInvprheaderDTO;
import com.javatechie.jwt.api.entity.TbInvprheader;
import com.javatechie.jwt.api.mapper.TbInvprheaderMapper;
import com.javatechie.jwt.api.service.TbInvprheaderService;
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
public class TbInvprheaderServiceImpl implements TbInvprheaderService {
    private final TbInvprheaderRepository repository;

    public TbInvprheaderServiceImpl(TbInvprheaderRepository repository) {
        this.repository = repository;
    }

    @Override
    public TbInvprheader save(TbInvprheader entity) {
        return repository.save(entity);
    }

    @Override
    public List<TbInvprheader> save(List<TbInvprheader> entities) {
        return (List<TbInvprheader>) repository.saveAll(entities);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<TbInvprheader> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<TbInvprheader> findAll() {
        return (List<TbInvprheader>) repository.findAll();
    }

    @Override
    public Page<TbInvprheader> findAll(Pageable pageable) {
        Page<TbInvprheader> entityPage = repository.findAll(pageable);
        List<TbInvprheader> entities = entityPage.getContent();
        return new PageImpl<>(entities, pageable, entityPage.getTotalElements());
    }

    @Override
    public TbInvprheader update(TbInvprheader entity, Long id) {
        Optional<TbInvprheader> optional = findById(id);
        if (optional.isPresent()) {
            return save(entity);
        }
        return null;
    }
}