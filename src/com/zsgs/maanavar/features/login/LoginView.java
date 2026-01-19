package com.zsgs.maanavar.features.login;

import com.zsgs.maanavar.features.updateCredentials.UpdateCredentialsView;

import java.util.Scanner;

public class LoginView {

    private final LoginController loginController;
    //private final LoginModel loginModel;

    public LoginView()
    {
        loginController = new LoginController(this);
        //loginModel = new LoginModel(this);
    }
    public void initLogin()
    {
        System.out.print("Enter your Name: ");
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        System.out.print("Enter your Password: ");
        String userPassword = sc.next();

        loginController.validateCredentials(userName, userPassword);
    }

    public void onSuccessLogin() {
        UpdateCredentialsView updateCredentials = new UpdateCredentialsView();
        updateCredentials.init();
    }

    public void onLoginFailed() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Invalid username or password");
        System.out.println("Do you want to try again? Y/N?");
        String option = sc.next();

        if (option.equalsIgnoreCase("Y")) {
            initLogin();
        }
        else {
            System.out.println("Exiting Login...");
        }
    }
}
