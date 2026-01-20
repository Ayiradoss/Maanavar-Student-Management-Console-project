package com.zsgs.maanavar.features.dashBoard;

import com.zsgs.maanavar.features.managefacultystudents.ManageView;

public class DashBoardController {

    private final DashBoardView view;

    public DashBoardController(DashBoardView view) {
        this.view = view;
    }

    public void handle(int choice) {
        if (choice == 1) {
            new ManageView().show();
        }
        else {
            System.exit(0);
        }
    }
}