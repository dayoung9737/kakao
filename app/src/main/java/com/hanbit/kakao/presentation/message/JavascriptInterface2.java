package com.hanbit.kakao.presentation.message;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.telephony.SmsManager;
import android.widget.Toast;

/**
 * Created by hb2004 on 2017-01-21.
 */

public class JavascriptInterface2 {
    Context context;

    public JavascriptInterface2(Context context) {
        this.context=context;
           }
    @android.webkit.JavascriptInterface
    public void showToast(String message){
        Toast.makeText(context,message, Toast.LENGTH_LONG).show();

    }
    @android.webkit.JavascriptInterface
    public void savePreference(String key, String value) {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = sp.edit();
        editor.putString(key, value);
        editor.commit();
    }

//public void Vibrate(long milliseconds){

   // AutoCompleteTextView.Vive
   // AutoCompleteTextView.Validator v = context.getSystemService(Context.VIBRATOR_SERVICE);

    @android.webkit.JavascriptInterface
    public void sendSMS(String phone, String message){
        SmsManager sms =SmsManager.getDefault();
        sms.sendTextMessage(phone, null, message, null, null);

    }


}
