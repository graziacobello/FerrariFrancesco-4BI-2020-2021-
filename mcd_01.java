
import java.util.Scanner;

public class mcd_01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("numero 1: ");
        int n1 = inp.nextInt();
        System.out.print("numero 2: ");
        int n2 = inp.nextInt();
        int mcd = 1;
        if (n1<n2){
            mcd = n1;
        }else{
            mcd =n2;
        }
        int i = mcd;
        while (i!=0){
            if (((n1%i) == 0) && ((n2%i)==0)){
                mcd = i;
                i = 0;
            }else{
                i--;
            }
        }
        /*
        for (mcd=mcd ; i==0; i--){
            System.out.println(i + "\t" + n1%i + "\t" + n2%i);
            if (((n1%i) == 0) && ((n2%i)==0)){
                mcd = i;
                i = 0;
            }
        }*/
        System.out.println("il mcd è " + mcd);
    }
}
