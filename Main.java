import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the amount of rows you want and press enter:");

    int rows=in.nextInt();
    for (int i = 1; i <= rows; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println("");

    }
  }

}
