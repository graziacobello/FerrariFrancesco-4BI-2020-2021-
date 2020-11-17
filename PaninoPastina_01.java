
import java.util.Scanner;

public class PaninoPastina_01 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("soldi di Mario: ");
        float sol = Float.parseFloat(inp.nextLine());
        int cont=0, contPas=0, contPan=0, scelta = 0;
        for (int i=0;sol>=1;){
            System.out.print("cosa vuoi mangiare panino(1) o pastina(2)? ");
            scelta = Integer.parseInt(inp.nextLine());
            if (scelta == 1){
                if (sol < 1.5){
                    System.out.println("non hai i soldi per il panino ti mangi la pastina");
                    scelta = 2;
                }else{
                    sol -= 1.5;
                    contPan += 1;
                }
            }
            if (scelta == 2){
                sol -= 1;
                contPas += 1;
            }
            cont +=1;
        }
        System.out.println("ha mangiato " + cont + " volte al bar");
        System.out.println("ha mangiato " + contPan + " panini");
        System.out.println("ha mangiato " + contPas + " pastine");
    }
}
