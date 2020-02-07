import java.util.Scanner;
import java.util.Arrays;

class Main {

  static String one = "⬛", two = "⬛", three = "⬛", four = "⬛", five = "⬛", six = "⬛", seven = "⬛", eight = "⬛", nine = "⬛";

  public static boolean areEqual(String x1, String x2, String x3) {
    if(x1 == x2 && x2 == x3 && x1 == x3)
      return true;
    else
      return false;
  }

  public static boolean checkForWinner() {
    String[] board = {one, two, three, four, five, six, seven, eight, nine};
    
    if(areEqual(board[0], board[1], board[2]) && board[0] != "⬛") {
      return true;
    }
    if(areEqual(board[3], board[4], board[5]) && board[3] != "⬛") {
      return true;
    }
    if(areEqual(board[6], board[7], board[8]) && board[6] != "⬛") {
      return true;
    }
    if(areEqual(board[0], board[3], board[6]) && board[0] != "⬛") {
      return true;
    }
    if(areEqual(board[1], board[4], board[7]) && board[1] != "⬛") {
      return true;
    }
    if(areEqual(board[2], board[5], board[8]) && board[2] != "⬛") {
      return true;
    }
    if(areEqual(board[0], board[4], board[8]) && board[0] != "⬛") {
      return true;
    }
    if(areEqual(board[2], board[4], board[6]) && board[2] != "⬛") {
      return true;
    }
    return false;
  }

  public static void putVariable (String character, String move){
    switch (move){

      case ("1"):
        if(one != "⬛")
          break;
        one = character;
        break;

      case ("2"):
        if(two != "⬛")
          break;
        two = character;
        break;

      case ("3"):
        if(three != "⬛")
          break;
        three = character;
        break;

      case ("4"):
        if(four != "⬛")
          break;
        four = character;
        break;

      case ("5"):
        if(five != "⬛")
          break;
        five = character;
        break;

      case ("6"):
        if(six != "⬛")
          break;
        six = character;
        break;

      case ("7"):
        if(seven != "⬛")
          break;
        seven = character;
        break;

      case ("8"):
        if(eight != "⬛")
          break;
        eight = character;
        break;

      case ("9"):
        if(nine != "⬛")
          break;
        nine = character;
        break;

    }

  }


  public static void main (String[] args){

    for (int i = 1; i < 10; i++){

      System.out.println(one + " " + two + " " + three);
      System.out.println(four + " " + five + " " + six);
      System.out.println(seven + " " + eight + " " + nine);

      System.out.println("\n" + "Input: ");

      Scanner scan = new Scanner(System.in);
      String move = scan.nextLine();
      System.out.println("\n");

      if ((i % 2) ==  1){
        putVariable ("x", move);
      } else {
        putVariable ("o", move);
      }
      if(checkForWinner()) {
        System.out.println("WINNER");
        i = 10;
      }
    }

    System.out.println(one + " " + two + " " + three);
    System.out.println(four + " " + five + " " + six);
    System.out.println(seven + " " + eight + " " + nine);

  

  }

}