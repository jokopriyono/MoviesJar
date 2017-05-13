package id.web.jokopriyono.moviesjar.mainview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import id.web.jokopriyono.moviesjar.R;

public class HomeActivity extends AppCompatActivity {
    private TextView txtUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        txtUsername     =(TextView)     findViewById(R.id.txt_username);

        Intent i = getIntent();
        Toast.makeText(this, i.getStringExtra("username"), Toast.LENGTH_SHORT).show();
        txtUsername.setText(i.getStringExtra("username"));
    }
}
