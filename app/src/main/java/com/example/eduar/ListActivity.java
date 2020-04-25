package com.example.eduar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    ImageView image;
    TextView title, desc;

    String data1, data2;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        image = findViewById(R.id.newImage);
        title = findViewById(R.id.progTitle);
        desc = findViewById(R.id.desc);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        getData();

        setData();
    }

    private void getData() {
        if(getIntent().hasExtra("image") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2"))
        {
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            myImage = getIntent().getIntExtra("image", 1);
        }
        else
        {
            Toast.makeText(this, "No data...", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData() {
        image.setImageResource(myImage);
        title.setText(data1);
        desc.setText(data2);
    }


}
