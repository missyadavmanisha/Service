package com.codingblocks.service;

import android.app.IntentService;
import android.content.Intent;
import android.content.IntentSender;
import android.support.annotation.Nullable;
import android.util.Log;

class Intentservice extends IntentService {
    String  TAG="loggin";

    public Intentservice(String name)
    {
        super("Myintentservices");
    }
    public  Intentservice()
    {
        super("name");
    }
    @Override
    protected void onHandleIntent( @Nullable Intent intent) {
        for(int i=0;i<100000;i++)
        {
           Log.e(TAG,"conn") ;
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(TAG,"onncreate");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"oncreate");
    }
}
