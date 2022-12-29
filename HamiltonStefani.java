package exerciciospropostos05;

import java.util.Locale;
import java.util.Scanner;

public class HamiltonStefani {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.println("O jogo durou: " + duracao + "Horas");
		
		sc.close();

	}

}
