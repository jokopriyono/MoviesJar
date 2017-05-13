package id.web.jokopriyono.moviesjar.mainview;

import android.text.TextUtils;

import id.web.jokopriyono.moviesjar.maininteractor.InterfaceMain;
import id.web.jokopriyono.moviesjar.maininteractor.InterfacePresenter;

public class MainPresenter implements InterfacePresenter{
    private InterfaceMain mInterfaceMain;

    public MainPresenter(InterfaceMain mInterfaceMain) {
        this.mInterfaceMain = mInterfaceMain;
    }

    @Override
    public void login(String username, String password) {
        if (TextUtils.isEmpty(username) || TextUtils.isEmpty(password)){
            mInterfaceMain.messageError();
        } else {
            if (username.equals("joko") && password.equals("joko")){
                mInterfaceMain.loginSuccess(username, password);
            } else {
                mInterfaceMain.loginError();
            }
        }
    }
}
