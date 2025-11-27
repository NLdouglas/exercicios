import java.util.Scanner;

public class Celcius {
    public static void main(String[] args){
        Scanner temperatura = new Scanner(System.in);

        System.out.println("Digite uma temperautra em C: ");
        float digitegrau =temperatura.nextFloat();
        double conversa = (digitegrau * 1.8) + 32;
        System.out.println(conversa);

    }
}
