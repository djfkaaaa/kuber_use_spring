package com.james.api.user.service;


import com.james.api.common.command.CommandService;
import com.james.api.common.component.PageRequestVo;
import com.james.api.common.query.QueryService;
import com.james.api.user.model.User;
import com.james.api.user.model.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserService extends CommandService<UserDto>, QueryService<UserDto> {

    default User dtoToEntity(UserDto dto){
        return User.builder().build();
    }
    default UserDto entityToDto(Optional<User> optional){
        return UserDto.builder().build();
    }

}
