import java.util.Scanner;

 class BinaryConverter {

  public static void main(String[] args) {

    Scanner user_input = new Scanner (System.in);

    String data;
    System.out.print("Enter in data: ");
    data = user_input.next();

    int charCode = Integer.parseInt(data, 2);
    String str = new Character((char)charCode).toString();

    System.out.println("your input was: " + str);
  }

}
