public class TestTeacher {
    public TestTeacher(){
    }
    public static void main(String[] args){
        Teacher tea1=new Teacher("cdT101","Marc","male",40,"Professor");

        String tid1;
        tea1.setTid("cdT102");
        tid1=tea1.getTid();
        System.out.println(tid1);

        String tname1;
        tea1.setName("Mike");
        tname1=tea1.getName();
        System.out.println(tname1);

        String tsex1;
        tea1.setSex("Male");
        tsex1=tea1.getSex();
        System.out.println(tsex1);

        int tage1;
        tea1.setAge(45);
        tage1=tea1.getAge();
        System.out.println(tage1);

        String ttitle1;
        tea1.setTitle("Vice Professor");
        ttitle1=tea1.getTitle();
        System.out.println(ttitle1);

        String disT1;
        disT1=tea1.display();
        System.out.println(disT1);
    }
}
