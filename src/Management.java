import jdk.jshell.Snippet;

import java.io.IOException;
import java.util.Scanner;

public class Management {
    public static void main(String[] args) throws IOException {
        Student[] stds = new Student[5];

        for (int i=0;i<5;i++){
            stds[i] = new Student();
        }
/*
        Student std1 = new Student("std1001","Tom","Male",19,"CS");
        Student std2 = new Student("std1002", "Jack","Male",19,"CS");
        Student std3 = new Student("std1003","Lucy","Female",19,"CS");
        Student std4 = new Student("std1004","Lucky","Female",20,"SoftwareEngineering");
        Student std5 = new Student("std1005","Jony","Male",20,"Physics");

        stds[0]=std1;
        stds[1]=std2;
        stds[2]=std3;
        stds[3]=std4;
        stds[4]=std5;

 */
        System.out.println("请输入学生信息（最多5个）：");
        Scanner scan = new Scanner(System.in);
       // System.out.println("请输入学生的学号: ");
        int k=0;
        char choice = 'Y';
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
                    choice = str6.charAt(0);
               // }
            }while(k<5 && (choice =='Y'|| choice=='y'));
        if (k==5){
            System.out.println("最多只能输入5个学生信息哦~");
        }
        else{
            System.out.println("输入学生信息完毕!");
        }


        Myfile file1 = new Myfile("StudentInfo8_10.txt");
        Student[] rstds= new Student[5];

        for (int j=0;j<5;j++) {
            rstds[j] = new Student();
        }
        file1.Writefile(stds);

        rstds = file1.readFile();
        System.out.println("Sid: "+rstds[0].getName());

    }
}
