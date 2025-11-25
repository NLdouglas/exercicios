import  java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Para calcular uma circulo vamos usar a formula A=piR ao quadrado");
        System.out.println("Vamos usar o r ( raio ) com o numero 2, para calcular o raio faça RxR");
        int calculoQuadrado = 7 *7;
        double pi = 3.14;
        System.out.println(calculoQuadrado + "depois  multiplique por Pi 3,14");
        System.out.println(calculoQuadrado * pi + "cm");


        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("Calcular dobro, triplo e raiz quadrada");

        Scanner number = new Scanner(System.in);
        System.out.print("Digite um numero: ");

        double numberUser = number.nextDouble();
        System.out.println("dobro: " + numberUser*2);
        System.out.println("triplo: " + numberUser*3);
        System.out.println("Raiz: " + Math.sqrt(numberUser));

        System.out.println("----------------------------------------------------------------------------------");

        System.out.println("Sua idade em dias!!");

        Scanner idadeScanner = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idadeUser = idadeScanner.nextInt();

        System.out.println(idadeUser * 365);



    }
}