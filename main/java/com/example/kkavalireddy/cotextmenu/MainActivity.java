package com.example.kkavalireddy.cotextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.text_veiw);

        registerForContextMenu(textView);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu,menu);
        menu.setHeaderTitle("Choose your Item");
        /*super.onCreateContextMenu(menu, v, menuInfo);*/
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId())
        {
            case R.id.option1:
                Toast.makeText(this, "Option One", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.option2:
                Toast.makeText(this, "Option Two", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.option3:
                Toast.makeText(this, "Option three", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.option4:
                Toast.makeText(this, "Option Four", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.option5:
                Toast.makeText(this, "Option Five", Toast.LENGTH_SHORT).show();
                return true;

            default:
                return super.onContextItemSelected(item);

        }
    }
}
