package model.aplicacao;

import static java.awt.Frame.MAXIMIZED_BOTH;
import view.TelaDeLogin;

public class Main {

    public static void main(String[] args) {
        
        

        TelaDeLogin tela = new TelaDeLogin();
        tela.setVisible(true);
        tela.setExtendedState(MAXIMIZED_BOTH);
        tela.setTitle("Sistema");

    }

}
