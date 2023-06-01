package Exercicio3;

import java.util.Scanner;

    public class ExercicioSalario {

	public static void main(String[] args) {
	 
     float salariobruto,adicionalnoturno,horasextras,descontos,salarioliquido;
     
     Scanner leia = new Scanner(System.in);
     System.out.println("Digite o salario bruto: ");
     salariobruto = leia.nextFloat();
     
     System.out.println("Digite o adicional noturno: ");
     adicionalnoturno = leia.nextFloat();
     
     System.out.println("Digite horas extras: ");
     horasextras = leia.nextFloat();
     
     System.out.println("Digite descontos: ");
     descontos = leia.nextFloat();
     
     System.out.println("Digite o salario liquido: ");
     salarioliquido = leia.nextFloat();
     
     System.out.println("\nsalario liquido: " + salarioliquido);
	}

}
