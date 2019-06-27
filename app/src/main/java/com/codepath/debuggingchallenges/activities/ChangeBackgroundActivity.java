package com.codepath.debuggingchallenges.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.codepath.debuggingchallenges.R;

public class ChangeBackgroundActivity extends AppCompatActivity {

    private int oldColor = Color.BLUE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_background);
        final Button go = findViewById(R.id.btnGo);
        go.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onGoClick(v);
            }
        });

    }

    public void onGoClick(View view) {
        View mainView = findViewById(android.R.id.content);
        mainView.setBackgroundColor(getNextColor());
//        Toast.makeText(ChangeBackgroundActivity.this, "Clicked here", Toast.LENGTH_LONG).show();
    }

    private int getNextColor() {
        int newColor = (oldColor == Color.BLUE) ? Color.RED : Color.BLUE;
        oldColor = newColor;
        return newColor;
    }


}
