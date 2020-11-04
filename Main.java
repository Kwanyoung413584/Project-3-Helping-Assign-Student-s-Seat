import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    System.out.println("\n");
    System.out.println("It's the first day of school in Ms.Benny's class and she needs your help assigning seats to her students.\n");

    Scanner getScanner = new Scanner(System.in);

    int[] Seats = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    String[] Names = new String[15];

    if (Names.length > Seats.length) {
      System.out.println("Uh oh, it looks like there is not enough seats for this class! Try adding more seats!");
      return;
    }

  }
}