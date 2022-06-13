package com.nttdata.functional.model.repository;

public interface MyCrudRepository<T, ID> {
  Database<T,ID> getDatabase();
  default T save(T t) {
    return t;
  }
  default void deleteById(ID id) {

  }
}
