
import java.util.Scanner;

public class LavandinoOtturato_01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("scarico del lavandino: ");
        int x = Integer.parseInt(inp.nextLine());
        System.out.print("perdita: ");
        int y = Integer.parseInt(inp.nextLine());
        System.out.print("livello iniziale dell'acqua: ");
        int lv = Integer.parseInt(inp.nextLine());
        System.out.print("portata massima: ");
        int cap = Integer.parseInt(inp.nextLine());
        System.out.println("livello: " + lv);
        for (int i=0; i<20; i++){
            lv += y;
            lv -= x;
            System.out.println("livello: " + lv);
            if (lv>cap || lv<=0){
                i = 20;
            }
        }
    }
}
