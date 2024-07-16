import java.util.*;

public class Main {
    public static void main(String[] args) {
        ResultsBoard studResults = new ResultsBoard();


        studResults.addStudent(new Student("Soap", 1.3));  // Заполняю List studResults
        studResults.addStudent(new Student("Gaz", 2.9));
        studResults.addStudent(new Student("Roach", 3.0));
        studResults.addStudent(new Student("Ghost", 4.6));
        studResults.addStudent(new Student("Price", 5.0));

        List<Student> top3 = studResults.getTop3Students(3);           // Проход по списку в теле цикла и вывод имя + балл
        for (Student student : top3) {
            System.out.println(student.getName() + ": " + student.getRec());
        }
    }
}