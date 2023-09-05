import java.util.Scanner;

public class SistemaCadastro {

    public static void main(String[] args) {
        Usuario[] usuarios = new Usuario[3];

        menu(usuarios);
    }

    public static void menu(Usuario[] usuarios) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n-----------------------------");
        System.out.println("| Selecione uma das opcoes: |");
        System.out.println("| 1 - Cadastro              |");
        System.out.println("| 2 - Login                 |");
        //System.out.println("| 3 - Listar Usuarios       |");
        System.out.println("| 0 - Sair                  |");
        System.out.println("-----------------------------");
        System.out.print("| Opção escolhida: ");
        int escolha = sc.nextInt();

        switch (escolha) {
            case 1:
                cadastro(usuarios);    
                break;

            case 2:
                login(usuarios);
                break;

            /*case 3:
                listarUsuarios(usuarios);
                break;
            */
            case 0:
                break;

            default:
                System.out.println("Erro.");
        }
        sc.close();
    }

    /*public static void listarUsuarios(Usuario[] usuarios){
        System.out.println("");
        for (int i = 0; i < usuarios.length; i++) {
            System.out.println(usuarios[i]);
        }
        menu(usuarios);
    }*/

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

    public static void cadastro(Usuario[] usuarios) {
        Scanner sc = new Scanner(System.in);
        System.out.print("| Informe seu nome: ");
        String nome = sc.nextLine();
        System.out.print("| Informe seu email: ");
        String email = sc.nextLine();
        System.out.print("| Informe uma senha: ");
        String senha = sc.nextLine();
        System.out.println("-----------------------------");

        for (int i = 0; i < usuarios.length; i++) {
            
            /* 
            //Tentei começar uma verificação para ver se já há um usuário com e-mail e senha cadastrados, mas não deu tempo :)
            if (usuarios[i].getEmail().equals(email) && usuarios[i].getSenha().equals(senha)){
                System.out.println("Usuário já existe.");
                break;
            }
            */
            
            
            if (usuarios[i] != null) {
                continue;
            } else {
                usuarios[i] = new Usuario(nome, email, senha);
                System.out.println("Usuário cadastrado com sucesso!");
                break;
            }
        }

        menu(usuarios);
        sc.close();
    }
}
