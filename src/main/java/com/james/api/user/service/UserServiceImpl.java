package com.james.api.user.service;



import com.james.api.common.component.MessengerVo;
import com.james.api.user.model.User;
import com.james.api.user.model.UserDto;
import com.james.api.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Log4j2
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository repo;

    @Override
    public MessengerVo save(UserDto dto) {
        entityToDto(repo.save(dtoToEntity(dto)));
        return new MessengerVo();
    }

    @Override
    public MessengerVo deleteById(Long id) {
        repo.deleteById(id);
        return new MessengerVo();
    }

    @Override
    public List<UserDto> findAll() {
        repo.findAll();
        return new ArrayList<>();
    }

    @Override
    public Optional<UserDto> findById(Long id) {
        return null;
    }

    @Override
    public long count() {
        return repo.count();
    }

//    @Override
//    public boolean existsById(Long id) {
//        return repo.existsById(id);
//    }

    @Override
    public MessengerVo modify(UserDto dto) {
        throw new UnsupportedOperationException("Unimplemented method 'updatePassword'");
    }

    @Override
    public List<UserDto> findUserByName(String name) {
        throw new UnsupportedOperationException("Unimplemented method 'findUserByName'");
    }

    @Override
    public List<UserDto> findUserByJob(String job) {
        throw new UnsupportedOperationException("Unimplemented method 'findUserByJob'");
    }

    @Override
    public Optional<User> findUserByUsername(String username) {
        return repo.findUserByUsername(username);
    }

    @Override
    public MessengerVo login(UserDto user) {
        throw new UnsupportedOperationException("Unimplemented method 'login'");
    }


}
