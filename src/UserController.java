import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Scanner;

public class UserController {
    private List<Usuario> usuarios;
    private Scanner leia;

    public UserController(List<Usuario> usuarios) {
        this.usuarios = usuarios;
        this.leia = new
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    //CRUD METHODS

    public void cadastrarUsuario(){
        System.out.println("#####CADASTRO DE USUÁRIO####");

        System.out.println("Digite o nome: ");
        String nome = leia.nextLine();

        System.out.println("Digite o Sobrenome: ");
        String sobrenome = leia.nextLine();

        System.out.println("Digite sua data de nascimento(YYYY/MM/DD)");
        Date dataNasc = new Date(leia.next());

        System.out.println("Digite o telefone: (número apenas)");
        int telefone = leia.nextInt();

        System.out.println("Digite o sexo:");
        char sexo = leia.next().charAt(0);

        System.out.println("Digite seu endereço:");
        String endereco = leia.nextLine();

        System.out.println("Digite seu email");
        String email = leia.nextLine();

        System.out.println("Digite seu nome de usuário para Login: (não pode haver espaço)");
        String login = leia.nextLine().toLowerCase().trim();

        System.out.println("Digite a senha:");
        String senha = leia.nextLine();


            Usuario novoUsuario = new Usuario(nome,sobrenome,dataNasc,telefone,sexo,endereco,email,login,senha);
        


        public void listarUsuarios(){
            for (int i = 0; i < usuarios.size(); i++) {
                System.out.println(usuarios.get(i).info());
            }
        }
    }
}
