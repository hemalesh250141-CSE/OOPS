
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int sum = 0;
        for(char c : s.toCharArray())
            if(c == '2' || c == '3' || c == '5' || c == '7')
                sum += c - '0';
        System.out.println(sum);
    }
}
