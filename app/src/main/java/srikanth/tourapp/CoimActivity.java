package srikanth.tourapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import listitem.BlaActivity;
import listitem.KovActivity;
import listitem.MonActivity;
import listitem.SiruActivity;
import listitem.VelActivity;


public class CoimActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<Location> arrLoc = new ArrayList<>();
        arrLoc.add(new Location(getString(R.string.mk_falls), R.drawable.monkfal));
        arrLoc.add(new Location(getString(R.string.bla_thu), R.drawable.bthunder));
        arrLoc.add(new Location(getString(R.string.sir_fall), R.drawable.siruvani));
        arrLoc.add(new Location(getString(R.string.ko_fal), R.drawable.kovaikut));
        arrLoc.add(new Location(getString(R.string.vel_hills), R.drawable.vellingiri));

        CustomClassAdapter customClassAdapter = new CustomClassAdapter(this, arrLoc);
        ListView lView = (ListView) findViewById(R.id.listView);
        if (lView != null) {
            lView.setAdapter(customClassAdapter);
            lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position) {
                        case 0:
                            Intent monAct = new Intent(getApplicationContext(), MonActivity.class);
                            startActivity(monAct);
                            break;
                        case 1:
                            Intent mblaAct = new Intent(getApplicationContext(), BlaActivity.class);
                            startActivity(mblaAct);
                            break;
                        case 2:
                            Intent siruAct = new Intent(getApplicationContext(), SiruActivity.class);
                            startActivity(siruAct);
                            break;
                        case 3:
                            Intent kovAct = new Intent(getApplicationContext(), KovActivity.class);
                            startActivity(kovAct);
                            break;
                        case 4:
                            Intent velAct = new Intent(getApplicationContext(), VelActivity.class);
                            startActivity(velAct);
                            break;
                    }
                }
            });
        }
    }
}
