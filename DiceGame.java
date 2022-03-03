/** A game where you guess a number between 1 and 6
 * 
 * Author Andrew Du-frigstad
 * version 1
 * since   2022-02-25
 * */ 

import java.util.Random;
import java.util.Scanner;
 
class DiceGame {
  public static void main(String[] args) {
    int min = 1;
    int max = 6;
    int randNum = (int) Math.floor(Math.random() * (max - min + 1) + min);
    int counter = 1;
    int userNumInt = 0;

    Scanner myObj = new Scanner(System.in);
    while (userNumInt != randNum) {
      System.out.println("Choose a number between 1 and 6");
      String userNum = myObj.nextLine();
      try {
        userNumInt = Integer.parseInt(userNum);
      } catch (NumberFormatException e) {
        userNumInt = -1;
      }
      if (userNumInt > 6) {
        System.out.println("Not a valid input");
      } else if (userNumInt < 1) {
        System.out.println("Not a valid input");
      } else if (userNumInt == -1) {
        System.out.println("Not a valid input");
      } else if (userNumInt > randNum) {
        counter = counter + 1;
        System.out.println("Guess lower");
      } else if (userNumInt < randNum) {
        counter = counter + 1;
        System.out.println("Guess higher");
      } else {
        break;
      }
    }
    System.out.println("It took you this many guesses: " + counter);
  }
}
