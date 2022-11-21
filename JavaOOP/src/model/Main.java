package model;

public class Main {
    public static void main(String[] args){
        Student student = new Student("Tom",18,'M',"12345678");
        System.out.println("Name = " + student.getName());
        System.out.println("Age = " + student.getAge());
        System.out.println("Gender = " + student.getGender());
        System.out.println("ID No = " + student.getId());
    }

}
