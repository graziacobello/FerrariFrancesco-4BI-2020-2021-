
import java.util.Scanner;

public class SerieNumeri_02 {
    public static boolean Primo(int n){
        boolean check = true;
        for (int i=2; i<n; i++){
            if (n % i == 0){
                check = false;
                i = n;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, cp=0;
        System.out.print("inserire numero: ");
        n = inp.nextInt();
        while (n!=1){
            if (Primo(n)){
                cp += 1;
            }
            System.out.print("inserire numero: ");
            n = inp.nextInt();
        }
        System.out.println("ci sono " + cp + " numeri primi");
    }
}
