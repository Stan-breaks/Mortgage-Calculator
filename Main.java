import java.util.Scanner;

public class Main {
  public static void main(String[]args) {
    //getting the input from the stdin
    Scanner input = new Scanner(System.in);

    //printing to the stdout
    System.out.println("=== Simple Java CLI ===");
    System.out.print("Enter your name: ");
    String name = input.nextLine();

    System.out.print("Enter your age: ");
    int age = input.nextInt();

    System.out.println("\nHello, " + name + "!");
    System.out.println("You are " + age + " years old.");

    input.close();
  } 
}

