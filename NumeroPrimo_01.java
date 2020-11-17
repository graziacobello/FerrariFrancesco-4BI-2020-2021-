
import java.util.Scanner;

public class NumeroPrimo_01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("inserire numero: ");
        int n = inp.nextInt();
        boolean check = true;
        for (int i=2; i<n; i++){
            if (n % i == 0){
                check = false;
            }
        }
        if (check){
            System.out.println(n + "è primo");
        }else{
            System.out.println(n + "non è primo");
        }
    }
}
