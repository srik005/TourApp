package srikanth.tourapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvOne= (TextView) findViewById(R.id.tvOne);
        TextView tvTwo= (TextView) findViewById(R.id.tvTwo);
        TextView tvThree= (TextView) findViewById(R.id.tvThree);
        TextView tvFour= (TextView) findViewById(R.id.tvFour);

        if (tvOne != null) {
            tvOne.setOnClickListener(this);
        }
        if (tvTwo != null) {
            tvTwo.setOnClickListener(this);
        }
        if (tvThree != null) {
            tvThree.setOnClickListener(this);
        }
        if (tvFour != null) {
            tvFour.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvOne:
                Intent trIntent = new Intent(MainActivity.this, TrActivity.class);
                startActivity(trIntent);
                break;
            case R.id.tvTwo:
                Intent chIntent = new Intent(MainActivity.this, ChenActivity.class);
                startActivity(chIntent);
                break;
            case R.id.tvThree:
                Intent madIntent = new Intent(MainActivity.this, MadActivity.class);
                startActivity(madIntent);
                break;
            case R.id.tvFour:
                Intent fourIntent = new Intent(MainActivity.this, CoimActivity.class);
                startActivity(fourIntent);

        }
    }
}
