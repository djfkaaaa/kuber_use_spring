package com.james.api.board.model;

import com.james.api.article.model.Article;
import com.james.api.common.BaseEntitiy;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "boards")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Builder
@AllArgsConstructor
@ToString(exclude = {"id"})
public class Board extends BaseEntitiy {

    @Id
    @Column(name = "board_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String boardName;
    private String boardType;

    @OneToMany(mappedBy = "board")
    private List<Article> articles;

//
//    @Builder(builderMethodName = "builder")
//    public Board(Long id, String boardName, String boardType) {
//        this.id = id;
//        this.boardName = boardName;
//        this.boardType = boardType;
//    }
}