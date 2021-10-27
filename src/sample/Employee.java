package sample;

public class Employee {

  int id;
  String surname;
  int age;
  int salary;
  String department;

  public Employee(int id1, String surname1, int age1, int salary1, String department1){
    id = id1;
    surname = surname1;
    age = age1;
    salary = salary1;
    department= department1;
  }
  public void salaryX2(){
    salary= salary*2;
  }
}

class EmployeeTest{
  public static void main(String[] args) {
    Employee e1 = new Employee(1,"Ivanov", 25, 12500, "Hyi");
    Employee e2 = new Employee(2,"Ivanova", 30, 120500, "Hyi1");

    e1.salaryX2();
    e2.salaryX2();
    System.out.println(e1.salary + " " + e2.salary);
  }
}
