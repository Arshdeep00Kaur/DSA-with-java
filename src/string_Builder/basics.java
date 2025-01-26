package string_Builder;

public class basics {
    public static void main(String[] args){
        StringBuilder sb= new StringBuilder("Arshuuuuu");
        System.out.println(sb);

        //get a character  from string
        System.out.println(sb.charAt(2));

        //set a character at index
        sb.setCharAt(0,'@');
        System.out.println(sb);

        // insert charcter at front of 0 index
        sb.insert(0,'A');
        System.out.println(sb);

        // add charcters at end
        sb.append('a');
        System.out.println(sb);

        // delete a char at some index
        sb.delete(0,1);
        System.out.println(sb);

        // length of string
        System.out.println(sb.length());
    }
}
