package com.james.api.common.command;

public interface CommandService<T> {

      T save(T t);
      void deleteById(Long id);
}
