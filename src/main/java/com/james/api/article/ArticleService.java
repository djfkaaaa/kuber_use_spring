package com.james.api.article;

import com.james.api.common.command.CommandService;
import com.james.api.common.query.QueryService;

import java.sql.SQLException;
import java.util.*;

public interface ArticleService extends CommandService<ArticleDto>, QueryService<ArticleDto> {

    default Article dtoToEntity(ArticleDto dto){


        Article article = Article.builder()
                .content(dto.getContent())
                .build();
        return article;
    }

    default Optional<ArticleDto> entityToDto(Article ent){
        ArticleDto dto = ArticleDto.builder()
                .content(ent.getContent())
                .build();
        return Optional.of(dto);
    }
}
