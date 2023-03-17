
package model.servicos;

import model.entidades.Usuario;

public class LoginService {
    
    public static boolean validarLogin(String username, String senha, Usuario user) {
        if(user.isAtivo() && user.isOnline()){
            boolean controle = username.equals(user.getUsername()) && senha.equals(user.getSenha());
            mostrarMensagem(controle, user);
            return controle;
        } else {
            return false;
        }
    }
    
    private static void mostrarMensagem(boolean logou, Usuario user){
        if(logou){
            System.out.println("Usuário " + user.getUsername() + " logou no sistema.");
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }
}
