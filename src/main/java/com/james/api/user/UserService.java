package com.james.api.user;


import com.james.api.common.command.CommandService;
import com.james.api.common.query.QueryService;

import java.util.List;
import java.util.Map;

public interface UserService extends CommandService, QueryService {

    // command
    String updatePassword(User user);

    // query
    List<?> findUserByName(String name);
    List<?> findUsersByJob(String job);

}
