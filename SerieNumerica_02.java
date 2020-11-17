
import java.util.Scanner;

public class SerieNumerica_02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("inserire numero : ");
        int n1 = Integer.parseInt(inp.nextLine());
        System.out.print("inserire numero : ");
        int n2 = Integer.parseInt(inp.nextLine());
        while ((n1 != n2) || ((n1+n2)==10)){
            n1 = n2;
            System.out.print("inserire numero : ");
            n2 = Integer.parseInt(inp.nextLine());
        }
        if (n1 == n2){
            System.out.println("hai inserito 2 volte di fila il numero " + n1);
        }else{
            System.out.println("la somma degli ultimi 2 numeri è uguale a 10");
        }
    }
}
