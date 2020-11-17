import java.util.Scanner;


public class PersoneAmmalate_02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("persone ammalate : ");
        int amm = Integer.parseInt(inp.nextLine());
        System.out.print("percentuale persone guarite al giorno");
        int gua = Integer.parseInt(inp.nextLine());
        System.out.println(gua);
        int cont = 0;
        for (amm=amm; amm>100;amm=amm){
            amm -= (int)((amm/100)*gua);
            System.out.println(amm);
            cont += 1;
        }
        System.out.println("ci sono voluti " + cont + " giorni");
    }
}
