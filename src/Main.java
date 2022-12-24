import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Please, write number which would you reverse: ");

        Scanner scanner = new Scanner(System.in);

        String snum = scanner.next();

         StringBuffer rev = new StringBuffer(snum);

         rev.reverse();


        System.out.println("Reversed number: "+rev);


        int i;


        for (i = 0; i < 10; i++) {


            if (snum.indexOf("" + i) > -1) {

                    System.out.println("Min number: "+i);
                    break;

            }
        }

        for (i = 9; i >= 0; i--) {

            if (snum.indexOf("" + i) > -1) {

                System.out.println("Max number: "+i);
                break;
            }


        }

    }
}



