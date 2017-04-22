package com.example.mark.lunchlist1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Restaurant r = new Restaurant();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button save = (Button) findViewById(R.id.buttonSave);

        save.setOnClickListener(onSave);
    }

    private View.OnClickListener onSave = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            EditText name = (EditText) findViewById(R.id.editTextName);
            EditText address = (EditText) findViewById(R.id.editTextAddress);

            r.setName(name.getText().toString());
            r.setAddress(address.getText().toString());
        }
    };
}
