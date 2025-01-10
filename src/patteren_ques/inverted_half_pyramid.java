package patteren_ques;

public class inverted_half_pyramid {
    public static void main(String[] args){
        for(int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
