package com.nttdata.functional.model.repository;

import java.util.List;

public interface Database<T, ID> {

  T select(ID id);
  List<T> select(String query);
  T insert(String query);
  T update(String query);
  T delete(String query);
}
