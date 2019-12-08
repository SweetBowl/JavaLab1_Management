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
 /*   File getFile(){

    }
        public void Writefile(Student[] stds){
        try{
            FileOutputStream fout = new FileOutputStream(str,true);
            ObjectOutputStream out = new ObjectOutputStream(fout);
            for (int i=0;i<5;i++){          //写入5个对象
                out.writeObject(stds[i]);
                out.flush();
            }
            out.close();
            System.out.println("success");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
  */
    public void Writefile(Student[] stds){
        try{
            FileOutputStream fout = new FileOutputStream(str,true);
            /*
            ObjectOutputStream out = null;

            if (file.length()<1){
                out = new ObjectOutputStream(fout);
                out.writeObject(stds);
                out.close();
            }
            else{
                MyObjectOutputStream mos = new MyObjectOutputStream(fout);
                mos.writeObject(stds);
                mos.close();
            }

             */
            ObjectOutputStream out = new ObjectOutputStream(fout);
            /*
            for (int i=0;i<5;i++){          //写入5个对象

                out.writeObject(stds[i]);
                out.flush();
            }

             */
            out.writeObject(stds);
            out.close();
            System.out.println("success");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
/*
    public static byte[] writeFile(Student[] stds) throws IOException {
        //用于序列化后存储对象
        ByteArrayOutputStream byteArrayOutputStream = null;
        //序列化
        ObjectOutputStream objectOutputStream = null;
        try{
            for (int i=0;i<5;i++) {
                byteArrayOutputStream = new ByteArrayOutputStream();
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            //将out 对象序列化
                objectOutputStream.writeObject(stds[i]);
                //测试验证输入
                byte[] bs= byteArrayOutputStream.toByteArray();
                System.out.println(Arrays.toString(bs));
                return bs;
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            objectOutputStream.close();
        }
        return null;
    }

 */
/*
    public static void ReadFile(byte[] bs) throws  Exception{
        ByteArrayInputStream byteArrayInputStream = null;
        //创建反序列化对象
        ObjectInputStream objectInputStream = null;
        try{
            byteArrayInputStream = new ByteArrayInputStream(bs);
            objectInputStream = new ObjectInputStream(byteArrayInputStream);

            //校验测试
            Player player = (Player) objectInputStream.readObject();
            System.out.println(player.toString());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            objectInputStream.close();
        }
    }

 */

    public Student[] readFile(){
        Student[] rstds = new Student[5];
        for (int i=0;i<5;i++){
            rstds[i] = new Student();
        }
        try {
            //Student std1= new Student();
            //Student std2 = new Student();
            FileInputStream f=new FileInputStream(str);
            ObjectInputStream in = null;
            in = new ObjectInputStream(f);
            int j=0;

            /*while (f.available() > 0)
            {
             rstds[j] = (Student)in.readObject();
             //rstds[j].display();
             j++;
            }

             */
            rstds =(Student[])in.readObject();
            in.close();

            /*
            in =new ObjectInputStream(f);
            std1=(Student)in.readObject();
            std2 = (Student)in.readObject();
            System.out.println("sid: "+std2.getName());
            in.close();

          */

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
