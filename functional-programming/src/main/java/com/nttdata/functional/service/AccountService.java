package com.nttdata.functional.service;

import com.nttdata.functional.api.AccountApi;
import com.nttdata.functional.model.entity.Account;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class AccountService {

  private final AccountApi accountApi;

  public void getAccountEach() {
    List<Account> accounts = accountApi.getAccountsList();
    for (Account account : accounts) {
      System.out.println(account);
    }
  }
  public void getAccountForeach() {
    List<Account> accounts = accountApi.getAccountsList();
    accounts.forEach(account -> System.out.println(account));
  }
  public void getAccountLambda() {
    List<Account> accounts = accountApi.getAccountsList();
    accounts.forEach(System.out::println);
  }

  public void getAccountsStreams() {
    accountApi.getAccountsStream()
        .collect(Collectors.toList())
        .forEach(System.out::println);
  }

  public void getAccountsFilter() {
    accountApi.getAccountsStream()
        .filter(account -> account.getAmount() > 55)
        .collect(Collectors.toList())
        .forEach(System.out::println);
  }

  public void getAccountsMap() {
    accountApi.getAccountsStream()
        .filter(account -> account.getAmount() > 55)
        .map(account -> account.getNumberAccount())
        .collect(Collectors.toList())
        .forEach(System.out::println);
  }

}
