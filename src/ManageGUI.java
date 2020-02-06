import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ManageGUI extends JFrame {
    private JPanel contentPane;

    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    ManageGUI frame = new ManageGUI();
                    frame.setVisible(true);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }

    public void WriteInfo(String s) throws IOException {
        Myfile f0 = new Myfile("Student1.txt");
        Myfile f1 = new Myfile("Course1.txt");
        Myfile f2 = new Myfile("Person1.txt");
        Myfile f3 = new Myfile("Schedule1.txt");
        Myfile f4 = new Myfile("Teacher1.txt");
        Myfile f5 = new Myfile("Elective1.txt");

        Student stud=new Student();
        try{
            String student[] = s.split(" ");
            String sid = student[0];
            stud.setSid(sid);

            String name = student[1];
            stud.setName(name);

            String sex = student[2];
            stud.setSex(sex);

            String tmpAge = student[3];
            int age = Integer.parseInt(tmpAge);
            stud.setAge(age);

            String major = student[4];
            stud.setMajor(major);
        }catch (Exception e0){
            e0.printStackTrace();
        }
        //f0.writeFileSt(stud);
    }

    public ManageGUI(){
        super("学生课程信息管理系统");    //设置窗口标题
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("是否需要输入数据：");
        lblNewLabel.setBounds(31,67,159,16);
        contentPane.add(lblNewLabel);

        JButton button = new JButton("是");
        button.setBounds(52,166,117,29);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InputGUI.main(null);
                setVisible(false);
            }
        });
        contentPane.add(button);

        JButton button2 = new JButton("否");
        button2.setBounds(268,166,117,29);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SearchGUI.main(null);
                setVisible(false);
            }
        });
        contentPane.add(button2);
    }
}
