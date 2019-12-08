public class TestStudent {
    public TestStudent(){
    }

    public static void main(String args[]){
        Student std1=new Student("cd001","Kevin","male",18,"CS");
        String sname1;
        std1.setName("Lucy");
        sname1=std1.getName();
        System.out.println(sname1);

        String sid1;
        std1.setSid("cd111");
        sid1=std1.getSid();
        System.out.println(sid1);

        String ssex1;
        std1.setSex("Male");
        ssex1=std1.getSex();
        System.out.println(ssex1);

        int sage1;
        std1.setAge(19);
        sage1=std1.getAge();
        System.out.println(sage1);

        String smajor1;
        std1.setMajor("Software Engineering");
        smajor1=std1.getMajor();
        System.out.println(smajor1);

        String disS1;
        disS1=std1.display();
        System.out.println(disS1);
    }
}
