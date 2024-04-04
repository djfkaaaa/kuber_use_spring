package com.james.api.common.command;

public interface CommandService<T> {

      String save(T t);
      String insertMany();
      String delete(T t);
}
