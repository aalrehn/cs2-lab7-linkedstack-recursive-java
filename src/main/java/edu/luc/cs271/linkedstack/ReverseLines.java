package edu.luc.cs271.linkedstack;

import java.util.Scanner;

public class ReverseLines {

  public static void main(final String[] args) {
    // TODO read successive input lines until EOF, then print out in reverse order
    LinkedStack<String> stack = new LinkedStack<String>();
  

    final Scanner input = new Scanner(System.in);
    while (input.hasNextLine()) {
      final String line = input.nextLine();
      stack.push(line);
      if(line == " "){
          break;
      }
      



    }
    while (!stack.isEmpty()){
        System.out.println(stack.pop());
    }



  }
}
