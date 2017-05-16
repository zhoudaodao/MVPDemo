package bawei.com.mvpdemo.p;

/**
 * date:2017/5/16
 * author:周道(leovo)
 * funcation:
 */

public interface OnLoginFinishedListener {
    void onUsernameError();

    void onPasswordError();

    void onSuccess();
}
