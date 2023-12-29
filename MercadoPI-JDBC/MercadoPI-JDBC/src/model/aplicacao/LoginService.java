package model.aplicacao;

import data.UsuarioDAO;
import java.sql.SQLException;

public abstract class LoginService {

    private static Usuario usuarioLogado;

    public static boolean validarLogin(String username, String senha) throws SQLException, Exception {
        usuarioLogado = UsuarioDAO.validarUsuario(username, senha);
        return !(usuarioLogado == null) && usuarioLogado.isAtivo();
    }

    public static Usuario retornarUsuarioLogado() {
        return usuarioLogado;
    }

}
