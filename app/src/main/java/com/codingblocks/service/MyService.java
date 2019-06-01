package com.codingblocks.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class MyService extends Service {

    String TAG="logging";
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
        Log.e(TAG,"onstartcommand");
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<1000000000;i++)
                {
                 Log.e(TAG,"omrun") ;
                }
                stopSelf();
            }
        }) .start();
       // stopSelf();
        return super.onStartCommand(intent, flags, startId);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
