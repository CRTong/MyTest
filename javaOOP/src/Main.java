import Model.Student;

public class Main {

    public static void main(String[] args) {

        Student stu = new Student();
        stu.setName("liming");
        stu.setAge(14);
        stu.setSex(1);
        stu.setStudentId("1001");

       System.out.println(stu.getName() + stu.getAge() +stu.getSex() + stu.getStudentId());

    }
}
