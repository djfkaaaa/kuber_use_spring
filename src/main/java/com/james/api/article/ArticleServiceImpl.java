package com.james.api.article;

import com.james.api.common.component.PageRequestVo;
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
    public ArticleDto save(ArticleDto dto) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List<ArticleDto> findAll(PageRequestVo vo) {
        return null;
    }

    @Override
    public Optional<ArticleDto> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }
}




