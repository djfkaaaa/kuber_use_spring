package com.james.api.board;

import com.james.api.article.Article;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j

public class BoardDto {
    private Long id;
    private String boardName;
    private String boardType;

    @Builder.Default
    private List<Article> article = new ArrayList<>();
    // ^ list를 default type으로 줌
}
