package sample;

public class Student {
    int studentId;
    String name;
    String surname;
    int year;
    double scoreMathematics;
    double scoreEconomic;
    double scoreLanguage;


}

class StudentTest{

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.studentId = 1;
        st1.name = "Ivan";
        st1.surname = "Popov";
        st1.year = 1009;
        st1.scoreMathematics = 4.6;
        st1.scoreEconomic = 3.5;
        st1.scoreLanguage = 4.0;

        average(st1);
        //System.out.println("Средняя арифметическая оценка студента " + st1.name + " "+st1.surname + "="+ (st1.scoreMathematics + st1.scoreEconomic + st1.scoreLanguage) / 3);
    }

    public static void average(Student st2){
        System.out.println("Средняя арифметическая оценка студента " + st2.name + " "+st2.surname + "="+ (st2.scoreMathematics + st2.scoreEconomic + st2.scoreLanguage) / 3);
    }

}
