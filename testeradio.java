import javax.swing.JFrame;

public class testeradio {
    public static void main(String[] args) {
        radiobutton botao = new radiobutton();
        botao.setResizable(false);
        botao.setLocationRelativeTo(null);
        botao.setSize(1000,800);
        botao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        botao.setVisible (true);
    }
}
