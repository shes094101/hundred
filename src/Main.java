import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner src =new Scanner(System.in);
        String x =src.nextLine();
        int o=0;
        for (int i=0 ; i<x.length() ; i++){
            char a =x.charAt(i);
            o=o+Character.getNumericValue(a); }
        System.out.println(o);
    }
}
