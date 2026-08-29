import java.util.Scanner;

class StringPrinter {
    
    String text;

    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        text = sc.nextLine();
    }

    void printOneByOne() {
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        
        StringPrinter obj = new StringPrinter();

        obj.getInput();
        obj.printOneByOne();
    }
}
