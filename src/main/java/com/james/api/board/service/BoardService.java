package com.james.api.board.service;

import com.james.api.article.model.ArticleDto;
import com.james.api.board.model.Board;
import com.james.api.board.model.BoardDto;
import com.james.api.common.command.CommandService;
import com.james.api.common.component.MessengerVo;
import com.james.api.common.query.QueryService;

import java.util.Optional;

public interface BoardService extends CommandService<BoardDto>, QueryService<BoardDto> {

    MessengerVo modify(BoardDto dto);
    default Board dtoToEntity(BoardDto dto){
        return Board.builder().build();
    }
    default BoardDto entityToDto(Board board){
        return BoardDto.builder().build();
    }
}
