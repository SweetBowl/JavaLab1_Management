import java.io.Serializable;

public class Student extends Person implements Serializable {
    private String sid;
    private String major;

    public Student(){
        super();
    };

    public Student(String sid, String name, String sex, int age,String major) {
        super(name, sex, age);
        //super();
        //this.name=name;
        //this.sex=sex;
        //this.age=age;
        this.sid=sid;
        this.major=major;
    }

    void setSid(String sid) {
        this.sid = sid;
    }
    String getSid() {
        return sid;
    }

    void setMajor(String major) {
        this.major = major;
    }
    String getMajor() {
        return major;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
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

    public String display(){
        return "Student[sid="+sid+", name="+name+", sex="+sex+", age="+age+", major="+major+"]";
    }

}
