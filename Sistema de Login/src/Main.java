import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    JFrame janela = new JFrame("Login");
    janela.setSize(600, 500);
   janela.setLayout(null);

   JLabel label = new JLabel("Email");
   label.setBounds(60, 50, 60, 40);

   JTextField iEmail = new JTextField();
    iEmail.setBounds(60, 80, 300, 40);

    JLabel senha = new JLabel("Senha");
    senha.setBounds(60, 110, 260, 40);

    JTextField iSenha = new JTextField();
    iSenha.setBounds(60, 140, 300, 40);

    JButton btn = new JButton("Entrar");
    btn.setBounds(140, 190, 100, 30);

    btn.addActionListener(e -> {
        if ("123456".equals(iSenha.getText()) && "admin@senai.com".equals(iEmail.getText())){
            JOptionPane.showMessageDialog(null, "Login realizado com sucesso");
        }else if ("".equals(iEmail.getText()) || "".equals(iSenha.getText())){
            JOptionPane.showMessageDialog(null,"Todos os campos precisam ser preenchidos");
        } else {
            JOptionPane.showMessageDialog(null, "Login Invalido");
        }
    });


    JButton btnLimpar = new JButton("Limpar");
    btnLimpar.setBounds(250, 190, 100, 30);
    btnLimpar.addActionListener(e -> {
        iEmail.setText("");
        iSenha.setText("");
    });

    janela.add(btnLimpar);
    janela.add(btn);
    janela.add(iSenha);
    janela.add(senha);
    janela.add(iEmail);
    janela.add(label);
    janela.setVisible(true);
}
