package com.example.camera;

import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class BluetoothRemoteControlEventLister implements RemoteControlEventListener {
    private MainActivity mActivity;

    BluetoothRemoteControlEventLister(MainActivity activity){
        mActivity = activity;
    }

    @Override
    public void onCommandTakePicture(){
        mActivity.takePicture();
        Toast.makeText(mActivity, "Take Picture.", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onConnect(){
        Toast.makeText(mActivity, "Bluetooth Connected.", Toast.LENGTH_LONG).show();
    }
}
