import javax.swing.JOptionPane;
public class R1_Exemplo1 {
	public static void main(String[] args) {
		String suaIdade = JOptionPane.showInputDialog(null, "Informe sua idade");
		int suaIdadeInt = Integer.parseInt(suaIdade);
		JOptionPane.showMessageDialog(null, "Você tem " +suaIdadeInt+ " anos"); 
	}
}
