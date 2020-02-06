import java.io.*;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import java.util.Objects;

public class Myfile extends File {
    private String str;

    Myfile(String str) throws IOException {
        super(str);
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

    public void writeFile(Person[] pers){
        try{
            FileOutputStream fout = new FileOutputStream(str);
            ObjectOutputStream out = new ObjectOutputStream(fout);

            for (int i=0;i<5;i++){          //写入5个对象

                out.writeObject(pers[i]);
                out.flush();
            }
            out.close();
            System.out.println("Now on Person");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void writeFile(Student[] stds){
        try{
            FileOutputStream fout = new FileOutputStream(str);
            ObjectOutputStream out = new ObjectOutputStream(fout);

            for (int i=0;i<5;i++){          //写入5个对象

                out.writeObject(stds[i]);
                out.flush();
            }
            out.close();
            System.out.println("Now on Student");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void writeFile(Course[] cours) {
        try {
            FileOutputStream fout = new FileOutputStream(str);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            for (int i = 0; i < 5; i++) {
                out.writeObject(cours[i]);
                out.flush();
            }
            out.close();
            System.out.println("Now on Course");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  void writeFile(Schedule[] schs){
        try{
            FileOutputStream fout = new FileOutputStream(str);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            for (int i = 0; i < 5; i++) {
                out.writeObject(schs[i]);
                out.flush();
            }
            out.close();
            System.out.println("Now on Schedule");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeFile(Teacher[] teas){
        try{
            FileOutputStream fout = new FileOutputStream(str);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            for (int i = 0; i < 5; i++) {
                out.writeObject(teas[i]);
                out.flush();
            }
            out.close();
            System.out.println("Now on Teacher");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void writeFile(Electivecourse[] elcs){
        try{
            FileOutputStream fout = new FileOutputStream(str);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            for (int i = 0; i < 5; i++) {
                out.writeObject(elcs[i]);
                out.flush();
            }
            out.close();
            System.out.println("Now on Electivecourse");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void readFile(Person[] rpers){
        try{
            FileInputStream f=new FileInputStream(str);
            ObjectInputStream in;
            in = new ObjectInputStream(f);
            int j=0;
            while (f.available() > 0)
            {
                rpers[j] = (Person) in.readObject();
                j++;
            }
            in.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void readFile(Student[] rstds){
        try {
            FileInputStream f=new FileInputStream(str);
            ObjectInputStream in;
            in = new ObjectInputStream(f);
            int j=0;
            while (f.available() > 0)
            {
                rstds[j] = (Student)in.readObject();
                j++;
            }
            in.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void readFile(Course[] rcours){

        try {
            FileInputStream f=new FileInputStream(str);
            ObjectInputStream in;
            in = new ObjectInputStream(f);
            int j=0;
            while (f.available() > 0)
            {
                rcours[j] = (Course)in.readObject();
                j++;
            }
            in.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void readFile(Schedule[] rschs){
        try {
            FileInputStream f=new FileInputStream(str);
            ObjectInputStream in;
            in = new ObjectInputStream(f);
            int j=0;
            while (f.available() > 0)
            {
                rschs[j] = (Schedule) in.readObject();
                j++;
            }
            in.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void readFile(Teacher[] rteas){
        try{
            FileInputStream f=new FileInputStream(str);
            ObjectInputStream in;
            in = new ObjectInputStream(f);
            int j=0;
            while (f.available() > 0)
            {
                rteas[j] = (Teacher) in.readObject();
                j++;
            }
            in.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void readFile(Electivecourse[] relcs){

        try{
            FileInputStream f=new FileInputStream(str);
            ObjectInputStream in;
            in = new ObjectInputStream(f);
            int j=0;
            while (f.available() > 0)
            {
                relcs[j] = (Electivecourse) in.readObject();
                j++;
            }
            in.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
