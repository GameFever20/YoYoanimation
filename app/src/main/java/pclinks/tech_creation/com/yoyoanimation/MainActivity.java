package pclinks.tech_creation.com.yoyoanimation;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    EditText name, password;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        YoYo.with(Techniques.BounceIn)
                .duration(1500)
                .repeat(0)
                .playOn(toolbar);


        name = (EditText) findViewById(R.id.name);
        password = (EditText) findViewById(R.id.password);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                YoYo.with(Techniques.BounceIn)
                        .duration(1500)
                        .repeat(0)
                        .playOn(toolbar);


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void enterButton(View view) {

        if (name.getText().toString().isEmpty()) {

            //animation here

            YoYo.with(Techniques.Tada)
                    .duration(500)
                    .repeat(0)
                    .playOn(name);
            YoYo.with(Techniques.Tada)
                    .duration(500)
                    .repeat(0)
                    .playOn(password);


        } else {
            Toast.makeText(this, "name -" + name.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    }
}
