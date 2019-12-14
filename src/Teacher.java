import java.io.Serializable;

public class Teacher extends Person implements Serializable {
    private String tid;
    private String title;
    Teacher(String tid, String name, String sex, int age,String title) {
        super(name, sex, age);
        this.tid = tid;
        this.title=title;
    }

    public Teacher() {

    }

    public void setTid(String tid) {
        this.tid = tid;
    }
    public String getTid() {
        return tid;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    @Override
    public void setSex(String sex) {
        super.setSex(sex);
    }
    @Override
    public String getSex() {
        return super.getSex();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }
    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
    @Override
    public String getName() {
        return super.getName();
    }

    public String display(){
        return "Teacher[tid="+tid+", name="+name+", sex="+sex+", age="+age+", title="+title+"]";
    }
}
