class Student:
  next_id = 1
  def __init__(self, name, elective):
    self.studentId = Student.next_id
    self.studentName = name
    self.selectedElective = elective
    Student.next_id += 1

  student_db = []

  def add_students(self):
    Student.student_db.append(self)
    print(f"{self.studentId} | {self.studentName} | {self.selectedElective} is Added in database")

  def update_elective(self, new_elective):

    for student in Student.student_db:
      if student.studentId == self.studentId:
        student.selectedElective = new_elective
        return "Student updated successfully"
      return "Student not found"

  def remove_student(self):
    for i in range(len(Student.student_db)):

      if Student.student_db[i].studentId == self.studentId:

        print(f"\n\nRemoving :- {self.studentName}")
        Student.student_db.pop(i)
        return "Student removed sucessfully"


  @classmethod
  def display_database(cls):
    print("\n\n     Current student records     ")
    for student in Student.student_db:
      print(f"ID: {student.studentId} | Name: {student.studentName} | Elective : {student.selectedElective} ")


adnan = Student("Adnan", "IOT")
adnan.add_students()
bilal = Student("Bilal", "IOT")
bilal.add_students()
alice = Student("Alice", "IOT")
alice.add_students()
tamanna = Student("Tamanna", "AI")
tamanna.add_students()

Student.display_database()

adnan.update_elective( "AI")
Student.display_database()

print(adnan.remove_student())
Student.display_database()