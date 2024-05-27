import javax.swing.JFrame;
public class JavaSwing3 extends JFrame{
    public JavaSwing3() {
        super("Universidade Feevale - Classe JavaSwing3");
    };

    public static void main(String[] args) {
        JavaSwing3 myWindow = new JavaSwing3();
        myWindow.setSize(500,200);
        myWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        myWindow.setVisible(true);
    }
}
