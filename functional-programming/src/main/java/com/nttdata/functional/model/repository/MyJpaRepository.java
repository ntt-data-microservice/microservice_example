package com.nttdata.functional.model.repository;

import java.util.List;

public interface MyJpaRepository<T, ID> extends MyCrudRepository  {
  Database<T,ID> getDatabase();
  default T findById(ID id) {
    T t = getDatabase().select(id);
    return t;
  }
  default List<T> findAll() {
    return this.getDatabase().select("Select * from T");
  }

}
