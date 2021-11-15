package br.com.alura;

public class Aluno {

		private String nome;
		private int numeroMatricula;
		
		public Aluno(String Nome, int Numero) {
			 this.nome = Nome;
			this.numeroMatricula = Numero; 
			
		}
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			if(nome == null){
				throw new NullPointerException("Nome não pode ser nulo");
			}else {
			this.nome = nome;
			}
			}
		
		public int getNumeroMatricula() {
			return numeroMatricula;
		}
		public void setNumeroMatricula(int numeroMatricula) {
			this.numeroMatricula = numeroMatricula;
		}
		
		@Override
		public String toString() {
		
		return "["+ this.nome + ", " + this.numeroMatricula +"]";
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Aluno other = (Aluno) obj;
			if (nome == null) {
				if (other.nome != null)
					return false;
			} else if (!nome.equals(other.nome))
				return false;
			if (numeroMatricula != other.numeroMatricula)
				return false;
			return true;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((nome == null) ? 0 : nome.hashCode());
			result = prime * result + numeroMatricula;
			return result;
		}
				
}
