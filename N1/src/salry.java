import java.util.Scanner;

public class salry {
    public static void main(String[] args){
        Scanner salary = new Scanner(System.in);
        Scanner userprom = new Scanner(System.in);

        System.out.print("digite seu salario: ");
        double userSalary = salary.nextDouble();

        System.out.print("escolha entre 5% ou 6% de aumento.");
        int salarypomote = userprom.nextInt();

        double result = salarypomote == 6 ? userSalary * 1.06  : userSalary * 1.05;
        System.out.println(result   );


    }
}
