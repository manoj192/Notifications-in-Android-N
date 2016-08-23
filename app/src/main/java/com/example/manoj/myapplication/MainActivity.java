package com.example.manoj.myapplication;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button notify;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        notify=(Button)findViewById(R.id.notify);
        notify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NotificationCompat.Builder builder=new NotificationCompat.Builder(MainActivity.this);
                int color=getResources().getColor(R.color.colorPrimary);
                builder.setSmallIcon(R.mipmap.ic_launcher);
                builder.setColor(color);
                String text="Sample Check";
                Bitmap mProfilePic= BitmapFactory.decodeResource(getResources(), R.drawable.entrancz_logo);
                builder.setLargeIcon(mProfilePic);
                builder.setStyle(new NotificationCompat.BigTextStyle());
                builder.setContentText(text);
                Notification notification=builder.build();
                NotificationManagerCompat.from(MainActivity.this).notify(0,notification);
            }
        });

    }
}
