package com.nttdata.functional.model.repository;

import java.util.List;

public interface MyJpaPaginator<T, ID> {
  List<T> findAllPaginator(int page);
}
