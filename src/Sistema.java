import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AuthService autenticacao = new AuthService();
        int opcao;

        do{
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Registrar Usuário");
            System.out.println("2 - Fazer Login");
            System.out.println("3 - Fazer Logout");
            System.out.println("4 - Exibir Registros de Usuários");
            System.out.println("5 - Verificar se está autenticado");
            System.out.println("6 - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite seu nome: ");
                    String nome = scanner.nextLine();

                    System.out.println("Informe seu email: ");
                    String email = scanner.nextLine();

                    System.out.println("Informe sua senha: ");
                    String senha = scanner.nextLine();

                    autenticacao.registrarUsuario(nome, email, senha);
                    break;

                case 2:
                    System.out.println("Digite seu email: ");
                    String emailLogin = scanner.nextLine();

                    System.out.println("Digite sua senha: ");
                    String senhaLogin = scanner.nextLine();

                    autenticacao.logar(emailLogin, senhaLogin);
                    break;

                case 3:
                    autenticacao.logout();
                    break;

                case 4:
                    autenticacao.exibirRegistros();
                    break;

                case 5:
                    autenticacao.estaAutenticado();
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;
            }
        } while (opcao != 6);

        scanner.close();
    }
}
