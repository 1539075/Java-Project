import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
    //    @Test
//    public void testHelloWorld() {
//        System.out.println("Hello World");
//    }
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < (arr[j - 1])) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else
                    break;
            }
        }
    }

//    class Person {
//        private String name;
//        private int age;
//
//        public Person(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//
//        public Person() {
//        }
//
//        public String getName() {
//            return this.name;
//        }
//
//        public int getAge() {
//            return this.age;
//        }
//
//
//        public String setName(String name) {
//            this.name = name;
//            return "Name set to " + name;
//        }
//
//        public String setName(String firstName, String lastName) {
//            this.name = firstName + " " + lastName;
//            return "Full name set to " + this.name;
//        }
//
//        public String setAge(int age) {
//            this.age = age;
//            return "Age set to " + age;
//        }
//    }


    class Person {
        protected String name;
        protected int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    class Student extends Person {
        protected int score;

        public Student(String name, int age, int score) {
            super(name, age);
            this.score = score;
        }

        public int getScore() {
            return score;
        }
    }

    class PrimaryStudent extends Student {
        // TODO
        protected int grade;

        public PrimaryStudent(String name, int age, int score, int grade) {
            super(name, age, score);
            this.grade = grade;
        }
        public int getGrade() {
            return this.grade;
        }

    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // public static void swap(Object[] arr, int i, int j){
//     Object t = arr[i];
//     arr[i] = arr[j];
//     arr[j]=t;
// }
    public static void main(String[] args) {
//        // System.out.println("Hello World!");
////        int[] arr = {9, 4, 5, 22, 6, 8, 3, 7, 11, 23, 45};
////        HelloWorld.bubbleSort(arr);
////        System.out.println(Arrays.toString(arr));
////        Person ming = new HelloWorld().new Person();
////        ming.setName("小明");
////        ming.setAge(12);
////        System.out.println(ming.getAge());
////        System.out.println(ming.getName());
//
////        exercise object
//
////        Person ming = new HelloWorld().new Person("Ming", 18);
////        System.out.println(ming.getName());
////        System.out.println(ming.getAge());
//
////        exercise override
//        Person ming = new HelloWorld().new Person();
//        Person hong = new HelloWorld().new Person();
//        ming.setName("Xiao Ming");
//        // TODO: 给Person增加重载方法setName(String, String):
//        hong.setName("Xiao", "Hong");
//        System.out.println(ming.getName());
//        System.out.println(hong.getName());
//
        Person p = new HelloWorld().new Person("小明", 12);
        Student s = new HelloWorld().new Student("小红", 20, 99);
        // TODO: 定义PrimaryStudent，从Student继承，新增grade字段:
        Student ps = new HelloWorld().new PrimaryStudent("小军", 9, 100, 5);
        System.out.println(ps.getScore());
        System.out.println(((PrimaryStudent) ps).getGrade());
    }
}
