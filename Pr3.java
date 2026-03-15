import java.util.*;
public class Pr3 {
    public static void main(String[] args) {
        char x;
        Scanner in = new Scanner(System.in);
        System.out.print("enter a alphabet or character ");
        x = in.next().charAt(0);
        if(x == 'a'||x == 'e' || x == 'i'|| x== 'o'||x ==  'u'|| x == 'A'|| x == 'E'|| x== 'I'||x == 'O'|| x =='U' ){
            System.out.print("the character is vowel");
        }
        else{
            System.out.println("the character in not vowel");
        }
    }
}
