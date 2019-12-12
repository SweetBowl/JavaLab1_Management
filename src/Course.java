import java.io.Serializable;

public class Course implements Serializable {
    private String cname;
    private String cid;
    private int chour;

    Course(String cid,String cname,int chour){
        this.cname=cname;
        this.cid=cid;
        this.chour=chour;
    }

    public Course() {
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
    public String getCid() {
        return cid;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getCname() {
        return cname;
    }

    public void setChour(int chour) {
        this.chour = chour;
    }
    public int getChour() {
        return chour;
    }

    public String display(){
        return "Course[cid="+cid+", cname="+cname+", chour="+chour+"]";
    }
}
