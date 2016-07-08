package zy.chasegoddness.global;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Administrator on 2016/7/5.
 */
public class LocalDB {

    public static final String DB_NAME = "GoddnessData";

    public static final String PHONE = "phoneNum";
    public static final String AUTO_SEND = "autoSend";
    public static final String FIRST_LOGIN = "firstLogin";
    public static final String FAVORABILITY = "favorability";
    public static final String FAVOR_UPDATE = "favorabilityUpdate";
    public static final String KEYBOARDHEIGHT = "keyboardHeight";

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    public LocalDB(Context context) {
        sharedPreferences = context.getSharedPreferences(DB_NAME, Context.MODE_PRIVATE);
        editor = sharedPreferences.edit();
    }

    public void putPhoneNum(String phoneNum) {
        editor.putString(PHONE, phoneNum);
        editor.commit();
    }

    public String getPhoneNum() {
        return sharedPreferences.getString(PHONE, "");
    }

    public void putAutoSend(boolean isAutoSend) {
        editor.putBoolean(AUTO_SEND, isAutoSend);
        editor.commit();
    }

    public boolean getAutoSend() {
        return sharedPreferences.getBoolean(AUTO_SEND, false);
    }

    public void putFirstLogin(boolean isFirstLogin) {
        editor.putBoolean(FIRST_LOGIN, isFirstLogin);
        editor.commit();
    }

    public boolean getFirstLogin() {
        return sharedPreferences.getBoolean(FIRST_LOGIN, true);
    }

    public void putFavorability(int favorability) {
        editor.putInt(FAVORABILITY, favorability);
        editor.commit();
    }

    public int getFavorability() {
        return sharedPreferences.getInt(FAVORABILITY, 30);
    }

    public void putFavorUpdate(long updateDate) {
        editor.putLong(FAVOR_UPDATE, updateDate);
        editor.commit();
    }

    public long getFavorUpdate() {
        return sharedPreferences.getLong(FAVOR_UPDATE, 0);
    }

    public void putKeyboardHeight(int height) {
        editor.putInt(KEYBOARDHEIGHT, height);
        editor.commit();
    }

    public int getKeyboardHeight() {
        return sharedPreferences.getInt(KEYBOARDHEIGHT, 0);
    }
}