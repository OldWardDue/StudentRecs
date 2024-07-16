import java.util.*;
class ResultsBoard {         // Здесь прописываю методы
    private List<Student> studResults;

    public ResultsBoard() {
        this.studResults = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studResults.add(student);
    }

    public List<Student> getTop3Students(int tStud) {
        List<Student> bestOfTheBest = new ArrayList<>(studResults);      // Сюда запихиваются крутышки
        bestOfTheBest.sort(Comparator.comparingDouble(Student::getRec).reversed());    // Магия сравнения значений с помощью компаратора. Reversed отвечает за порядок убывания бала
        return bestOfTheBest.subList(0, Math.min(tStud, bestOfTheBest.size()));
        // Вызов метода subList берет часть списка bestOfTheBest начиная с 0 и заканчивая меньшим из tStud(здесь = 3) значений размера списка
    }
}