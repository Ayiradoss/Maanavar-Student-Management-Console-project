package com.zsgs.maanavar.features.login;

import com.zsgs.maanavar.repository.MaanavarDB;

public class LoginModel {
    //private final LoginView loginView;
    private final LoginController loginController;


    public LoginModel(LoginController loginController)
    {
        this.loginController = loginController;
    }

    public void validateCredentials(String userName, String userPassword) {
        if(MaanavarDB.getInstance().isValidUser(userName, userPassword))
        {
            loginController.onSuccessLogin();
        }
        else
        {
            loginController.onLoginFailed();
        }
    }
}