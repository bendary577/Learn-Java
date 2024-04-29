package parallelProgramming.parallelStream;

import java.util.LinkedList;
import java.util.OptionalDouble;

public class AParallelStream {

    private class Student {
        String name;
        int age;

        Student(String name, int age){
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
    private LinkedList<Student> students;

    public AParallelStream(){
        students = new LinkedList<>();
        Student s1 = new Student("Aly", 15);
        Student s2 = new Student("Omar", 20);
        students.add(s1);
        students.add(s2);
    }

    /*
    * Java streams pipeline can be made to execute in parallel
    * by designating the source to be a parallel stream
    * */
    private OptionalDouble calculateAverageStudentAge(){
        return students.parallelStream()
                .filter(s-> s.getAge() == 15)
                .mapToInt(Student::getAge)
                .average();
    }
}
