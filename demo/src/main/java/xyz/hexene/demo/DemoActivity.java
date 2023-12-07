package xyz.hexene.demo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class DemoActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);
    }

    public void questNetwork(View view) {
        new Thread(() -> {
            try {
                HttpUrlConnectionDemo.requestNet("https://www.baidu.com");
            } catch (IOException e) {
                Log.e("DemoActivity", "questNetwork: " + e.getMessage());
            }
        }).start();
    }
}
