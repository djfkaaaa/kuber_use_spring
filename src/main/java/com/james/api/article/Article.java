package com.james.api.article;

import com.james.api.board.Board;
import com.james.api.common.BaseEntitiy;
import com.james.api.user.model.User;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "articles")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@AllArgsConstructor
@ToString(exclude = {"id"})

public class Article extends BaseEntitiy {
    @Id
    @Column(name = "article_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "writer_id")
    private User writer;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;


    private String title;
    private String content;




    @Builder(builderMethodName = "builder")
    public Article(Long id,String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
}