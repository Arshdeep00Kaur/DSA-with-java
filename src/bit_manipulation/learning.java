package bit_manipulation;

import java.util.Scanner;

public class learning {
    public static void main(String args[]) {
//        get bit -------------------------
//        int n = 5; //0101
//        int pos = 3;
//        int bitMask = 1<<pos;


//        if((bitMask & n) == 0) {
//            System.out.println("bit was zero");
//        } else {
//            System.out.println("bit was one");
//        }

//        set bit : set bit to 1  ----------------------------
//        int newnumber = bitMask | n;
//        System.out.println(newnumber);

//        clear bit: set bit to 0 ------------------------------
//        int newbitmask = ~(bitMask);
//        int newnumber2=newbitmask & n;
//        System.out.println(newnumber2);

//        update bit : convert 0 to 1 or vice verca

        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        // oper=1 -> set; oper=0 -> clear
        int n2 = 5;
        int pos2 = 1;

        int bitMask3 = 1<<pos2;
        if(oper == 1) {
            //set
            int newNumber = bitMask3 | n2;
            System.out.println(newNumber);
        } else {
            //clear
            int newBitMask = ~(bitMask3);
            int newNumber = newBitMask & n2;
            System.out.println(newNumber);
        }

    }



}
