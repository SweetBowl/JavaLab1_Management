public class Teacher extends Person{
    private String tid;
    private String title;
    Teacher(String tid, String name, String sex, int age,String title) {
        super(name, sex, age);
        this.tid = tid;
        this.title=title;
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

    public String display(){
        return "Teacher[tid="+tid+", name="+name+", sex="+sex+", age="+age+", title="+title+"]";
    }
}
