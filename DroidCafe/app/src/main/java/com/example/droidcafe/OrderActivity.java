package com.example.droidcafe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radio button was clicked.
        switch (view.getId()) {
            case R.id.rad_sameday:
                if (checked)
                    // Same day service
                    displayToast(getString(R.string.sameday));
                break;
            case R.id.rad_nextday:
                if (checked)
                    // Next day delivery
                    displayToast(getString(R.string.nextday));
                break;
            case R.id.rad_pickup:
                if (checked)
                    // Pick up
                    displayToast(getString(R.string.pickup));
                break;
            default:
                // Do nothing.
                break;
        }
    }
}//class
