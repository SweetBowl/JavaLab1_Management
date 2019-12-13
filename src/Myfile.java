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

    public void writeFilePr(Person[] pers){
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

    public void writeFileSt(Student[] stds){
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

    public void writeFileCo(Course[] cours) {
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

    public  void writeFileSc(Schedule[] schs){
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

    public void writeFileTc(Teacher[] teas){
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

    public void writeFileEc(Electivecourse[] elcs){
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

    public Person[] readFilePr(){
        Person[] rpers = new Person[5];
        for (int i=0;i<5;i++){
            rpers[i] = new Person();
        }
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
        finally {
            return rpers;
        }
    }

    public Student[] readFileSt(){
        Student[] rstds = new Student[5];
        for (int i=0;i<5;i++){
            rstds[i] = new Student();
        }

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
        finally {
            return rstds;
        }
    }

    public  Course[] readFileCo(){
        Course[] rcours = new Course[5];
        for (int i=0;i<5;i++){
            rcours[i] = new Course();
        }
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
        finally {
            return rcours;
        }
    }

    public Schedule[] readFileSc(){
        Schedule[] rschs = new Schedule[5];
        for (int i=0;i<5;i++){
            rschs[i] = new Schedule();
        }
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
        finally {
            return rschs;
        }
    }

    public Teacher[] readFileTc(){
        Teacher[] rteas = new Teacher[5];
        for (int i=0;i<5;i++){
            rteas[i] = new Teacher();
        }
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
        finally {
            return rteas;
        }
    }

    public Electivecourse[] readFileEc(){
        Electivecourse[] relcs = new Electivecourse[5];
        for (int i=0;i<5;i++){
            relcs[i] = new Electivecourse();
        }
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
        finally {
            return relcs;
        }
    }
}
