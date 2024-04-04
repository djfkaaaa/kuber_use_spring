package com.james.api.article;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleServiceImpl implements ArticleService {

    private final ArticleRepository repo;


    @Override
    public Article dtoToEntity(ArticleDto dto) {
        return ArticleService.super.dtoToEntity(dto);
    }

    @Override
    public Optional<ArticleDto> entityToDto(Article ent) {
        return ArticleService.super.entityToDto(ent);
    }

    @Override
    public String save(ArticleDto dto) {
        return null;
    }

    @Override
    public String insertMany() {
        return null;
    }

    @Override
    public String delete(ArticleDto dto) {
        return null;
    }

    @Override
    public List<ArticleDto> findAll() throws SQLException {
        return null;
    }

    @Override
    public Optional<ArticleDto> findById(Long id) {
        Article ent = repo.findById(id).get();
        Optional<ArticleDto> dto = entityToDto(ent);
        return Optional.of(dto.orElse(null));
    }

    @Override
    public String count() {
        return null;
    }

    @Override
    public Optional<ArticleDto> getOne(String id) {
        return Optional.empty();
    }

    @Override
    public Boolean existsById(Long id) {
        return null;
    }
}




