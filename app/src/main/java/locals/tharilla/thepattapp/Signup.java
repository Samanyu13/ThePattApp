package locals.tharilla.thepattapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.firebase.client.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Signup extends AppCompatActivity {

    private Button creator;

    private Firebase mRef;

    private DatabaseReference database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Firebase.setAndroidContext(this);


        mRef = new Firebase("https://thepattapp51.firebaseio.com/");

        creator = (Button)findViewById(R.id.create);

        database = FirebaseDatabase.getInstance().getReference().child("Patt");

        creator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Firebase mRefChild = mRef.child("Count");
                mRefChild.setValue("Raj");
            }
        });
    }
}
