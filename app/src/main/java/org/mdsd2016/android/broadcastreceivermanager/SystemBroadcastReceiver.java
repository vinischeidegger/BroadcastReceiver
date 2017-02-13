package org.mdsd2016.android.broadcastreceivermanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class SystemBroadcastReceiver extends BroadcastReceiver
{
    private static final String TAG = "In-SystemBroadReceiver";

    public SystemBroadcastReceiver() { }

    @Override
    public void onReceive(Context context, Intent intent)
    {
        switch (intent.getAction()) {
            case Intent.ACTION_POWER_CONNECTED:
                Log.i(TAG, "Power connected to the device");
                break;
            case Intent.ACTION_BATTERY_LOW:
                Log.i(TAG, "Battery low");
                break;
            case Intent.ACTION_AIRPLANE_MODE_CHANGED:
                Log.i(TAG, "Airplane Mode");
            default:
                break;
        }
    }
}