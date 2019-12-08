public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Jack", "male", 20);
        String name1;
        person1.setName("Jacky");
        name1 = person1.getName();
        System.out.println(name1);

        String sex1;
        person1.setSex("Male");
        sex1=person1.getSex();
        System.out.println(sex1);

        int age1;
        person1.setAge(21);
        age1=person1.getAge();
        System.out.println(age1);

        String disP1;
        disP1=person1.display();
        System.out.println(disP1);
    }
}
