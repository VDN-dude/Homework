import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Please, write number: ");
        Scanner scanner = new Scanner(System.in);
        String snum = scanner.next();
        StringBuffer rev = new StringBuffer(snum);
//point 1
        rev.reverse();
        System.out.println("Reversed number: "+rev);
//point 2
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

//point 3
        boolean t = true;

        for (i = 0; i < 10; i++){

            if(snum.indexOf("" + i) != snum.lastIndexOf("" + i)){
                t = false;
                break;
            }
        }
        System.out.println(t);

// point 4
        String match = "0123456789";
        String RES = snum;
         for (int l = match.length(); l > 2 ; l-- ){
             match.substring(0);
             for(i = 0; i <= match.length()-l; i++) {
                 String found = match.substring(i, i+l);
                 if (RES.contains(found) == true){
                     StringBuffer reverse = new StringBuffer(found);
                     reverse.reverse();
                     RES = RES.replaceAll(found, " " + reverse + " ");
                     System.out.println("Found: "+ found + " result: " + reverse);
                 }
             }
         }
        System.out.println("number with spaces around revers values: " + RES);
    }
}


