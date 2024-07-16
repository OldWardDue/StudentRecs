class Student {       // Свойства студентов
    private String name;
    private double rec;

    public Student(String name, double record) {
        this.name = name;
        this.rec = record;
    }

    public String getName() {
        return name;
    }

    public double getRec() {
        return rec;
    }
}