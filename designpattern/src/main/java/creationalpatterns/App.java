package creationalpatterns;

import BTTongHop.Lop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws CloneNotSupportedException {
        //Single ton
        /*
        Singleton s1 = Singleton.getInstance("I am single ton");

        s1.SayYourName();

        Singleton s2 = Singleton.getInstance();

        s2.SayYourName();
         */

        //Prototype
        /*
        Prototype obj1 = new Prototype("Prototype");
        //obj1.SayHello();

        Prototype obj2 = obj1.clone();
        //obj2.SayHello();

        obj2.Name = "Protype 2";
        obj2.SayHello();
        obj1.SayHello();
         */

        List<Student> lstStudents = new ArrayList<>();

        Student s1 = new Student();
        s1.Name = "Student 1";
        s1.DOB = "2002";
        s1.HomeTown = "Ha Noi";

        lstStudents.add(s1);

        Student s2 = new Student();
        s1.Name = "Student 2";
        s1.DOB = "1998";
        s1.HomeTown = "Ha Noi";

        lstStudents.add(s2);

        //=> Giai phap
        //GP:1
        /*
        List<Student> lstStudentss = Arrays.asList(
                new Student("Student 1", "2022", "Ha Noi"),
                new Student("Student 2", "Ha Noi", "1998"),
                new Student("Student 3", "Ha Noi")
        );*/

        //GP2 - Builder pattern
        List<Student> lstStudent3 = Arrays.asList(
                Student.builder().Name("Student1").Build(),
                Student.builder().Name("Student2").DOB("2022").Build(),
                Student.builder().Name("Student3").HomeTown("Ha Noi").DOB("2018").Build()
        );

        lstStudent3.forEach((sv)->{
            sv.toString();
        });

        Lop.builder().MaLop("La Gi cung c").TenLop("AAA").PhuTrach("BBB").build();
    }
}
