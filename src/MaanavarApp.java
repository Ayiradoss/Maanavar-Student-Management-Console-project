import com.zsgs.maanavar.features.login.LoginView;

public class MaanavarApp {
    public static String version = "1.0.5";
    public static void main(String[] args)
    {
        MaanavarApp maanavarApp = new MaanavarApp();
        maanavarApp.init();
    }

    private void init()
    {
        System.out.println("Welcome to Maanavar App: "+version);

        LoginView loginView = new LoginView();
        loginView.initLogin();
    }
}