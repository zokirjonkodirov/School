public class Teacher extends Person {
  int salary = 500;
  @Override
  void display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }
}