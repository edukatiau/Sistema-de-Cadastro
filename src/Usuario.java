public class Usuario {
    String name;
    String email;
    String senha;

    public Usuario() {
        
    }

    public Usuario(String name, String email, String senha) {
        this.name = name;
        this.email = email;
        this.senha = senha;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "[Nome: " + getName() +
                ", Email: " + getEmail() +
                ", Senha: " + getSenha() +
                "]";

    }
}
