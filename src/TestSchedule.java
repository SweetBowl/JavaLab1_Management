public class TestSchedule {
    public TestSchedule() {
    }

    public static void main(String[] args){
        Schedule scd1=new Schedule("cdCS301","cdC401","cdT501","The 2nd Building 201");

        String classid1;
        scd1.setClassid("cdCS302");
        classid1=scd1.getClassid();
        System.out.println(classid1);

        String cid1;
        scd1.setCid("cdC402");
        cid1=scd1.getCid();
        System.out.println(cid1);

        String tid1;
        scd1.setTid("cdC502");
        tid1=scd1.getTid();
        System.out.println(tid1);

        String classroom1;
        scd1.setClassroom("The 2nd Building 202");
        classroom1=scd1.getClassroom();
        System.out.println(classroom1);

        String disSc;
        disSc=scd1.display();
        System.out.println(disSc);
    }

}
