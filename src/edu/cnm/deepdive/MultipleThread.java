package edu.cnm.deepdive;

public class MultipleThread {

  public static void main(String[] args) {
    Thread lazy = new LazyThread();
    lazy.start();
    Utility.processInput();
  }


}
