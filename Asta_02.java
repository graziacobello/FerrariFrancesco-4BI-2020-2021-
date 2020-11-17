
import java.util.Scanner;

public class Asta_02 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("compratore 1: ");
        int c1 = Integer.parseInt(inp.nextLine());
        System.out.print("compratore 2: ");
        int c2 = Integer.parseInt(inp.nextLine());
        if (c2 < c1)
            c2 = 0;
        while (c1 != 0 && c2 != 0){
            System.out.print("compratore 1: ");
            c1 += Integer.parseInt(inp.nextLine());
            if (c1 < c2){
                c1 = 0;
            }else{
                System.out.print("compratore 2: ");
                c2 += Integer.parseInt(inp.nextLine());
                if (c2<c1)
                    c2 = 0;
            }
        }
        if (c1 ==0){
            System.out.println("compratore 2 ha vinto l'asta per la cifra di " + c2);
        }else{
            System.out.println("compratore 1 ha vinto l'asta per la cifra di " + c1);
        }
    }
}
