package com.breuhteam.apprate;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.util.TypedValue;

/**
 * Created by user007 on 05/03/18.
 */

public class AppRate {

    public static void app_launched(Context context,String packageName) {
        app_launched(context,packageName,0,0);

    }
    public static void app_launched(Context context,String packageName,int daysUntilPrompt,int lanchesUntilPrompt) {
        SharedPreferences prefs = context.getSharedPreferences("apprater", 0);

        if (prefs.getBoolean("dontshowagain", false)) { return ; }

        SharedPreferences.Editor editor = prefs.edit();

        // Increment launch counter
        long launch_count = prefs.getLong("launch_count", 0) + 1;
        editor.putLong("launch_count", launch_count);

        // Get date of first launch
        Long date_firstLaunch = prefs.getLong("date_firstlaunch", 0);
        if (date_firstLaunch == 0) {
            date_firstLaunch = System.currentTimeMillis();
            editor.putLong("date_firstlaunch", date_firstLaunch);
        }

        // Wait at least n days before opening
        if (launch_count >= lanchesUntilPrompt) {
            if (System.currentTimeMillis() >= date_firstLaunch +
                    (daysUntilPrompt * 24 * 60 * 60 * 1000)) {
                showRateDialog(context,editor,packageName);
            }
        }

        editor.commit();
    }
    public static void showRateDialog(final Context mContext, final SharedPreferences.Editor editor, final String packageName) {

        AlertDialog.Builder builder = new AlertDialog.Builder(mContext,R.style.AppRate_Theme);
        builder.setTitle(mContext.getResources().getString(R.string.rate_dialog_title));

        builder.setMessage(mContext.getResources().getString(R.string.rate_dialog_message))
                .setCancelable(false)
                .setPositiveButton(mContext.getResources().getString(R.string.rate_dialog_no), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //  Action for 'NO' Button
                        if (editor != null) {
                            editor.putBoolean("dontshowagain", true);
                            editor.commit();
                        }
                        dialog.cancel();
                    }
                })
                .setNegativeButton(mContext.getResources().getString(R.string.rate_dialog_cancel),new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                })
                .setNeutralButton(
                        mContext.getResources().getString(R.string.rate_dialog_ok), new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                mContext.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + packageName)));
                                dialog.cancel();
                            }
                        });
        AlertDialog alert = builder.create();
        alert.show();

    }
}
