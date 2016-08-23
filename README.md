# Notifications-in-Android-N

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
                
                
  Multi Windaow enabled in this samples .
