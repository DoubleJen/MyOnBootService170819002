package tw.adouble.app.helloworld.myonbootservice170819002;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("brad", "OnReceive");
        Intent it = new Intent(context, MyService.class);
        context.startService(it);
    }
}
