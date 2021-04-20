abstract class Person {
  String name;
  int age;

  void setData(String name, int age) {
    this.name = name;
    this.age = age;
  }

  void setData(int age, String name) {
    this.name = name;
    this.age = age;
  }

  abstract void display();
}