package com.joelbland.hellogoodbyev3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the ImageView and TextView objects from the View to work with.
        TextView tvHello = findViewById(R.id.tvHello);
        TextView tvGoodbye = findViewById(R.id.tvGoodbye);
        ImageView ivHello = findViewById(R.id.ivHello);
        ImageView ivGoodbye = findViewById(R.id.ivGoodbye);
        ImageView ivButton = findViewById(R.id.ivButton);
        ivButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int int_tvHello = tvHello.getVisibility();
                if (int_tvHello == 0){
                    tvHello.setVisibility(View.INVISIBLE);
                    tvGoodbye.setVisibility(View.VISIBLE);
                    ivHello.setVisibility(View.INVISIBLE);
                    ivGoodbye.setVisibility(View.VISIBLE);
                }
                else{
                    tvHello.setVisibility(View.VISIBLE);
                    tvGoodbye.setVisibility(View.INVISIBLE);
                    ivHello.setVisibility(View.VISIBLE);
                    ivGoodbye.setVisibility(View.INVISIBLE);
                }


            }
        });
    }
}