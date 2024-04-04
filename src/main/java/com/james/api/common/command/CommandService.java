package com.james.api.common.command;

import com.james.api.common.enums.Messenger;

public interface CommandService<T> {

      String save(T t);
      String insertMany();
      String delete(T t);
}
