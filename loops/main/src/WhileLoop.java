
import java.io.*;
import java.util.Scanner;

public class WhileLoop {


  public static void main(String[] args) {
    //int i = 0;

   // while (i < 5){ /* break condition 5 < 5 : false : break the loop */
   //   System.out.println(i); // 0 , 1 , 2 , 3 , 4
  //    i++; // i = i +1; // i : 1 , 2 , 3 , 4 , 5
//    }
    // outside the loop :
    // System.out.println(i); // 5

    Scanner input = new Scanner(System.in);
    System.out.println("Please guess the correct number: ");
    String stringNum = input.nextLine(); // reading the number as a string
   int num = Integer.parseInt(stringNum); //  converting to int
    // Line 20 and Line 21 can be solved in one line as below :
  //  int number = input.nextInt(); : (My experience: ) this could make mistakes
    int numOfTrials = 0;


    // '!' mean not
    while (num != 8 && numOfTrials < 4 ){ // when num is 8 , the loop will break
      if(num < 8 ){
        System.out.println("This is wrong number, but less than correct one, try:  ");
        stringNum = input.nextLine(); // reading the number as a string
        num = Integer.parseInt(stringNum); //  converting to int
      }else{
        System.out.println("This is wrong number, but greater than correct one, try: ");
        stringNum = input.nextLine(); // reading the number as a string
        num = Integer.parseInt(stringNum); //  converting to int
      }

      numOfTrials++; // increase it by  one

    }

    // outside the loop:

    if (num == 8) {
      System.out.println("Great you're Winner !!!!");
    }else{
      System.out.println("Too many trails, game over !!!");
    }


/**
 *  (num != 8 && numOfTrials < 4 ){
 *    true    &&    true           = true // keep inside the loop
 *   false    &&    true           = false // break the loop
 *    true    &&    false          = false  // break the loop
 *    false   &&    false          = false  // break the loop
 * */


  }
}
