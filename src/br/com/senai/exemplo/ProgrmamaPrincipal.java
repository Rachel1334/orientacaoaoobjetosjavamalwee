package br.com.senai.exemplo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgrmamaPrincipal {

	public static void main(String[] args) {
		
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		Pessoa pessoa4 = new Pessoa();
		//QUANDO USA ( NEW )TÁ TRABALHANDO COM OBJETO 
		//SET ATRIBUI ALGUMA COISA 
		//GET IMPRIME ESSA COISA  
		
		pessoa1.setNome("Rachel");
		pessoa1.setAnoDeNascimento(2003);
		pessoa1.setSexo("F");
		
		pessoa2.setNome("Junior");
		pessoa2.setAnoDeNascimento(1998);
		pessoa2.setSexo("M");
		
		pessoa3.setNome("luiz");
		pessoa3.setAnoDeNascimento(2007);
		pessoa3.setSexo("M");
		
		pessoa4.setNome("Apolo");
		pessoa4.setAnoDeNascimento(1987);
		pessoa4.setSexo("M");
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		pessoas.add(pessoa4);
		
		for(Pessoa people : pessoas) {

		System.out.println(people.getNome());
		System.out.println(people.getAnoDeNascimento());
		System.out.println(people.getSexo());
		System.out.println("----------------");
		
		System.out.println("----PESSOAS COM FOR----");
		for(int i = 0; i <pessoas.size(); i++) {
			System.out.println(pessoas.get(i));
			System.out.println("---------------------");
		}
		System.out.println("----PESSOAS COM FOREACH----");
		for(Pessoa people1 : pessoas) {
			System.out.println(people1);
			System.out.println("------------------------");	
		}
		System.out.println("PESSOAS COM FOREACH Lambda");
		pessoas.forEach(aluno -> {
			System.out.println(aluno.getNome());
			System.out.println(aluno.getAnoDeNascimento());
			System.out.println(aluno.getSexo());
			System.out.println("************************");
			
		});
		Scanner tec = new Scanner(System.in);
		MetodoController metodocontroller = new MetodoController();
		
		System.out.println("----TABUADA----");
	    metodocontroller.multiplicar();
		
		System.out.println("----SOMA DE DOIS VALORES----");
		System.out.println("A soma dá: " + metodocontroller.somar());
		
		System.out.println("----SUBTRAÇÃO DE VALORES POR PARAMETRO-----");
		System.out.println("Informe o primeiro valor: ");
		int valor1 = tec.nextInt();
		System.out.println("Informe o segundo valor:"); 
		int valor2 = tec.nextInt();
		
		System.out.println("A subtração dá: "
		+ metodocontroller.subtrair(valor1, valor2));
		}
		
	}

}