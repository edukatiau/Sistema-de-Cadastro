package users;

public class Professor extends Usuario{
	
	private String salario;
	private String disciplina;
	
	public Professor() {
		
	}
	
	public Professor(String nome, String email, String senha ,String salario, String disciplina) {
		super(nome, email, senha);
		this.salario = salario;
		this.disciplina = disciplina;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Professor [nome = "+ name + ", email = "+ email + ", senha = "+ senha + ", salario=" + salario + ", disciplina=" + disciplina + "]";
	}
	
}
