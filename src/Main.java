import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Please, write number: ");
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

        boolean t = true;

        for (i = 0; i < 10; i++){

            if(snum.indexOf("" + i) != snum.lastIndexOf("" + i)){
                t = false;
                break;
            }
        }
        System.out.println(t);
    }
}



