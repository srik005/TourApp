package srikanth.tourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import listitem.AnnaActivity;
import listitem.ConnActivity;
import listitem.MarActivity;
import listitem.PulActivity;
import listitem.SanActivity;

public class ChenActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Location> arrLoc = new ArrayList<>();
        arrLoc.add(new Location(getString(R.string.matina), R.drawable.marina));
        arrLoc.add(new Location(getString(R.string.san_chur), R.drawable.stthomas));
        arrLoc.add(new Location(getString(R.string.conn_lib), R.drawable.connimera));
        arrLoc.add(new Location(getString(R.string.anna_zoo), R.drawable.anna_park));
        arrLoc.add(new Location(getString(R.string.puli_lak), R.drawable.puli));

        CustomClassAdapter customClassAdapter = new CustomClassAdapter(this, arrLoc);
        ListView lView = (ListView) findViewById(R.id.listView);
        if (lView != null) {
            lView.setAdapter(customClassAdapter);
            lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position) {
                        case 0:
                            Intent monAct = new Intent(getApplicationContext(), MarActivity.class);
                            startActivity(monAct);
                            break;
                        case 1:
                            Intent mblaAct = new Intent(getApplicationContext(), SanActivity.class);
                            startActivity(mblaAct);
                            break;
                        case 2:
                            Intent siruAct = new Intent(getApplicationContext(), ConnActivity.class);
                            startActivity(siruAct);
                            break;
                        case 3:
                            Intent kovAct = new Intent(getApplicationContext(), AnnaActivity.class);
                            startActivity(kovAct);
                            break;
                        case 4:
                            Intent velAct = new Intent(getApplicationContext(), PulActivity.class);
                            startActivity(velAct);
                            break;
                    }
                }
            });
        }
    }
}
