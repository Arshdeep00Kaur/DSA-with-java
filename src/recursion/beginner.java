package recursion;

public class beginner {
    public static void main(String[] args){
        //Print numbers from 1 to 5.
        printNumbers(5);
    }
    public static void printNumbers(int n) {
        if(n == 5) {
            return;
        }
        /// //////hbyubunhuhiouj
        System.out.println(n);
        printNumbers(n+1);
    }
}
