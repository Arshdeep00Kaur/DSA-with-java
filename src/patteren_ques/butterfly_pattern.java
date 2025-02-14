package patteren_ques;

public class butterfly_pattern {
    public static void main(String[] args){
        int n=5;
        // first part
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //2nd part
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //third part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //reverse part
        for (int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //2nd part
            int spaces = 2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //third part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
