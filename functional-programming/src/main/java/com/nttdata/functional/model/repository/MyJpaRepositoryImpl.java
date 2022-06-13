package com.nttdata.functional.model.repository;

import com.nttdata.functional.model.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MyJpaRepositoryImpl implements MyJpaRepository<Account, Integer>,
    MyJpaPaginator<Account, Integer> {
  @Autowired
  Database<Account, Integer> database;

  @Override
  public Database<Account, Integer> getDatabase() {
    return database;
  }

  @Override
  public List<Account> findAllPaginator(int page) {
    return null;
  }
}
