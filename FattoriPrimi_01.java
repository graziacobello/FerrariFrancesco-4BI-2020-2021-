import java.util.Scanner;

public class FattoriPrimi_01 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n,d=2;
        String fattori="";
        System.out.println("inserire il numero da fattorizzare");
        n= inp.nextInt();
        while(n!=1){
            while(n%d!=0){
                d+=1;
            }
            fattori+=d+" ";
            n/=d;
        }
        System.out.println(fattori);
    }
}
