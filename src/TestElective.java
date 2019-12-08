import java.security.spec.EllipticCurve;

public class TestElective {
    public TestElective(){
    }
    public static void main(String[] args){
        Electivecourse electivecourse1=new Electivecourse("cdE601","cdS701","cdCS801");

        String elid1;
        electivecourse1.setElid("cdE602");
        elid1=electivecourse1.getElid();
        System.out.println(elid1);

        String sid1;
        electivecourse1.setSid("cdS702");
        sid1=electivecourse1.getSid();
        System.out.println(sid1);

        String classid1;
        electivecourse1.setClassid("cdCS802");
        classid1=electivecourse1.getClassid();
        System.out.println(classid1);

        String disEl;
        disEl=electivecourse1.display();
        System.out.println(disEl);
    }
}
