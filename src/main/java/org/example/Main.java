package org.example;

public class Main {
    public static void main(String[] args) {

        char symbol ='!';
        String name = "Bro";

  
        MyInterface myInterface = (x, y) -> {
      
      System.out.println("Jou what's up ->  " +x+y);
      
    };


      myInterface.message(name, symbol);
    }
  }

