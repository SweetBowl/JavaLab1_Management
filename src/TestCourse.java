public class TestCourse {
    public TestCourse(){
    }
    public static void main(String[] args){
        Course cour1=new Course("cdC201","Data Structure",48);

        String cid1;
        cour1.setCid("cdC202");
        cid1=cour1.getCid();
        System.out.println(cid1);

        String cname1;
        cour1.setCname("Data Analysis");
        cname1=cour1.getCname();
        System.out.println(cname1);

        int chour1;
        cour1.setChour(52);
        chour1=cour1.getChour();
        System.out.println(chour1);

        String disC;
        disC=cour1.display();
        System.out.println(disC);
    }
}
