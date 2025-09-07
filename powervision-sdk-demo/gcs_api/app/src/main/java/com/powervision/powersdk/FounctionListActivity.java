package com.powervision.powersdk;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FounctionListActivity extends AppCompatActivity {

    private Button mount;
    private Button camera;
    private Button position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_founction);

        mount = findViewById(R.id.mount);
        camera = findViewById(R.id.camera);
        position = findViewById(R.id.position);

        mount.setOnClickListener(this::onViewClicked);
        camera.setOnClickListener(this::onViewClicked);
        position.setOnClickListener(this::onViewClicked);
    }

    public void onViewClicked(View view) {
        int id = view.getId();
        if (id == R.id.mount) {
            startActivity(new Intent(this, MountActivity.class));
        } else if (id == R.id.camera) {
            startActivity(new Intent(this, CameraActivity.class));
        } else if (id == R.id.position) {
            startActivity(new Intent(this, LocationActivity.class));
        }
    }

}