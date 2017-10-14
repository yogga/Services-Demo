package com.example.d2a.servicesdemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.util.Log;
import android.widget.Toast;

public class MyOwnService extends Service {
    public MyOwnService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this,"Service Create",Toast.LENGTH_SHORT).show();
        Log.i("MyService","Service has created");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this,"Service Started",Toast.LENGTH_SHORT).show();
        Log.i("MyService","Service has started");
        return START_STICKY;

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"Service Stopped",Toast.LENGTH_SHORT).show();
        Log.i("MyService","Service has stopped");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
