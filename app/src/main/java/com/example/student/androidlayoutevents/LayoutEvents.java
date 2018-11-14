package com.example.student.androidlayoutevents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LayoutEvents extends AppCompatActivity {

    TextView textView = null;
    TextView textView2 = null;
    Button button = null;
    Button button2 = null;
    Button reset = null;
    View.OnClickListener ourOnClickListener = null;
    View.OnClickListener onClick2 = null;
    View.OnClickListener resetClick = null;
    int add_1 = 0;
    int add_2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_events);
        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        reset = (Button) findViewById(R.id.reset);
        ourOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add_1 = add_1 + 1;
                String addOne = "\n It's now" + add_1;
                textView.setText(addOne);
            }
        };
        onClick2 = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                add_1 = add_1 + 1;
                add_2 = add_2 + 1;
                String addOne = "\n It's now " + add_1;
                String addTwo = "\n It's now " + add_2;
                textView.setText(addOne);
                textView2.setText(addTwo);

            }
        };
        resetClick = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                add_2 = add_2 * 0;
                add_1 = add_1 * 0;
                String newOne = "\n Uh Oh it's " + add_1;
                String newTwo = "\n Uh Oh it's " + add_2;
                textView.setText(newOne) ;
                textView2.setText(newTwo);

            }
        };
        button.setOnClickListener(ourOnClickListener);
        button2.setOnClickListener(onClick2);
        reset.setOnClickListener(resetClick);
    }
}
