package com.company.Lec21;

public interface Teacher {

  default void study(){
      System.out.println("i study like student");
  }

}
