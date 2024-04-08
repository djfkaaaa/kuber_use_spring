package com.james.api.article.service;

import com.james.api.article.model.Article;
import com.james.api.article.model.ArticleDto;
import com.james.api.common.command.CommandService;
import com.james.api.common.component.MessengerVo;
import com.james.api.common.query.QueryService;
import com.james.api.user.model.User;
import com.james.api.user.model.UserDto;

import java.util.List;
import java.util.Optional;

public interface ArticleService extends CommandService<ArticleDto>, QueryService<ArticleDto> {

    MessengerVo modify(ArticleDto dto);

    default Article dtoToEntity(ArticleDto dto){
        return Article.builder()
                .build();
    }

    default ArticleDto entityToDto(Article article){
        return ArticleDto.builder().build();
    }
}
