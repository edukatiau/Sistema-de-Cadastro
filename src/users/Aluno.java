package users;

public class Aluno extends Usuario{

	private String matricula;
	private String idade;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String email, String senha, String matricula, String idade) {
		super(nome, email, senha);
		this.matricula = matricula;
		this.idade = idade;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Aluno [nome = "+ name + ", email = "+ email + ", senha = "+ senha + ", matricula=" + matricula + ", idade=" + idade + "]";
	}

}
