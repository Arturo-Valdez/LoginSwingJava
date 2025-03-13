package zona_fit;

import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JPanel panelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarBoton;

    public  LoginForm(){
        inicializarForm();
        enviarBoton.addActionListener(e -> validar());
    }

    private void validar() {
        /// Leer los valores
        var usuario = this.usuarioTexto.getText();
        var password = new String(this.passwordTexto.getPassword());
        if("root".equals(usuario) && "admin".equals(password)){
            mostrarMensaje("Datos correctos, bienvenido!!");
        }else if("root".equals(usuario)){
            mostrarMensaje("Password incorrecto");
        } else if ("admin".equals(password)) {
            mostrarMensaje("Usuario incorrecto");
        }else{
            mostrarMensaje("USUARIO Y CONTRASEÑA INCORRECTOS");
        }

    }

    //PANEL DE UN RECUADRO DE TEXTO
    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
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
