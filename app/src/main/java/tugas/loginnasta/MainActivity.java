package tugas.loginnasta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText username,password;
    Button login,logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.EdUsername);
        password = (EditText) findViewById(R.id.EdPassword);
        login = (Button) findViewById(R.id.BtnLogin);
        login.setOnClickListener(this);
        logout = (Button) findViewById(R.id.BtnLogout);
        logout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String TxtUsername = username.getText().toString();
        String TxtPassword = password.getText().toString();

        switch (v.getId()){
            case R.id.BtnLogin:
                Toast.makeText(getApplicationContext(),
                        "Username :"+TxtUsername+"\n"+
                                "Password :"+TxtPassword,Toast.LENGTH_LONG).show();
                break;
            case R.id.BtnLogout:
                Toast.makeText(getApplicationContext(),"button logout di klik",Toast.LENGTH_LONG).show();
                break;
            default:
        }
    }
}
