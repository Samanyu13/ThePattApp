package locals.tharilla.thepattapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    private Button Login;
    private Firebase test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        test = new Firebase("https://thepattapp51.firebaseio.com/");
        Login = (Button)findViewById(R.id.login);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Firebase mRefChild = test.child("Name");
                mRefChild.setValue("Soman");
            }
        });

    }

    public void gotosignup(View view)
    {
        Intent intent = new Intent(MainActivity.this, Signup.class);
        startActivity(intent);
    }
}
