package id.web.jokopriyono.moviesjar.mainview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import id.web.jokopriyono.moviesjar.R;
import id.web.jokopriyono.moviesjar.maininteractor.InterfaceMain;
import id.web.jokopriyono.moviesjar.maininteractor.InterfacePresenter;

public class MainActivity extends AppCompatActivity implements InterfaceMain{
    private EditText edtUname, edtPass;
    private Button btnLogin;
    private InterfacePresenter mInterfacePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUname    = (EditText)    findViewById(R.id.edt_username);
        edtPass     = (EditText)    findViewById(R.id.edt_password);
        btnLogin    = (Button)      findViewById(R.id.btn_login);

        mInterfacePresenter = new MainPresenter(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mInterfacePresenter.login(edtUname.getText().toString(),
                        edtPass.getText().toString());
            }
        });
    }

    @Override
    public void showError() {

    }

    @Override
    public void messageError() {
        Toast.makeText(this, "Username atau password tidak boleh kosong", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginError() {
        Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginSuccess(String username, String password) {
        Toast.makeText(this, "Voila!", Toast.LENGTH_SHORT).show();
        Intent i = new Intent(this, HomeActivity.class);
        i.putExtra("username", username);
        i.putExtra("password", password);
        startActivity(i);
    }
}
