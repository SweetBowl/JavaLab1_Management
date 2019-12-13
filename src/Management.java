//v0.7 Add Course File Operation and Bug fixed
//zha0x.top

import jdk.jshell.Snippet;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

//private static final long serialVersionUID = -9059721037598130156L;

public class Management {
    public static void main(String[] args) throws IOException {
        Person[] pers = new Person[5];
        Student[] stds = new Student[5];
        Course[] cours = new Course[5];

        //初始化为null
        for (int i=0; i<5;i++){
            pers[i] = new Person();
        }

        for (int i=0;i<5;i++){
            stds[i] = new Student();
        }

        for (int i=0;i<5;i++){
            cours[i]= new Course();
        }

        Scanner scan = new Scanner(System.in);
        Myfile file0 = new Myfile("StudentInfo8_22.txt");
        Myfile file1 = new Myfile("CourseInfo8_4.txt");
        Myfile file2 = new Myfile("PersonInfo8_5.txt");

//-----------------------判断文件内容是否为空----------------------------
    //------------------下文判断学生文件是否为空----------------------
        if (file0.length() == 0){
            System.out.println("学生文件内容为空，请输入信息后进行操作。");
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
                file0.writeFileSt(stds);
            }
        }

    //------------------下文判断课程文件是否为空----------------------
        if (file1.length() ==0){
            System.out.println("课程文件内容为空，请输入信息后进行操作。");
            System.out.println("是否输入课程信息?(Y/N)");
            char ch0;
            String str10=scan.nextLine();
            ch0 = str10.charAt(0);
            if (ch0 !='Y' && ch0!='y'){
                System.out.println("已退出系统。");
                return;
            }
            else {
                int k=0;
                char ch1;
                do{
                    System.out.println("请输入课程号：");
                    String str1 = scan.nextLine();
                    cours[k].setCid(str1);
                    System.out.println("请输入课程名称：");
                    String str2 = scan.nextLine();
                    cours[k].setCname(str2);
                    System.out.println("请输入课程课时：");
                    String str3 = scan.nextLine();
                    int chour1= Integer.parseInt(str3);
                    cours[k].setChour(chour1);
                    k++;
                    System.out.println("目前已输入 "+k+" 个课程信息，是否继续输入(Y/N)？");
                    String str4 =scan.nextLine();
                    ch1 =  str4.charAt(0);
                }while (k<5 && (ch1=='Y'||ch1=='y'));
                if (k==5){
                    System.out.println("最多只能输入5个课程信息哦~");
                }
                else if(ch1 !='Y' && ch1 != 'y'){
                    System.out.println("输入课程信息完毕!");
                }
                file1.writeFileCo(cours);
            }
        }
    //-------------------下文判断person文件是否为空------------------
        if (file2.length() ==0){
            System.out.println("Person文件内容为空，请输入信息后进行操作。");
            System.out.println("是否输入person信息?(Y/N)");
            char ch0;
            String str10=scan.nextLine();
            ch0 = str10.charAt(0);
            if (ch0 !='Y' && ch0!='y'){
                System.out.println("已退出系统。");
                return;
            }
            else {
                int k=0;
                char ch1;
                do{
                    System.out.println("请输入人名：");
                    String str1 = scan.nextLine();
                    pers[k].setName(str1);
                    System.out.println("请输入人的年龄：");
                    String str2 = scan.nextLine();
                    int age2=Integer.parseInt(str2);
                    pers[k].setAge(age2);
                    System.out.println("请输入人的性别：");
                    String str3 = scan.nextLine();
                    pers[k].setSex(str3);
                    k++;
                    System.out.println("目前已输入 "+k+" 个person信息，是否继续输入(Y/N)？");
                    String str4 =scan.nextLine();
                    ch1 =  str4.charAt(0);
                }while (k<5 && (ch1=='Y'||ch1=='y'));
                if (k==5){
                    System.out.println("最多只能输入5个person信息哦~");
                }
                else if(ch1 !='Y' && ch1 != 'y'){
                    System.out.println("输入person信息完毕!");
                }
                file2.writeFilePr(pers);
            }
        }

// ---------------------从文件中读取内容到数组中----------------------
        Student[] rstds= new Student[5];
        for (int j=0;j<5;j++) {
            rstds[j] = new Student();
        }
        rstds = file0.readFileSt();

        Course[] rcours = new Course[5];
        for (int j=0;j<5;j++){
            rcours[j] = new Course();
        }
        rcours = file1.readFileCo();

        Person[] rpers = new Person[5];
        for (int j=0;j<5;j++){
            rpers[j] = new Person();
        }
        rpers = file2.readFilePr();
//-------------------判断文件内有多少信息------------------
        int total0=0;
        while(rstds[total0].getSid()!=null){
            total0++;                        //total0 用来表示学生数组内为空的索引
        }

        int total1 = 0;
        while(rcours[total1].getCid() !=null){
            total1++;                       //total1 用来表示课程数组内为空的索引
        }

        int total2 = 0;
        while (rpers[total2].getName()!=null){
            total2++;                       //total2 用来表示person数组内为空的索引
        }

        int k0 = 5 - total0;        //student
        int k1 = 5-total1;          //course
        int k2 = 5 - total2;        //person
        //-------------------选择要进行的操作---------------------
        while(true) {

            System.out.println("---------请选择要进行的操作---------");
            System.out.println("1.查看 所有person信息");
            System.out.println("2.查看 所有学生信息");
            System.out.println("3.查看 所有教师信息");
            System.out.println("4.查看 所有课程信息");
            System.out.println("5.查看 所有排课信息");
            System.out.println("6.查看 所有选课信息");

            System.out.println("7.添加 person信息");
            System.out.println("8.添加 学生信息");
            System.out.println("9.添加 教师信息");
            System.out.println("10.添加 课程信息");
            System.out.println("11.添加 排课信息");
            System.out.println("12.添加 选课信息");

            System.out.println("13.查询指定学生信息");

            int choice;

            try {
                choice = scan.nextInt();

                switch (choice) {
                    case 1:{
                        int m=0;
                        while(rpers[m].getName()!=null){
                            System.out.println(rpers[m].display());
                            m++;
                        }
                        break;
                    }
                    case 2: {
                        int m = 0;
                        while (rstds[m].getSid() != null) {
                            System.out.println(rstds[m].display());
                            m++;
                        }
                        break;
                    }
                    case 4:{
                        int m=0;
                        while(rcours[m].getCid()!=null){
                            System.out.println(rcours[m].display());
                            m++;
                        }
                        break;
                    }
                    case 7: {
                        try {
                            System.out.println("请输入person信息(还可输入" + k2 + " 个）：");
                            char ch2;
                            do {
                                System.out.println("请输入人名：");
                                String str1 = scan.next();
                                rpers[total2].setName(str1);
                                System.out.println("请输入人的年龄：");
                                String str2 = scan.next();
                                int age2 = Integer.parseInt(str2);
                                rpers[total2].setAge(age2);
                                System.out.println("请输入人的性别：");
                                String str3 = scan.next();
                                rpers[total2].setSex(str3);

                                k2++;
                                total2++;

                                System.out.println("目前已输入 " + total2 + " 个person信息，是否继续输入(Y/N)？");
                                String str4 = scan.next();
                                ch2 = str4.charAt(0);
                            } while (k2 < 5 && (ch2 == 'Y' || ch2 == 'y'));
                            if (k2 == 5) {
                                System.out.println("最多只能输入5个person信息哦~");
                            } else {
                                System.out.println("Keep going on");
                            }
                            file2.writeFilePr(rpers);
                         }catch (Exception e){
                            e.printStackTrace();
                            System.out.println("请按提示输入哦~");
                            return;
                        }
                        break;
                    }
                    case 8: {

                        try {
                           // int k = 5 - total0;
                            System.out.println("请输入学生信息(还可输入" + k0 + " 个）：");
                            char ch2;
                            write_info:
                            do {
                                //if (scan.hasNextLine()) {
                                System.out.println("请输入学生的学号: ");
                                String str1 = scan.next();
                                //  System.out.println(str1);
                                int l = 0;
                                while (rstds[l].getSid() != null) {
                                    if (str1.equals(rstds[l].getSid())) {
                                        System.out.println("学号重复，请检查信息后再输入哦~");
                                        break write_info;
                                    }
                                    l++;
                                }

                                rstds[total0].setSid(str1);
                                System.out.println("请输入学生的姓名：");
                                String str2 = scan.next();
                                rstds[total0].setName(str2);
                                System.out.println("请输入学生的性别：");
                                String str3 = scan.next();
                                rstds[total0].setSex(str3);
                                System.out.println("请输入学生的年龄：");
                                String str4 = scan.next();
                                int age1 = Integer.parseInt(str4);
                                rstds[total0].setAge(age1);
                                System.out.println("请输入学生的专业：");
                                String str5 = scan.next();
                                rstds[total0].setMajor(str5);

                                k0++;
                                total0++;

                                System.out.println("目前已输入 " + total0 + " 位学生信息，是否继续输入(Y/N)？");
                                String str6 = scan.next();
                                ch2 = str6.charAt(0);
                            } while (k0 < 5 && (ch2 == 'Y' || ch2 == 'y'));
                            if (k0 == 5) {
                                System.out.println("最多只能输入5个学生信息哦~");
                            } else {
                                System.out.println("Keep going on!");
                            }
                            //写入文件
                            file0.writeFileSt(rstds);

                        } catch (Exception e) {
                            e.printStackTrace();
                            System.out.println("请按提示输入哦~");
                            return;
                        }
                        break;
                    }
                    case 10: {
                        try{
                           // int k=5-total1;
                            System.out.println("请输入课程信息(还可输入"+k1 +" 个）:");
                            char ch2;
                            write_info1:
                            do{
                                System.out.println("请输入课程号：");
                                String str1 = scan.next();
                                int l=0;
                                while (rcours[l].getCid() !=null){
                                    if (str1.equals(rcours[l].getCid())){
                                        System.out.println("课程号重复，请检查后再输入哦~");
                                        break write_info1;
                                    }
                                    l++;
                                }
                                rcours[total1].setCid(str1);
                                System.out.println("请输入课程名称：");
                                String str2 = scan.next();
                                cours[total1].setCname(str2);
                                System.out.println("请输入课程课时：");
                                String str3 = scan.next();
                                int chour1= Integer.parseInt(str3);
                                cours[total1].setChour(chour1);
                                k1++;
                                total1++;
                                System.out.println("目前已输入 "+total1+" 个课程信息，是否继续输入(Y/N)？");
                                String str4 =scan.next();
                                ch2 =  str4.charAt(0);
                            }while (k1<5 &&(ch2 =='Y'||ch2 =='y'));
                            if (k1==5){
                                System.out.println("最多只能输入5个课程信息哦~");
                            }
                            else {
                                System.out.println("Keep going on!");
                            }
                            file1.writeFileCo(rcours);
                        }
                        catch (Exception e){
                            e.printStackTrace();
                            System.out.println("请按提示输入哦~");
                            return;
                        }
                        break;
                    }
                    case 13:{
                        System.out.println("请输入要要查询学生的学号:");

                        break;
                    }
                    default:
                        System.out.println("Quit!");
                        return;
                }
            }catch (Exception e){
                System.out.println("请按提示输入哦~");
                //e.printStackTrace();
                return;
            }
        }
    }

}
