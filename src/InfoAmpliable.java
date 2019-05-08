import javax.jnlp.JNLPRandomAccessFile;
import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfoAmpliable {

    public static void main(String[] args) {
        InfoAmpliable programa=new InfoAmpliable();
        JFrame ventanaPrincipal=new JFrame("Ampliable");

        JButton info=new JButton("Pulsa");
        ventanaPrincipal.add(info);
        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                programa.pulsado();
            }
        });


        ventanaPrincipal.setBounds(50,50,100,100);
        ventanaPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventanaPrincipal.setVisible(true);

    }

    private void pulsado() {
        PanelInfo panel=new PanelInfo();
        String[] opciones={"Aceptar"};
        if(JOptionPane.showOptionDialog(null, panel, "INFO", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0])==0){
            System.out.println("Pulsado Aceptar");
            System.out.println(panel.getInfo());
        }

    }


}
class PanelInfo extends JPanel{
    JTextArea info=new JTextArea(20,20);
    JButton masInfo=new JButton("Más Info");
    List<JTextArea> infosExtra=new ArrayList<>();


    public PanelInfo() {
        setLayout(new GridLayout(0,2));
        add(new JLabel("Info:"));
        add(info);
        add(masInfo);
        masInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anyadeInfo();
            }
        });
    }

    private void anyadeInfo() {
        JTextArea textoNuevo=new JTextArea(20,20);
        infosExtra.add(textoNuevo);
        add(textoNuevo);
    }

    public String getInfo() {
        String salida=info.getText();
        return salida;
    }
}
