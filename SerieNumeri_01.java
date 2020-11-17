
import java.util.Scanner;

public class SerieNumeri_01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("inserire numero: ");
        int n1 = Integer.parseInt(inp.nextLine());
        System.out.print("inserire numero: ");
        int n2 = Integer.parseInt(inp.nextLine());
        int cont = 1;
        while (n2>n1){
            cont += 1;
            n1 = n2;
            System.out.print("inserire numero: ");
            n2 = Integer.parseInt(inp.nextLine());
        }
        System.out.println("sono stati inseriti " + cont + " numeri");
    }
}
