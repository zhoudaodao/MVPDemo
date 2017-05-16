package bawei.com.mvpdemo.p;

/**
 * date:2017/5/16
 * author:周道(leovo)
 * funcation:
 */
public interface LoginPresenter {
    void validateCredentials(String username, String password);

    void onDestroy();
}
