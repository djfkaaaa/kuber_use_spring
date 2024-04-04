package com.james.api.board;

import com.james.api.article.Article;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2

public class BoardDto {
    private Long id;
    private String boardName;
    private String boardType;
    private List<Article> article;
    // ^ list를 default type으로 줌
}
