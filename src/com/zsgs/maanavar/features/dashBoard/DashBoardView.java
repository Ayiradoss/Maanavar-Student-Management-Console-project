package com.zsgs.maanavar.features.dashBoard;

import java.util.Scanner;

public class DashBoardView {

    private final DashBoardController controller =
            new DashBoardController(this);

    public void showMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Manage Student\n2. Logout");
        controller.handle(sc.nextInt());
    }
}