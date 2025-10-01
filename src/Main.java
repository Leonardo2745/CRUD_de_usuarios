import java.util.Date;

public class Main {

    public static void main(String[] args) {
        UserController vc = new UserController();
        vc.cadastrarUsuario(new Usuario("Leonardo","Augusto",new Date(),01234,'M',"Carrapato","Ladekzada","1234","leonardo@gmail.com"));
    vc.listarUsuarios();
    }

}
