import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class InputGUI extends JFrame {
    private JPanel contentPane;
    private JTextField jtf = new JTextField(20);
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    InputGUI frame = new InputGUI();
                    frame.setVisible(true);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }

    public InputGUI(){
        super("输入信息");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        jtf.setBounds(50,10,365,20);
        JButton jtb1= new JButton("OK");
        jtb1.setBounds(360,250,50,20);
        JLabel label = new JLabel("学生:");
        label.setBounds(5,10,50,20);
        JTextArea jta = new JTextArea("此功能用以输入学生信息，并写入文件(TO DO)");
        jta.setBounds(55,50,355,190);
        contentPane.add(jtf);
        contentPane.add(label);
        contentPane.add(jtb1);
        contentPane.add(jta);
        jtb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SearchGUI.main(null);
                setVisible(false);
            }
        });
    }
}
