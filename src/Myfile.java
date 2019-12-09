import java.io.*;
import java.util.Arrays;
import java.util.Objects;

public class Myfile {
    private String str;

    Myfile(String str) throws IOException {
        //File file = new File(str);
        this.str = str;
        File opfile = new File(str);
        if (opfile.createNewFile()){
            System.out.println("New File is created.");
        }
        else{
            System.out.println("The file already exists.");
        }
    }

    public void Writefile(Student[] stds){
        try{
            FileOutputStream fout = new FileOutputStream(str,true);
            ObjectOutputStream out = new ObjectOutputStream(fout);

            for (int i=0;i<5;i++){          //写入5个对象

                out.writeObject(stds[i]);
                out.flush();
            }
            /*
            out.writeObject(stds);
             */
            System.out.println("Name: "+stds[3].getName());
            out.close();
            System.out.println("success");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void writeFile2(Student[] stds)throws IOException{
        FileWriter fw = new FileWriter(str);
        BufferedWriter bw = new BufferedWriter(fw);

        //String sid, String name, String sex, int age,String major
        for (int i=0;i<5;i++){
            Student student = stds[i];
            StringBuilder stb = new StringBuilder();
            stb.append(student.getSid()).append(",").append(student.getName()).append(",")
                    .append(student.getSex()).append(",").append(student.getAge()).append(",")
                    .append(student.getMajor());
            bw.write(stb.toString());
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }

    public void readFile2(Student[] stds) throws IOException{
        FileReader fr = new FileReader(str);
        BufferedReader br = new BufferedReader(fr);

        String line;
        int i=0;
        while((line = br.readLine())!=null){
            String[] datas = line.split(",");
            Student student=new Student();
            student.setSid(datas[0]);
            student.setName(datas[1]);
            student.setSex(datas[2]);
            int a = Integer.parseInt(datas[3]);
            student.setAge(a);
            student.setMajor(datas[4]);
            stds[i] =student;
            i++;
        }
        br.close();
    }

    public Student[] readFile(){
        Student[] rstds = new Student[5];
        for (int i=0;i<5;i++){
            rstds[i] = new Student();
        }

        try {
            //Student std1= new Student();
            //Student std2 = new Student();
            FileInputStream f=new FileInputStream(str);
            ObjectInputStream in;
            in = new ObjectInputStream(f);

            int j=0;
            while (f.available() > 0)
            {
             rstds[j] = (Student)in.readObject();
             //rstds[j].display();
             j++;
            }

            //rstds =(Student[])in.readObject();
            in.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            return rstds;
        }
    }

    class MyObjectOutputStream  extends ObjectOutputStream{

        public MyObjectOutputStream(OutputStream out) throws IOException {
            super(out);
        }

        public void writeStreamHeader() throws IOException{
            return;
        }
    }
}
