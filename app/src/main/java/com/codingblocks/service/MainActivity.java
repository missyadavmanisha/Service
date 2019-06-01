package com.codingblocks.service;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button simple,intent,foreground;
NotificationManager notificationManager;
String channel_id="Channel";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simple=findViewById(R.id.simple);
        intent=findViewById(R.id.simple);
        foreground=findViewById(R.id.simple2);
        notificationManager=(NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel=new NotificationChannel(channel_id,"fore",notificationManager.IMPORTANCE_DEFAULT);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(getBaseContext(),MyService.class);
                startService(in) ;

            }
        });
        intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Intent intent=new Intent(getBaseContext(),Intentservice.class);
startService(intent);
            }
        });
        foreground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
Intent intent =new Intent(getBaseContext(),Myforgroundservice.class);
                ContextCompat.startForegroundService(getBaseContext(),intent);
            }
        });
    }
}
