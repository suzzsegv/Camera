package com.example.camera;

import android.hardware.Camera;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class BluetoothRemoteControlEventLister implements RemoteControlEventListener {
    private AppCompatActivity mActivity;
    private Camera mCamera;

    BluetoothRemoteControlEventLister(AppCompatActivity activity, Camera camera){
        mActivity = activity;
        mCamera = camera;
    }

    @Override
    public void onCommandTakePicture(){
        Toast.makeText(mActivity, "Take Picture.", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onConnect(){
        Toast.makeText(mActivity, "Bluetooth Connected.", Toast.LENGTH_LONG).show();
    }
}
