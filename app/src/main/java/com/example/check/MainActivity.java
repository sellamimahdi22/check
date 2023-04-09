package com.example.check;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox check1= findViewById(R.id.check1);
        CheckBox check2= findViewById(R.id.check2);
        CheckBox check3= findViewById(R.id.check3);
        check1.setOnClickListener(this);
        check2.setOnClickListener(this);
        check3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
switch (view.getId()){
    case R.id.check1:
        Toast.makeText(this, "contact", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(MainActivity.this,Contact.class);
        startActivity(i);
        break;
    case R.id.check2:
        Toast.makeText(this, "contact", Toast.LENGTH_SHORT).show();
        Intent o = new Intent(MainActivity.this,Maps.class);
        startActivity(o);
        break;
    case R.id.check3:
        Toast.makeText(this, "contact", Toast.LENGTH_SHORT).show();
        Intent u = new Intent(MainActivity.this,web.class);
        startActivity(u);
        break;
}
    }
}