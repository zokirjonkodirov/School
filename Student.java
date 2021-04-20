public class Student extends Person {
  int rollNumber;
  @Override
  void display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Roll number: " + rollNumber);
  }
}