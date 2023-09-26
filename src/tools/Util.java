/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author tate
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Util {

    public static void habilitar(boolean valor, JComponent... vetComp) {
        for (int i = 0; i < vetComp.length; i++) {
            vetComp[i].setEnabled(valor);
            //static serve pra nao instanciar a classe
        }
    }

    public static void limparCampos(JComponent... vetComp) {
        for (JComponent jComponent : vetComp) {
            if (jComponent instanceof JTextField) {
                ((JTextField) jComponent).setText("");
            }

            if (jComponent instanceof JComboBox) {
                ((JComboBox) jComponent).setSelectedIndex(-1);
            }
            if (jComponent instanceof JCheckBox) {
                ((JCheckBox) jComponent).setSelected(false);
            }
            //instanceof torna os outros componentes em JComponent
            //pega todos os indices do JComponent e joga para o jComponent e vai repetindo pegando tudo

        }
    }

    public static void mensagem(String cadeia) {
        JOptionPane.showMessageDialog(null, cadeia);
    }

    public static boolean perguntar(String cadeia) {
        int resp = JOptionPane.showConfirmDialog(null, cadeia, "Deseja excluir o registro?", JOptionPane.YES_NO_OPTION);
        return resp == JOptionPane.YES_OPTION;
    }

    public static int strInt(String cad) {
        return Integer.valueOf(cad);
    }
    
    public static String intStr(int num) {
        return String.valueOf(num);
    }

    public static double strDouble(String cad) {
        return Double.valueOf(cad);
    }

    public static String doubleStr(double num) {
        return String.valueOf(num);
    }

    public static Date strDate(String cad) {
        SimpleDateFormat formataNascimento = new SimpleDateFormat("dd/MM/yyyy"); //Convertendo string para Date
        try {
            return formataNascimento.parse(cad);
        } catch (ParseException ex) {
            Logger.getLogger(Util.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static String dateStr(Date num) {
        SimpleDateFormat formatoNascimento = new SimpleDateFormat("dd/MM/yyyy");// Convertendo data para String
        return formatoNascimento.format(num);
    }

}
