package model;

public class Student {

    private String name;
    private int age;
    private double mark;

    public Student(String s) {
        String[] arr = s.split(",");
        name = arr[0];
        age = Integer.parseInt(arr[1]);
        mark = Double.parseDouble(arr[2]);
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

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return name + "," + age + "," + mark;
    }

}
