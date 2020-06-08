 package com.example.burgerrating;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar = findViewById(R.id.ratingBar);
        textView = findViewById(R.id.textView);

    }

    public void submit(View view){
        float rating = ratingBar.getRating();

        if(rating<=2){
            textView.setText("Thank you!" + "\n" +"We will try to improve next time");
            textView.setTextColor(Color.parseColor("#0A79DF"));
        }
        else if(rating>2 && rating<=3){
            textView.setText("Good");
            textView.setTextColor(Color.parseColor("#0A79DF"));
        }
        else if(rating>3 && rating<=4.5){
            textView.setText("Great!");
            textView.setTextColor(Color.parseColor("#0A79DF"));
        }
        else
            textView.setText("Excellent!!!");
        textView.setTextColor(Color.parseColor("#0A79DF"));

    }
}
