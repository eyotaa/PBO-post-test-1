package com.mycompany.posttest1;
import com.mycompany.posttest1.Student;
import java.util.ArrayList;

public class Posttest1 {

    public static void main(String[] args) {
        
        Student student1 = new Student("Rikad Anggoro Putra", 22505, "Laki - Laki", "02/09/2004", "08214264827");
        Student student2 = new Student("Muhammad Novandra", 22506, "Laki - Laki", "23/06/2004", "08114365020");
        Student student3 = new Student("Siti Nur Jett", 22507, "Perempuan", "14/02/2004", "08415224327");
        Student student4 = new Student("Haykal Brimstone", 22508, "Laki - Laki", "10/12/2003", "08914214831");
        Student student5 = new Student("Fitrianti", 22509, "Perempuan", "30/01/2004", "08814162247");
        
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        
        for (Student student : students){
            String name = "Nama Siswa: " + student.name;
            String nisn = "\nNISN: " + student.NISN;
            String gender = "\nJenis Kelamin: " + student.gender;
            String dateOfBirth = "\nTanggal Lahir: " + student.dateOfBirth;
            String phoneNumber = "\nNo Telepon: " + student.phoneNumber + "\n";
            System.out.println(name.concat(nisn + gender + dateOfBirth + phoneNumber));

        }
    }
}
