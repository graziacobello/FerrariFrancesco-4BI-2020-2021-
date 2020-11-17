
import java.util.Scanner;

public class Alghe_01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("inserire popolazione iniziale: ");
        float popi = Float.parseFloat(inp.nextLine());
        System.out.print("inserire popolazione finale: ");
        int popf = Integer.parseInt(inp.nextLine());
        int cont = 0;
        for (int i=0; popi<popf; i++){
            if ((i%2)==0){
                popi *= 2;
            }else{
                popi = ((popi/3)*2);
            }
            cont += 1;
        }
        System.out.println("ci hanno messo " + cont + " anni");
    }
}
