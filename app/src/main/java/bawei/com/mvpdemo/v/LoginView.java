package bawei.com.mvpdemo.v;

/**
 * date:2017/5/16
 * author:周道(leovo)
 * funcation:
 */

public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToHome();
}
