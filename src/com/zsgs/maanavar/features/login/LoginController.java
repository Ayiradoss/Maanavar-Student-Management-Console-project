package com.zsgs.maanavar.features.login;

public class LoginController {

    private final LoginView loginView;
    private final LoginModel loginModel;
    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        this.loginModel = new LoginModel(this);
    }

    public void validateCredentials(String userName, String userPassword) {
        loginModel.validateCredentials(userName, userPassword);
    }

    public void onSuccessLogin() {
        loginView.onSuccessLogin();
    }

    public void onLoginFailed() {
        loginView.onLoginFailed();
    }
}
