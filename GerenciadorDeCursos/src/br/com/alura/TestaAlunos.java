package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		
		alunos.add("Rodrigo");
		alunos.add("Alberto");
		alunos.add("Nico");
		alunos.add("Sergio");
		alunos.add("Renan");
		alunos.add("Mauricio");
		alunos.add("Alberto");

		boolean pauloEstaMatriculado= alunos.contains("Paulo");
		alunos.remove("Sergio");
		
		System.out.println(pauloEstaMatriculado);
		System.out.println(alunos.size());
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		System.out.println(alunos);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
	}

}
