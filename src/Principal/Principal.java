/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Drew
 */
public class Principal implements Runnable {
    
    public static void main(String[] args) {
        Principal telaPrincipal = new Principal();
        
        Thread thread = new Thread(telaPrincipal); 
        
        thread.start();
    }

    @Override
    public void run() {
        // instanci a tela principal da aplicação
        FrameSistema frame = new FrameSistema();
        
        // exibe a tela principal para usuario
        frame.setVisible(true);
    }
    
}
