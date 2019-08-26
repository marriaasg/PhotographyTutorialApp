package com.example.photographytutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private ImageButton BtnMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnMove = findViewById(R.id.playbutton);
        BtnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MoveToHomeActivity ();
            }
        });
    }

    private void MoveToHomeActivity(){
        Intent intennt = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(intennt);
    }
}
