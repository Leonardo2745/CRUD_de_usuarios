package com.ladc.crud_de_usuarios;

import com.ladc.crud_de_usuarios.controller.UserController;
import com.ladc.crud_de_usuarios.model.Usuario;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        UserController vc = new UserController();
        vc.cadastrarUsuario(new Usuario("Leonardo","Augusto",new Date(),
                6577464,'M',"Carrapato","Ladekzada","1234","leonardo@gmail.com"));
    vc.listarUsuarios();
    }

}
