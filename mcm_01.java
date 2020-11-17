
import java.util.Scanner;

public class mcm_01{

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("numero 1: ");
        int n1 = inp.nextInt();
        System.out.print("numero 2: ");
        int n2 = inp.nextInt();
        int m1 = n1, m2 = n2;     //multipli
        boolean check = true;
        while (check){
            if (m1 == m2){
                check = false;
            }else{
                if (m1<m2){
                    m1 += n1;
                }else{
                    m2 += n2;
                }
            }
        }
        System.out.println("il mcm di " + n1 + ", " + n2 +" è " + m1);
    }
}
