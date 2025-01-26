package string_Builder;

public class ques_ {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("HeloooooArshuuuu");
        for(int i=0;i<sb.length()/2;i++){
            int front = i;
            int end = sb.length()-i-1;

            char frontchar = sb.charAt(front);
            char endchar = sb.charAt(end);

            sb.setCharAt(front,endchar);
            sb.setCharAt(end,frontchar);
        }
        System.out.println(sb);
    }
}
