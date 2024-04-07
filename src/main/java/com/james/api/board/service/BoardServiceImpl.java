package com.james.api.board.service;

import com.james.api.board.model.BoardDto;
import com.james.api.board.repository.BoardRepository;
import com.james.api.board.service.BoardService;
import com.james.api.common.component.PageRequestVo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardRepository repo;


    @Override
    public BoardDto save(BoardDto dto) {
        return entityToDto(Optional.of(repo.save(dtoToEntity(dto))));
    }

    @Override
    public void deleteById(Long id) {
        repo.deleteById(id);
    }

    @Override
    public List<BoardDto> findAll(PageRequestVo vo) {
        return null;
    }

    @Override
    public Optional<BoardDto> findById(Long id) {
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
