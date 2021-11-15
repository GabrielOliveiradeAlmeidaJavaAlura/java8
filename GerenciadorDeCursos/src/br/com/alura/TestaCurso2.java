package br.com.alura;


public class TestaCurso2 {

 
	public static void main(String[] args) {
		Curso javaColeçoes = new Curso("Dominando as coleções do java", "Paulo Silveira");

		javaColeçoes.adiciona(new Aula("Trabalhando com Array List", 21));
		javaColeçoes.adiciona(new Aula("Criando uma aula", 20));
		javaColeçoes.adiciona(new Aula("Modelando com coleções", 21));
		
		System.out.println(javaColeçoes.getAulas());
		System.out.println(javaColeçoes.getTempoTotal());
		System.out.println(javaColeçoes);


	}

}
