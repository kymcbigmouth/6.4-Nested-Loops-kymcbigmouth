import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter number of rows and smash that enter key:");
    int rows = in.nextInt();
    int count = 0;
    for(int x=rows; x>=0;x--) {
      for (int m = 1; m <= count; m++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= (2 * x) - 1; k++) {
        System.out.print("*");
      }

      count++;
      System.out.println();
      rows--;
    }
  }
}
