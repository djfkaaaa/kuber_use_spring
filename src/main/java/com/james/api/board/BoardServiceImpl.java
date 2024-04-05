package com.james.api.board;

import com.james.api.common.component.PageRequestVo;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class BoardServiceImpl implements BoardService {


    @Override
    public Object save(Object o) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public List findAll(PageRequestVo vo) {
        return null;
    }

    @Override
    public Optional findById(Long id) {
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
