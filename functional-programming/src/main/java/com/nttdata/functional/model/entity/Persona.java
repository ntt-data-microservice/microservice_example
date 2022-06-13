package com.nttdata.functional.model.entity;

public interface Persona {
  default void saludar() {
    System.out.println("hello");
  }
  void camicar();
  void comer();
}
