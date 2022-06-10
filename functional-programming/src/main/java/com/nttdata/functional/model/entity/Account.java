package com.nttdata.functional.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {
  private Integer id;
  private String numberAccount;
  private Float amount;
}
