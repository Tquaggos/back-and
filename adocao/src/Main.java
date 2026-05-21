import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


void main() {

    JFrame tela = new JFrame("Cadastro para Adoção");
    tela.setSize(500, 600);
    tela.setLayout(null);

    JLabel labelNome = new JLabel("Nome");
    labelNome.setBounds(20, 50, 150, 40);
    tela.add(labelNome);

    JTextField textNome = new JTextField();
    textNome.setBounds(20,80,250,40);
    tela.add(textNome);



    JLabel labelIdade = new JLabel("Idade");
    labelIdade.setBounds(20, 130, 150, 40);
    tela.add(labelIdade);

    JTextField textIdade = new JTextField();
    textIdade.setBounds(20,160,250,40);
    tela.add(textIdade);


    JLabel labelTipo = new JLabel("Tipo");
    labelTipo.setBounds(20, 200, 150, 40);
    tela.add(labelTipo);

    JTextField textTipo = new JTextField();
    textTipo.setBounds(20,230,250,40);
    tela.add(textTipo);


    JLabel labelRaca = new JLabel("Raça");
    labelRaca.setBounds(20, 260, 150, 40);
    tela.add(labelRaca);

    JTextField textRaca = new JTextField();
    textRaca.setBounds(20,290,250,40);
    tela.add(textRaca);


    JLabel labelEndereco = new JLabel("Endereço");
    labelEndereco.setBounds(20, 330, 150, 40);
    tela.add(labelEndereco);

    JTextField textEndereco = new JTextField();
    textEndereco.setBounds(20,360,250,40);
    tela.add(textEndereco);


    JLabel labelTelefone = new JLabel("Telefone");
    labelTelefone.setBounds(20, 390, 150, 40);
    tela.add(labelEndereco);

    JTextField textTelefone = new JTextField();
    textTelefone.setBounds(20,420,250,40);
    tela.add(textEndereco);

    JButton enviar = new JButton("Enviar");
    enviar.setBounds(80, 480, 150, 40);
    tela.add(enviar);


    enviar.addActionListener(e -> {

        String nome = textNome.getText();
        String idade = textIdade.getText();
        String tipo = textTipo.getText();
        String raca = textRaca.getText();
        String endereco = textEndereco.getText();
        String telefone= textTelefone.getText();

        String sql = "INSERT INTO pets(nome, idade, tipo,raca, endereco, telefone) VALUES(?,?,?,?,?,?)";

        try {
            Connection conexao = Conexao.conectar();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setString(1,nome);
            ps.setString(2,idade);
            ps.setString(3,tipo);
            ps.setString(4,raca);
            ps.setString(5,endereco);
            ps.setString(6,telefone);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Calvo com sucesso");
            ps.close();
            conexao.close();

        }catch (SQLException ex) {
            throw  new RuntimeException(ex);
        }
    });

    tela.setVisible(true);

}
