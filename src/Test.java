import model.Student;
import service.FileService;
import service.StudentService;

import java.lang.reflect.Field;

public class Test {

    final static String url = "StudentDataBase";

    public static void main(String[] args) throws Exception{

        String[] lines = FileService.readFile(url);
        Student[] students = StudentService.convert(lines);

        Student maxAgeStudent = StudentService.maxAge(students);
        Student maxMarkStudent = StudentService.maxMark(students);

        FileService.writeFile(url, maxAgeStudent.toString());
        FileService.writeFile(url, maxMarkStudent.toString());

        for(int i = 0; i < students.length; i++) {
            String name = students[i].getName();
            FileService.createFile(name, students[i].toString());
        }

    }
}
