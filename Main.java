// Java Imports
import java.util.Scanner;

// Main Class
class Main {
  public static void main(String[] args) {
// The print statement that tells the user what to do
    System.out.println("\n");
// Conflict
    System.out.println("It's the first day of school in Ms.Benny's class and she needs your help assigning seats to her students.\n");

// Get scanner
    Scanner getScanner = new Scanner(System.in);

// Declare array values for #seats and the names of each student
    int[] Seats = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    String[] Names = new String[15];

// Errors if wrong value declaration
    if (Names.length > Seats.length) {
      System.out.println("Uh oh, it looks like there is not enough seats for this class! Try adding more seats!");
      getScanner.close();
      return;
    }

// A for loop that will loop through the seats and will ask for the student's name to be assigned to a seat.
    for (int i = 0; i < Names.length; i++) {
      System.out.println("Who should sit in seat #" + Seats[i] + "? \n");
      String NextLine = getScanner.nextLine();
      Names[i] = NextLine;
    }
    
    // Tells the results
    System.out.println("\n");
    System.out.println("Here are the results: \n");
    
    int countloop = 0;
// The while loop that will loop and print each seat assigned by a student's name
    while (countloop < Names.length) {
      if (Names[countloop] == null || Names[countloop] ==  ""){ 
        System.out.println("Noone sits on seat #" + Seats[countloop]);
      }
      else if (Names[countloop] != null && Names[countloop] !=  ""){
        System.out.println(Names[countloop] + " sits on seat #" + Seats[countloop]);
      }

      countloop++;
    }

// Resolution
    System.out.println("\n");
    System.out.println("The teacher thanks you and gives you a homework pass. The End.\n");

// Closes scanner
    getScanner.close();

  }
}