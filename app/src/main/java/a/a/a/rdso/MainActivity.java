package a.a.a.rdso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.database.*;
import android.database.sqlite.SQLiteDatabase;

public class MainActivity extends AppCompatActivity {
Button b1,b2;
    EditText ed1,ed2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    b1 = (Button)findViewById(R.id.button);
        ed1 = (EditText)findViewById(R.id.editText);
        ed2 = (EditText)findViewById(R.id.editText2);
        b2 = (Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      if ((ed1.getText().toString().equals("admin")) && (ed2.getText().toString().equals("admin")))
                                          Toast.makeText(getApplicationContext(), "Redirecting", Toast.LENGTH_LONG).show();

                                      else
                                          Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_LONG).show();
                                  }
                              }
        );
       b2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               finish();
           }
       });
    }

}


