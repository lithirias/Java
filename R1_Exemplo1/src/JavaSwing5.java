import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JavaSwing5 extends JFrame{
    
    private static final long serialVersionUID = 1L;
    private JLabel rotulo;

    public JavaSwing5(){
        super("Universidade Feevale - Componente");

        setLayout(null);
        rotulo = new JLabel("Rótulo");
        rotulo.setBounds(10,50,200,30);
        add(rotulo);

        setSize(500,200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        JavaSwing5 myWindow = new JavaSwing5();
        myWindow.setVisible(true);
    }
}
