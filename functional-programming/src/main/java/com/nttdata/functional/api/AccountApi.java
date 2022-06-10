package com.nttdata.functional.api;

import com.nttdata.functional.model.entity.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AccountApi {
  public Stream<Account> getAccountsStream() {
    List<Account> accounts = new ArrayList<>();
    accounts.add(new Account(1, "1234567890", 15.36F));
    accounts.add(new Account(2, "2345678901", 25.36F));
    accounts.add(new Account(3, "3456789012", 35.36F));
    accounts.add(new Account(4, "4567890123", 45.36F));
    accounts.add(new Account(5, "5678901234", 55.36F));
    accounts.add(new Account(6, "6789012345", 65.36F));
    accounts.add(new Account(7, "7890123456", 75.36F));
    accounts.add(new Account(8, "8901234567", 85.36F));
    return accounts.stream();
  }
  public List<Account> getAccountsList() {
    List<Account> accounts = new ArrayList<>();
    accounts.add(new Account(1, "1234567890", 15.36F));
    accounts.add(new Account(2, "2345678901", 25.36F));
    accounts.add(new Account(3, "3456789012", 35.36F));
    accounts.add(new Account(4, "4567890123", 45.36F));
    accounts.add(new Account(5, "5678901234", 55.36F));
    accounts.add(new Account(6, "6789012345", 65.36F));
    accounts.add(new Account(7, "7890123456", 75.36F));
    accounts.add(new Account(8, "8901234567", 85.36F));
    return accounts;
  }
}
