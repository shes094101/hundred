import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        // write your code here
        Scanner src =new Scanner(System.in);
        String x=src.nextLine();
        for (int i=x.length()-1; i>=0 ; i++){
            char a =x.charAt(i);
            System.out.print(a);
        }
    }
}
