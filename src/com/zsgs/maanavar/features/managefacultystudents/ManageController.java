package com.zsgs.maanavar.features.managefacultystudents;

import com.zsgs.maanavar.dto.StudentInfo;
import com.zsgs.maanavar.repository.MaanavarDB;

public class ManageController {

    private final ManageView view;

    public ManageController(ManageView view) {
        this.view = view;
    }

    public void addStudent(String id, String name, String dept, int year) {

        StudentInfo student =
                new StudentInfo(id, name, dept, year);

        MaanavarDB.getInstance().insertStudent(student);
    }
}
