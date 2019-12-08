public class Person {
    protected String name;
    protected String sex;
    protected int age;

    public Person() {
    }

    public Person(String name,String sex,int age){
        this.name=name;
        this.sex=sex;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public String getSex() {
        return sex;
    }

    public String display() {
        return "Person[name="+name+", age="+age+", sex="+sex+"]";
    }
}
