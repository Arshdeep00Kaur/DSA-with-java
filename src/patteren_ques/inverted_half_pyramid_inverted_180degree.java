package patteren_ques;

public class inverted_half_pyramid_inverted_180degree {
    public static void main(String[] args){
        int n=4;// no.of rows
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){  // for space
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
