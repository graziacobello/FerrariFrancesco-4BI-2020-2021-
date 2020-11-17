
import java.util.Scanner;

public class QuanteCifre_01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("compratore 1: ");
        int n = Integer.parseInt(inp.nextLine());
        int i = 1;
        while(n/10>0){
            n = n/10;
            i++;
        }
        System.out.println("il numero è composto da " + i + " cifre");
    }
}
