import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Please, write number which would you reverse: ");

        Scanner scanner = new Scanner(System.in);

         String snum = scanner.next();

         StringBuffer rev = new StringBuffer(snum);

         rev.reverse();

         int num = Integer.parseInt(String.valueOf(rev));

        System.out.println("Result: " + rev);


         }

        }



