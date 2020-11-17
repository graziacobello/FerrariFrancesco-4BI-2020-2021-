
import java.util.Scanner;

public class ControlloInput_01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, s=0;
        System.out.print("inserire numero: ");
        n = inp.nextInt();
        while (n!=0){
            if (n>0){
                s += n;
            }
            System.out.print("inserire numero: ");
            n = inp.nextInt();
        }
        System.out.println("la somma è " + s);
    }
}
