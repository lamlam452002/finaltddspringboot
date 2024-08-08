package creationalpatterns;

import java.util.jar.Attributes;

public class Student {
    public String Name;
    public String DOB;
    public String HomeTown;

    public Student(){}
    public Student(String Name, String DOB, String HomeTown)
    {
        this.Name = Name;
        this.DOB = DOB;
        this.HomeTown = HomeTown;
    }

    @Override
    public String toString() {
        System.out.println("Name: "+ this.Name);
        System.out.println("Date of birth:" + this.DOB);
        System.out.println("Hometown: "+ this.HomeTown);
        return "";
    }

    public static class StudentBuilder
    {
        private String name;
        private String hometown;
        private String dob;
        public StudentBuilder Name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder HomeTown(String hometown) {
            this.hometown = hometown;
            return this;
        }

        public StudentBuilder DOB(String dbo) {
            this.dob = dbo;
            return this;
        }

        public Student Build() {
            Student student = new Student();
            student.Name = this.name;
            student.DOB = this.dob;
            student.HomeTown = this.hometown;
            return student;
        }
    }
    public static StudentBuilder builder() {
        return new StudentBuilder();
    }
}
