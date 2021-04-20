class Main {
  public static void main(String[] args) {
    Student firstStudent = new Student();
    Teacher firstTeacher = new Teacher();

    firstStudent.setData(18, "Zokirjon");
    firstStudent.display();

    firstTeacher.setData("Umidjon", 33);
    firstTeacher.display();
  }
}