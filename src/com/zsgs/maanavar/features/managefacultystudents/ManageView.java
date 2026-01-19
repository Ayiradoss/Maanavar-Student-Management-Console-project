package com.zsgs.maanavar.features.managefacultystudents;

import java.util.Scanner;

public class ManageView {

    private final ManageController controller =
            new ManageController(this);

    public void show() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Student ID: ");
        String id = sc.next();

        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("Department: ");
        String dept = sc.next();

        System.out.print("Year: ");
        int year = sc.nextInt();

        controller.addStudent(id, name, dept, year);
    }
}
