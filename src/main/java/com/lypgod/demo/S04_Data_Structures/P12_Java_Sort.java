package com.lypgod.demo.S04_Data_Structures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class P12_Java_Sort {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int testCases = Integer.parseInt(scanner.nextLine());

            List<Student> studentList = new ArrayList<>();
            while (testCases-- > 0) {
                int id = scanner.nextInt();
                String fname = scanner.next();
                double cgpa = scanner.nextDouble();

                Student st = new Student(id, fname, cgpa);
                studentList.add(st);
            }

            Collections.sort(studentList);
            studentList.forEach(e -> System.out.println(e.getFname()));
        }
    }
}

class Student implements Comparable<Student> {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getCgpa(), this.getCgpa()) != 0 ? Double.compare(o.getCgpa(), this.getCgpa())
                : this.getFname().compareTo(o.getFname()) != 0 ? this.getFname().compareTo(o.getFname())
                : Integer.compare(o.getId(), this.getId());
    }
}