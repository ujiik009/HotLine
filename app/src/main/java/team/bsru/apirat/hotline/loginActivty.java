package team.bsru.apirat.hotline;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class loginActivty extends AppCompatActivity {
    private EditText pass,user;
    private Button login, register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activty);
        user = (EditText) findViewById(R.id.editText);
        pass = (EditText) findViewById(R.id.editText2);
        login = (Button) findViewById(R.id.login);
        register = (Button) findViewById(R.id.register);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getText().toString().equals("") || pass.getText().toString().equals("")) {
                    Toast.makeText(loginActivty.this,"กรุณากรอกให้ครบ",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(loginActivty.this,"OK",Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(loginActivty.this,ListView_Hotline.class);
                    startActivity(intent);
                }
            }
        });
    }
}
