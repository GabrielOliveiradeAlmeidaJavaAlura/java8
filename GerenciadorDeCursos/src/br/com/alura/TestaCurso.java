package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

 
	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções do java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com Array List", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 21));
		 List<Aula> aulasImutaveis = javaColecoes.getAulas();
		 ArrayList<Aula> aulas = new ArrayList<>(aulasImutaveis);
		 Collections.sort(aulas);
		 
		 System.out.println(aulas);
         
	}

}
