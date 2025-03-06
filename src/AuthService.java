import java.util.ArrayList;

public class AuthService {
    private ArrayList<Usuario> usuariosRegistrados;
    private Usuario usuarioLogado;

    public AuthService(){
        this.usuariosRegistrados = new ArrayList<>();
    }

    public void registrarUsuario(String nome, String email, String senha){
        Usuario usuario = new Usuario(nome, email, senha);
        usuariosRegistrados.add(usuario);

        System.out.println("Usuário Registrado!");
    }

    public void logar(String email, String senha){
        boolean loginBemSucedido = false;

        for(Usuario u: usuariosRegistrados){
            if(u.getEmail().equals(email) && u.getSenha().equals(senha)){
                System.out.println("Usuario Logado!");
                usuarioLogado = u;
                loginBemSucedido = true;
                break;
            }
        }
        if(!loginBemSucedido){
            System.out.println("Credenciais incorretas!");
        }
    }

    public void logout(){
        usuarioLogado = null;
        System.out.println("logout realizado!");
    }

    public boolean estaAutenticado(){
        if(usuarioLogado != null){
            System.out.println("Está logado!");
            return true;
        } else {
            System.out.println("Não está logado!");
            return false;
        }
    }

    public void exibirRegistros(){
        for(Usuario a: usuariosRegistrados){
            a.exibirInfo();
        }
    }
}
