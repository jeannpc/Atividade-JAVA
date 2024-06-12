import javax.swing.*;
import javax.swing.JOptionPane;
public class If {
    public static void main(String[] args) {
        Object[] op= {"Masculino", "Feminino"};
        String resp = (String) JOptionPane.showInputDialog(
                null,"Selecione o sexo: \n", "pesquisa", JOptionPane.PLAIN_MESSAGE, null, op, "Maculino");
        if (resp == null) {
            JOptionPane.showMessageDialog(null, "Você ´pressionou cancel");
        }
        if (resp.equals("Masculino")){
            JOptionPane.showMessageDialog(null, "Você é homem!");
        }
        if (resp.equals("Masculino")){
            JOptionPane.showMessageDialog(null, "Você é mulher!");
        }
        System.exit(0);
    }
}

