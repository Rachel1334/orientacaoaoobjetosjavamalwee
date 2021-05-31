package br.com.senai.exemplo;

import java.util.Scanner;

public class MetodoController {
	Scanner tec = new Scanner(System.in);

	public void multiplicar() {

		System.out.println("Informe o valor: ");
		int valor = tec.nextInt();

		for (int i = 0; i <= 10; i++) {
			System.out.println(valor + "x" + i + "=" + (valor * i));

			// nome de metodos nome de calase primeira letra maiuscula
			// nome de funçao é sempre verbo
			// açao é com letras minusulas
		}
	}

	public int somar() {
		System.out.println("INFORME O PRIMEIRO VALOR: ");
		int valor1 = tec.nextInt();
		System.out.println("INFORME O SEGUNDO VALOR: ");
		int valor2 = tec.nextInt();

		int resultado = valor1 + valor2;
		return resultado;
	}

	public int subtrair(int valor1, int valor2) {
		int resultado = valor1 - valor2;

		return resultado;

	}
}
