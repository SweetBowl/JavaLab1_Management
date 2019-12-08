import java.io.IOException;

public class Management {
    public static void main(String[] args) throws IOException {
        Student[] stds = new Student[5];
        for (int i=0;i<5;i++){
            stds[i] = new Student();
        }
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
        Myfile file1 = new Myfile("StudentInfo5.txt");
        Student[] rstds = new Student[5];
        for (int j=0;j<5;j++){
            rstds[j] = new Student();
        }
        file1.Writefile(stds);
        //Bug出在Person类上，Person类构造方法使Name,Sex,Age重新初始化（大概这个意思）
        rstds = file1.readFile();
        System.out.println("Sid: "+rstds[3].getSid());

    }
}
