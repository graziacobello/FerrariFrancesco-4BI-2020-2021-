
import java.util.Scanner;

public class DepositoBancario_01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("saldo: ");
        double saldo = Float.parseFloat(inp.nextLine());
        System.out.print("interesse: ");
        int inter = Integer.parseInt(inp.nextLine());
        System.out.print("soglia: ");
        int soglia = Integer.parseInt(inp.nextLine());
        int i;
        for (i=0; saldo<soglia; i++){
            saldo += (saldo/100)*inter;
        }
        System.out.println("il saldo supera la soglia dopo " + i + " anni");
    }
}
