package srikanth.tourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ListView lView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView trText = (TextView) findViewById(R.id.tvOne);
        TextView chText = (TextView) findViewById(R.id.tvTwo);
        TextView maText = (TextView) findViewById(R.id.tvThree);
        TextView coText = (TextView) findViewById(R.id.tvFour);


        if (trText != null) {
            trText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent trIntent = new Intent(MainActivity.this, TrActivity.class);
                    startActivity(trIntent);
                }
            });
        }
        if (chText != null) {
            chText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent trIntent = new Intent(MainActivity.this, ChenActivity.class);
                    startActivity(trIntent);
                }
            });
        }
        if (maText != null) {
            maText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent trIntent = new Intent(MainActivity.this, MadActivity.class);
                    startActivity(trIntent);
                }
            });
        }
        if (coText != null) {
            coText.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent trIntent = new Intent(MainActivity.this, CoimActivity.class);
                    startActivity(trIntent);
                }
            });
        }
    }
}
