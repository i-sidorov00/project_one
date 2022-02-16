package com.company;

import com.company.people.Student;
import com.company.people.Teacher;

public class Main {

    public static void main (String[] args) {
        Student studentOne = new Student("Игорь", "Сидоров", 21, "Пинж", 3);
        Student studentTwo = new Student("Алексей", "Малеванов", 20);

        studentTwo.setGroup("Пинж");
        studentTwo.setKurs(3);

        studentOne.printInfo();
        studentTwo.printInfo();

        Teacher teacherOne = new Teacher("Андрей","Микитчук",29,"Алексеевич");
        Teacher teacherTwo = new Teacher("Наталья","Вагарина",37,"сергеевна","ИКСП","Доцент");

        teacherOne.setKafedra("ИКСП");
        teacherOne.setPost("Ассистент");

        teacherOne.printInfo();
        teacherTwo.printInfo();


    }

}
