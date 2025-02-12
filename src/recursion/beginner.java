package recursion;

public class beginner {
    public static void main(String[] args){
//        int n=5;
        int n=1;
//        printnumb(n);
        printno(n);

    }
//    public static void printnumb(int n){
//        if (n==0){
//            return;
//        }
//        System.out.println(n);
//        printnumb(n-1);
//    }

    // print numbers from 1 to 5
    public static void printno(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        printno(n+1);
    }
}
