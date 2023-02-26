package org.example;

public class Main {
    public static void main(String[] args) {

        char symbol ='?';
        String name = "How's it going";

  
        MyInterface myInterface = (x, y) -> {
      
      System.out.println("Hey there! " +x+y);
      
    };


      myInterface.message(name, symbol);
    }
  }

