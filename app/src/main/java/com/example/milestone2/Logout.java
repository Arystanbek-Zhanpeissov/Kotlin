package com.example.milestone2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ActionMenuView;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class Logout extends Activity {
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booking);
        logout.findViewById(R.id.booking);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(Logout.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
