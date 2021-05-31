package br.com.senai;

public class segundo {
	package br.com.senai.exemplo;

	import java.util.ArrayList;
	import java.util.List;

	public class ProgrmamaPrincipal {

		public static void main(String[] args) {
			
			List<Pessoa> pessoa = new ArrayList<Pessoa>();
			
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
								    //.NOME)TBM VAI
			System.out.println("----PESSOA 1----");
			System.out.println(pessoa1.getNome());
			System.out.println(pessoa1.getAnoDeNascimento());
			System.out.println(pessoa1.getSexo());
			System.out.println("----------------");
			
			System.out.println("----PESSOA 2----");
			System.out.println(pessoa2.getNome());
			System.out.println(pessoa2.getAnoDeNascimento());
			System.out.println(pessoa2.getSexo());
			System.out.println("----------------");
			
			System.out.println("----PESSOA 3----");
			System.out.println(pessoa3.getNome());
			System.out.println(pessoa3.getAnoDeNascimento());
			System.out.println(pessoa3.getSexo());
			System.out.println("----------------");
			
			System.out.println("----PESSOA 4----");
			System.out.println(pessoa4.getNome());
			System.out.println(pessoa4.getAnoDeNascimento());
			System.out.println(pessoa4.getSexo());
			System.out.println("----------------");

			//pessoa.nome = "SAARAH";
			//System.out.println(pessoa.getNome());
		}
	}

}
