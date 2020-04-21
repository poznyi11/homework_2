package by.ivpo.homework_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startRandomNumbers(View view) {
        Intent intent = new Intent(this, RandomNumbers.class);
        startActivity(intent);
    }

    public void startUserNumbers(View view) {
        Intent intent = new Intent(this, UserNumbers.class);
        startActivity(intent);
    }
}
