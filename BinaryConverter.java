import java.util.Scanner;

 class BinaryConverter {

  public static void main(String[] args) {

    Scanner user_input = new Scanner (System.in);

    String data;
    System.out.print("Enter in data: ");
    data = user_input.next();


    System.out.println("your input was: " + data);
  }

}
