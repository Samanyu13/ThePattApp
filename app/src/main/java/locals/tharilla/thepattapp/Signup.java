package locals.tharilla.thepattapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;

public class Signup extends AppCompatActivity {

    private Button creator;

    private Firebase mRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        mRef = new Firebase("https://thepattapp51.firebaseio.com/");

        creator = (Button)findViewById(R.id.create);

        creator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Firebase mRefChild = mRef.child("Name");
                mRefChild.setValue("Soman");
            }
        });
    }
}
