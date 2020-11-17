

import java.util.Scanner;

public class PersoneAmmalate_01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("persone che si ammaleranno");
        int amm = Integer.parseInt(inp.nextLine());
        System.out.println("popolazione totale");
        int pop = Integer.parseInt(inp.nextLine());
        int cont=0;
        for (int i=1; i<(pop/2);i=i){
            i += i*amm;
            cont += 1;
        }
        System.out.println("ci sono voluti " + cont + " giorni");
}
}
