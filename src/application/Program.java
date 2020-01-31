package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.FisicPeoples;
import entities.JuridicPeoples;
import entities.Peoples;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		List <Peoples> pessoas = new ArrayList<>();
		
		System.out.print("Digite o número de funcionarios a serem lidos: ");
		int n = in.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Pessoa número " + i + ": ");
			System.out.print("Pessoa fisica ou juridica (f/i): ");
			char c = in.next().charAt(0);
			System.out.print("Name: ");
			in.nextLine();
			String name = in.nextLine();
			System.out.print("Valor anual: ");
			double valueYear = in.nextDouble();
			
			if (c == 'f') {
				System.out.print("Valor com hospitais: ");
				double valueHospital = in.nextDouble();
				pessoas.add(new FisicPeoples(name, valueYear, valueHospital));
			}else if (c == 'i') {
				System.out.print("Número de funcionarios: ");
				int number = in.nextInt();
				pessoas.add(new JuridicPeoples(name, valueYear, number));
			}
		}
		
		double soma = 0.0;
		
		System.out.println();
		System.out.println("Valores de Taxa: ");
		for (Peoples p : pessoas) {
			System.out.println(p.getName() + "   $" + String.format("%.2f", p.impost()));
			soma += p.impost();
		}
		
		System.out.println();
		System.out.println("Soma total de taxas: " + String.format("%.2f", soma));
		
		in.close();
	}

}
