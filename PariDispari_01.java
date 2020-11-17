
import java.util.Scanner;

public class PariDispari_01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("inserire numero: ");
        int n1 = inp.nextInt();
        String nt = n1+"";
        int c = nt.length();
        int ntt;
        int pari = 0, dispari = 0;
        for (int i=0; i<c; i++){
            ntt = Integer.parseInt(nt.substring((c-i)-1,c-i));
            if (ntt%2 == 0){
                pari += 1;
            }else{
                dispari += 1;
            }
        }
        System.out.println("ha " + pari + " cifre pari \nha " + dispari + " cifre dispari");
    }
}
