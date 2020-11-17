
import java.util.Scanner;

public class PosizioneCifra_01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("inserire numero: ");
        int n1 = inp.nextInt();
        boolean check=true;
        String nt = n1+"";
        int c = nt.length();
        int ntt;
        ntt = Integer.parseInt(nt.substring(0,1));
        for (int i=0; i<c; i++){
            ntt = Integer.parseInt(nt.substring((c-i)-1,c-i));
            if ((ntt-i)<0){
                check = false;
                i = c;
            }
        }
        if (check){
            System.out.println("proprietà rispettata");
        }else{
            System.out.println("proprietà non rispettata");
        }
    }
}
