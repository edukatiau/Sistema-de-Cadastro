package system;
import java.util.Scanner;

import users.Aluno;
import users.Professor;
import users.Usuario;

public class SistemaCadastro {

    public static void main(String[] args) {
        Usuario[] usuarios = new Usuario[3];
        
        System.out.println(" _____  _       _                                 _         _____             _              _\n"
        		+ "/  ___|(_)     | |                               | |       /  __ \\           | |            | |\n"
        		+ "\\ `--.  _  ___ | |_   ___  _ __ ___    __ _    __| |  ___  | /  \\/  __ _   __| |  __ _  ___ | |_  _ __   ___\n"
        		+ " `--. \\| |/ __|| __| / _ \\| '_ ` _ \\  / _` |  / _` | / _ \\ | |     / _` | / _` | / _` |/ __|| __|| '__| / _ \\\n"
        		+ "/\\__/ /| |\\__ \\| |_ |  __/| | | | | || (_| | | (_| ||  __/ | \\__/\\| (_| || (_| || (_| |\\__ \\| |_ | |   | (_) |\n"
        		+ "\\____/ |_||___/ \\__| \\___||_| |_| |_| \\__,_|  \\__,_| \\___|  \\____/ \\__,_| \\__,_| \\__,_||___/ \\__||_|    \\___/\n");
        
        menu(usuarios);
    }

    public static void menu(Usuario[] usuarios) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n-----------------------------");
        System.out.println("| Selecione uma das opcoes: |");
        System.out.println("| 1 - Cadastro Aluno        |");
        System.out.println("| 2 - Cadastro Professor    |");
        System.out.println("| 3 - Login                 |");
        System.out.println("| 4 - Listar Usuarios       |");
        System.out.println("| 0 - Sair                  |");
        System.out.println("-----------------------------");
        System.out.print("| Opção escolhida: ");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                cadastroAluno(usuarios);   
                break;
                
            case 2:
                cadastroProfessor(usuarios); 
                break;
            
            case 3:
                login(usuarios);
                break;

            case 4:
                listarUsuarios(usuarios);
                break;
                
            case 0:
                break;

            default:
                System.out.println("Erro.");
        }
        sc.close();
    }

    public static void listarUsuarios(Usuario[] usuarios){
        System.out.println("\n-----------------------------------------------------------------------------");
    	System.out.println("| Usuários cadastrados:");  
        for(Usuario i : usuarios) {
        	System.out.print("| ");
        	System.out.println(i);
        }
        System.out.println("-----------------------------------------------------------------------------");
        
        menu(usuarios);
    }
    
    public static void login(Usuario[] usuarios) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Senha: ");
        String senha = sc.nextLine();
        for (int i = 0; i < usuarios.length; i++) {

            if (usuarios[i] != null) {
                if (usuarios[i].getEmail().equals(email) && usuarios[i].getSenha().equals(senha)) {
                    System.out.printf("Seja bem-vindo, %s!", usuarios[i].getName());
                    break;
                }
            }else{
                System.out.println("E-mail ou senha inválidos.");
                break;
            }

        }
        menu(usuarios);
        sc.close();
    }

    public static void cadastroAluno(Usuario[] usuarios) {
        Scanner sc = new Scanner(System.in);
        System.out.print("| Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.print("| Informe seu email: ");
        String email = sc.nextLine();
        System.out.print("| Informe uma senha: ");
        String senha = sc.nextLine();
        System.out.print("| Informe sua matricula: ");
        String matricula = sc.nextLine();
        System.out.print("| Informe sua idade: ");
        String idade = sc.nextLine();
        System.out.println("-----------------------------");

        for (int i = 0; i < usuarios.length; i++) {

            if (usuarios[i] != null) {
            	if(usuarios[i].getEmail().equals(email)) {
            		System.out.println("E-mail já cadastrado");
            		break;
            	}
                continue;
            } else {
                usuarios[i] = new Aluno(nome, email, senha, matricula, idade);
                System.out.println("Usuário cadastrado com sucesso!");
                break;
            }
        }

        menu(usuarios);
        sc.close();
    }
    
    public static void cadastroProfessor(Usuario[] usuarios) {
        Scanner sc = new Scanner(System.in);
        System.out.print("| Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.print("| Informe seu email: ");
        String email = sc.nextLine();
        System.out.print("| Informe uma senha: ");
        String senha = sc.nextLine();
        System.out.print("| Informe sua disciplina: ");
        String disciplina = sc.nextLine();
        System.out.print("| Informe seu salário: ");
        String salario = sc.nextLine();
        System.out.println("-----------------------------");

        for (int i = 0; i < usuarios.length; i++) {
            
            if (usuarios[i] != null) {
            	if(usuarios[i].getEmail().equals(email)) {
            		System.out.println("E-mail já cadastrado");
            		break;
            	}
                continue;
            } else {
                usuarios[i] = new Professor(nome, email, senha, salario, disciplina);
                System.out.println("Usuário cadastrado com sucesso!");
                break;
            }
        }

        menu(usuarios);
        sc.close();
    }
}
