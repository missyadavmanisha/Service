package com.codingblocks.service;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

public class Myforgroundservice extends Service {
   String TAG="fore";
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(TAG,"oncreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Notification notification=new NotificationCompat.Builder(getBaseContext(),"ALPHA").
                setSmallIcon(R.mipmap.ic_launcher).setContentTitle("basic notification").setContentText("no")
                .build();

        startForeground(123,notification);
        return START_REDELIVER_INTENT;

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
