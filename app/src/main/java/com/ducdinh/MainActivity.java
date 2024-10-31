package com.ducdinh;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        addControl();
        addEvents();
    }

    private void addEvents() {
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XulyMoManHinhDanhBa();
            }
        });

    }

    private void XuLyManHinhTinNhan() {
        // Xử lý mở màn hình tin nhắn
    }

    private void XulyMoManHinhDanhBa() {
        Intent it = new Intent(MainActivity.this, DanhBa.class);
        startActivity(it);
    }

    private void addControl() {
        btn1 = findViewById(R.id.btn1);

    }
}
