import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class SearchGUI extends JFrame{
    private JScrollPane contentPane1;
    private JTextField jtf1 = new JTextField(20);
    private JTextArea jta = new JTextArea(8,30);
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    SearchGUI frame = new SearchGUI();
                    frame.setVisible(true);
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        });
    }

    public SearchGUI(){
        super("查询信息");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100,100,450,300);
        contentPane1 = new JScrollPane();
        //设置垂直滚动条，当需要时出现
        contentPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        contentPane1.setBorder(new EmptyBorder(5,5,5,5));
        setContentPane(contentPane1);
        contentPane1.setLayout(null);
        jtf1.setBounds(80,10,325,20);
        JLabel label = new JLabel("请输入学号:");
        label.setBounds(5,10,95,20);
        JButton button1 = new JButton("OK");
        button1.setBounds(410,10,30,20);
        contentPane1.add(jtf1);
        contentPane1.add(label);
        contentPane1.add(button1);
        jta.setBounds(40,60,370,200);
        contentPane1.add(jta);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        //文件
                Myfile file0 = null;
                try {
                    file0 = new Myfile("StudentInfo9.txt");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                Myfile file1 = null;
                try {
                    file1 = new Myfile("CourseInfo9.txt");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                Myfile file2 = null;
                try {
                    file2 = new Myfile("PersonInfo9.txt");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                Myfile file3 = null;
                try {
                    file3 = new Myfile("ScheduleInfo9.txt");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                Myfile file4 = null;
                try {
                    file4 = new Myfile("TeacherInfo9.txt");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                Myfile file5 = null;
                try {
                    file5 = new Myfile("ElectiveInfo9.txt");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                //读取信息
                Student[] rstds= new Student[5];
                for (int j=0;j<5;j++) {
                    rstds[j] = new Student();
                }
                 file0.readFile(rstds);

                Course[] rcours = new Course[5];
                for (int j=0;j<5;j++){
                    rcours[j] = new Course();
                }
                file1.readFile(rcours);

                Person[] rpers = new Person[5];
                for (int j=0;j<5;j++){
                    rpers[j] = new Person();
                }
                file2.readFile(rpers);

                Schedule[] rschs = new Schedule[5];
                for (int j=0;j<5;j++){
                    rschs[j] = new Schedule();
                }
                file3.readFile(rschs);

                Teacher[] rteas = new Teacher[5];
                for (int j=0;j<5;j++){
                    rteas[j] = new Teacher();
                }
                file4.readFile(rteas);

                Electivecourse[] relcs = new Electivecourse[5];
                for (int j=0;j<5;j++){
                    relcs[j] = new Electivecourse();
                }
                file5.readFile(relcs);

                //读取Textfield中的信息
                String input = jtf1.getText();
                //查询Textfield中的信息
                int p=0;
                while(rstds[p].getSid()!=null){
                    if (input.equals(rstds[p].getSid())){
                        jta.append("学号: "+input+" 已查询到\n");
                        break;
                    }
                    p++;
                }
                if (rstds[p].getSid()==null){
                    jta.append("该学号未查询到，请检查后再输入哦~\n");
                }

                int i=0;
                boolean flag2 = false;
                while(relcs[i].getElid()!=null){
                    if (input.equals(relcs[i].getSid())){
                        flag2 = true;

                        String str2 = relcs[i].getClassid();        //str2 ->classid
                        int j=0;
                        boolean flag3 = false;

                        while(rschs[j].getClassid()!=null){
                            if (str2.equals(rschs[j].getClassid())){
                                flag3 = true;
                                String str3 = rschs[j].getTid();    //str3 ->tid
                                String str7 = rschs[j].getClassroom();  //str7 ->classroom !!
                                jta.append("上课地点为："+str7+"\n");
                                int k=0;
                                boolean flag4 = false;
                                while (rteas[k].getTid()!=null){
                                    if (str3.equals(rteas[k].getTid())){
                                        flag4 = true;
                                        String str5 = rteas[k].getName();   //str5 ->tname !!
                                        jta.append("上课教师为："+str5+"\n");
                                    }
                                    k++;
                                }
                                if (!flag4){
                                    jta.append("Error:未找到教师编号对应的教师信息哦～"+"\n");
                                }
                                String str4 = rschs[j].getCid();    //str4 ->cid

                                int m=0;
                                boolean flag5 = false;
                                while(rcours[m].getCid()!=null){
                                    if (str4.equals(rcours[m].getCid())){
                                        flag5 = true;
                                        String str6 = rcours[m].getCname(); //str6->cname !!
                                        jta.append("课程名称为："+str6+"\n");
                                        jta.append("*********************\n");
                                    }
                                    m++;
                                }
                                if (!flag5){
                                    jta.append("Error:未找到课程编号对应的课程名称哦~\n");
                                }
                            }
                            j++;
                        }
                        if (!flag3){
                            jta.append("Error: 未找到课程班号对应的排课信息哦～"+"\n");
                        }
                    }
                    i++;
                }
                if (!flag2){
                    jta.append("未找到该学号对应的选课信息，请检查后再输入哦~"+"\n");
                }

                setVisible(true);
            }
        });
    }
}
