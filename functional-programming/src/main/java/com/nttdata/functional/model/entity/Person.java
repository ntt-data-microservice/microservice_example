package com.nttdata.functional.model.entity;

public abstract class Person {
  void saludar() {
    System.out.println("hello");
  }
  abstract void camicar();
  abstract void comer();
}
