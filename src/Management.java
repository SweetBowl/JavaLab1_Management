import jdk.jshell.Snippet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

//v0.5 Search_Student
//先判断文件是否为空，若为空，则写入文件，不为空，先读出文件内容，然后询问是否写入
//private static final long serialVersionUID = -9059721037598130156L;

public class Management {
    public static void main(String[] args) throws IOException {
        Student[] stds = new Student[5];

        //初始化为null
        for (int i=0;i<5;i++){
            stds[i] = new Student();
        }

        Scanner scan = new Scanner(System.in);
        Myfile file0 = new Myfile("StudentInfo8_22.txt");

        //------------------下文判断文件是否为空----------------------
        if (file0.length() == 0){
            System.out.println("文件内容为空，请输入信息后进行操作。");
            System.out.println("是否输入学生信息？(Y/N)");
            char ch0;
            String str10=scan.nextLine();
            ch0 = str10.charAt(0);
            if (ch0 !='Y' && ch0!='y'){
                System.out.println("已退出系统。");
                return;
            }
            else{
                int k=0;
                char ch1;
                do {
                    //if (scan.hasNextLine()) {
                    System.out.println("请输入学生的学号: ");
                    String str1 = scan.nextLine();
                    stds[k].setSid(str1);
                    System.out.println("请输入学生的姓名：");
                    String str2 = scan.nextLine();
                    stds[k].setName(str2);
                    System.out.println("请输入学生的性别：");
                    String str3 = scan.nextLine();
                    stds[k].setSex(str3);
                    System.out.println("请输入学生的年龄：");
                    String str4 = scan.nextLine();
                    int age1 = Integer.parseInt(str4);
                    stds[k].setAge(age1);
                    System.out.println("请输入学生的专业：");
                    String str5 = scan.nextLine();
                    stds[k].setMajor(str5);
                    k++;
                    System.out.println("目前已输入 " + k + " 位学生信息，是否继续输入(Y/N)？");
                    String str6 = scan.nextLine();
                    ch1 = str6.charAt(0);
                    // }
                }while(k<5 && (ch1 =='Y'|| ch1=='y'));
                if (k==5){
                    System.out.println("最多只能输入5个学生信息哦~");
                }
                else if (ch1!='Y' && ch1!='y'){
                    System.out.println("输入学生信息完毕!");
                }
                file0.Writefile(stds);
            }
        }

        // ----------------从文件中读取内容到数组中-----------------
        Student[] rstds= new Student[5];
        for (int j=0;j<5;j++) {
            rstds[j] = new Student();
        }
        rstds = file0.readFile();

        //-------------------判断文件内有多少信息------------------
        int total=0;
        while(rstds[total].getSid()!=null){
            total++;                        //total 用来表示数组内为空的索引
        }

        //-------------------选择要进行的操作---------------------
        while(true) {

            System.out.println("---------请选择要进行的操作---------");
            System.out.println("1.查看所有学生信息");
            System.out.println("2.添加学生信息");

            int choice;
            //int mark=total;
            choice = scan.nextInt();
            switch (choice){
                case 1:
                {
                    int m=0;
                    while(rstds[m].getSid()!=null){
                        System.out.println(rstds[m].display());
                        m++;
                    }
                    break;
                }
                case 2:
                {
                    /*
                    Student[] wstds= new Student[5];
                    for (int i=0;i<5;i++){
                        wstds[i] = new Student();
                    }
                     */

                    try{
                        int k=5-total;
                        System.out.println("请输入学生信息(还可输入"+k+" 个): ");
                        char ch2;
                        write_info:
                        do {
                            //if (scan.hasNextLine()) {
                            System.out.println("请输入学生的学号: ");
                            String str1 = scan.next();
                          //  System.out.println(str1);
                            int l=0;
                            while(rstds[l].getSid()!=null){
                                if (str1.equals(rstds[l].getSid())){
                                    System.out.println("学号重复，请检查信息后再输入哦~");
                                    break write_info;
                                }
                                l++;
                            }

                            //wstds[p].setSid(str1);
                            rstds[total].setSid(str1);
                            System.out.println("请输入学生的姓名：");
                            String str2 = scan.next();
                            //wstds[p].setName(str2);
                            rstds[total].setName(str2);
                            System.out.println("请输入学生的性别：");
                            String str3 = scan.next();
                            //wstds[p].setSex(str3);
                            rstds[total].setSex(str3);
                            System.out.println("请输入学生的年龄：");
                            String str4 = scan.next();
                            int age1 = Integer.parseInt(str4);
                            //wstds[p].setAge(age1);
                            rstds[total].setAge(age1);
                            System.out.println("请输入学生的专业：");
                            String str5 = scan.next();
                            //wstds[p].setMajor(str5);
                            rstds[total].setMajor(str5);

                            k++;
                            total++;

                            System.out.println("目前已输入 " + k + " 位学生信息，是否继续输入(Y/N)？");
                            String str6 = scan.next();
                            ch2 = str6.charAt(0);
                            // }
                        }while(k<5 && (ch2 =='Y'|| ch2=='y'));
                        if (k==5){
                            System.out.println("最多只能输入5个学生信息哦~");
                        }
                        else {
                            System.out.println("Keep going on!");
                        }
                        //写入文件
                        file0.Writefile(rstds);

                        //FileOutputStream fout = new FileOutputStream(file0,true);
                        //Myfile.MyObjectOutputStream mos = new Myfile.MyObjectOutputStream(fout);
                       // FileOutputStream fout = new FileOutputStream(file0,true);
                        //ObjectOutputStream out = new ObjectOutputStream(fout);
                        /*while (rstds[mark].getSid()!=null){
                            out.writeObject(rstds[mark]);
                            out.flush();
                            mark++;
                        }

                         */

                    }
                    catch (Exception e){
                        e.printStackTrace();
                        System.out.println("请按提示输入哦~");
                        return;
                    }
                    break;
                }
                default:
                    System.out.println("Quit!");
                    return;
            }

        }
    }

}
