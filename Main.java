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

    for (int i = 0; i < Names.length; i++) {
      System.out.println("Who should sit in seat #" + Seats[i] + "? \n");
      String NextLine = getScanner.nextLine();
      Names[i] = NextLine;
    }
    
    System.out.println("\n");
    System.out.println("Here are the results: \n");
    
    int countloop = 0;

    while (countloop < Names.length) {
      if (Names[countloop] == null || Names[countloop] ==  ""){ 
        System.out.println("Noone sits on seat #" + Seats[countloop]);
      }
      else if (Names[countloop] != null && Names[countloop] !=  ""){
        System.out.println(Names[countloop] + " sits on seat #" + Seats[countloop]);
      }

      countloop++;
    }

System.out.println("It's the first day of school in Ms.Benny's class and she needs your help assigning seats to her students.\n");

    getScanner.close();

  }
}