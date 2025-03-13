package zona_fit;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;

public class LoginForm extends JFrame{
    private JPanel panelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarBoton;

    public  LoginForm(){
        inicializarForm();
    }

    private void inicializarForm() {
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // Centramos ventana
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup(); // Cambia look and feel a modo dark
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}
