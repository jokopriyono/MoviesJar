package id.web.jokopriyono.moviesjar.maininteractor;

/**
 * Created by LENOVO on 13/05/2017.
 */

public interface InterfaceMain {
    void showError();

    void messageError();

    void loginError();

    void loginSuccess(String username, String password);
}
