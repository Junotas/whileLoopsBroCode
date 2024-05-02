import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //while loop exe block if the condition is true
        String welcome ="Welcome ";

//open scanner and ask for name, defined name as the string the user inputs
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.nextLine();

        while(name.isBlank()){

            System.out.println("Enter your name: ");

            name = in.nextLine();

        }
        System.out.println("Welcome "+name+"!");


    }
}