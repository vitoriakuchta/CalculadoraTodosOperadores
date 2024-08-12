import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um calculo (EX. (2 * 2)): ");
        double valor1 = scan.nextDouble();
        char simbolo = scan.next().charAt(0);
        double valor2 = scan.nextDouble();
        double resultado = 0;

        if(simbolo == '+')
            resultado = valor1 + valor2;
        else if(simbolo == '-')
            resultado = valor1 - valor2;
        else if(simbolo == '*')
            resultado = valor1 * valor2;
        else if(simbolo == '/')
            resultado = valor1 / valor2;
        else
            System.out.println("Formato invalido!");

        System.out.println("Resultado: " + resultado);
    }
}