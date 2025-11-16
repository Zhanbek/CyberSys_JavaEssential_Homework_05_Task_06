import model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();

        Teacher teacherVoinova = new Teacher("Voinova");
        Teacher teacherKem = new Teacher("Kem");
        Teacher teacherSemenyanya = new Teacher("Semenyanya");
        Teacher teacherTkachuk = new Teacher("Tkachuk");
        Teacher teacherBalashov = new Teacher("Balashov");
        Teacher teacherBarinov = new Teacher("Barinov");

        teachers.add(teacherVoinova);
        teachers.add(teacherKem);
        teachers.add(teacherSemenyanya);
        teachers.add(teacherTkachuk);
        teachers.add(teacherBalashov);
        teachers.add(teacherBarinov);

        System.out.println();
        System.out.println("Список моїх вчителів:");
        System.out.println("---------------------------");
        for (int i = 0; i<teachers.size(); i++) {
            System.out.println(i + " : " + teachers.get(i).getName());
        }
        System.out.println("---------------------------");

        int theBestTeacherIndex = teachers.indexOf(teacherSemenyanya);
        int theWorstTeacherIndex = teachers.indexOf(teacherBarinov);

        System.out.println();
        System.out.println("Індекс найкращого вчителя '" + teacherSemenyanya.getName() + "' дорівнює: " + theBestTeacherIndex);
        System.out.println("Індекс найгіршого вчителя '" + teacherBarinov.getName() + "' дорівнює: " + theWorstTeacherIndex);
    }
}