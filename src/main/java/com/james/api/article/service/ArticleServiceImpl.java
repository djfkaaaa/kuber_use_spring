package com.james.api.article.service;

import com.james.api.article.model.ArticleDto;
import com.james.api.article.repository.ArticleRepository;
import com.james.api.article.service.ArticleService;
import com.james.api.common.component.PageRequestVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository repo;

    @Override
    public ArticleDto save(ArticleDto articleDto) {
        return entityToDto(Optional.of(repo.save(dtoToEntity(articleDto))));
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<ArticleDto> findAll(PageRequestVo vo) {
        return null;
    }

    @Override
    public Optional<ArticleDto> findById(Long id) {
        return Optional.of(entityToDto(repo.findById(id)));
    }

    @Override
    public long count() {
        return repo.count();
    }

    @Override
    public boolean existsById(Long id) {
        return repo.existsById(id);
    }
}




