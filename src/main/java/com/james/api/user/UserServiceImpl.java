package com.james.api.user;



import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    @Override
    public String save(Object o) {
        return null;
    }

    @Override
    public String insertMany() {
        return null;
    }

    @Override
    public String delete(Object o) {
        return null;
    }

    @Override
    public List findAll() throws SQLException {
        return null;
    }

    @Override
    public Optional findById(Long id) {
        return Optional.empty();
    }

    @Override
    public String count() {
        return null;
    }

    @Override
    public Optional getOne(String id) {
        return Optional.empty();
    }

    @Override
    public Boolean existsById(Long id) {
        return null;
    }

    @Override
    public String updatePassword(User user) {
        return null;
    }

    @Override
    public List<?> findUserByName(String name) {
        return null;
    }

    @Override
    public List<?> findUsersByJob(String job) {
        return null;
    }
}