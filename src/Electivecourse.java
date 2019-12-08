public class Electivecourse {
    private String elid;
    private String sid;
    private String classid;

    Electivecourse(String elid,String sid,String classid){
        this.elid=elid;
        this.sid=sid;
        this.classid=classid;
    }

    public void setElid(String elid) {
        this.elid = elid;
    }
    public String getElid() {
        return elid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
    public String getSid() {
        return sid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }
    public String getClassid() {
        return classid;
    }

    public String display(){
        return "Electivecourse[elid="+elid+", sid="+sid+", classid="+classid+"]";
    }
}
