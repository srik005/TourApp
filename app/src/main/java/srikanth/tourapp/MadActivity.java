package srikanth.tourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import listitem.GanActivity;
import listitem.MeenActivity;
import listitem.SamActivity;
import listitem.TnayActivity;

public class MadActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<LocList> arrLoc = new ArrayList<>();
        arrLoc.add(new LocList(getString(R.string.g_museum), R.drawable.gmuseum));
        arrLoc.add(new LocList(getString(R.string.me_temple), R.drawable.meenak));
        arrLoc.add(new LocList(getString(R.string.th_mahal), R.drawable.thirun));
        arrLoc.add(new LocList(getString(R.string.sa_hills), R.drawable.samanar));

        CustomClass customClass = new CustomClass(this, arrLoc);
        ListView lView = (ListView) findViewById(R.id.listView);
        if (lView != null) {
            lView.setAdapter(customClass);
            lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position) {
                        case 0:
                            Intent monAct = new Intent(getApplicationContext(), GanActivity.class);
                            startActivity(monAct);
                            break;
                        case 1:
                            Intent mblaAct = new Intent(getApplicationContext(), MeenActivity.class);
                            startActivity(mblaAct);
                            break;
                        case 2:
                            Intent siruAct = new Intent(getApplicationContext(), TnayActivity.class);
                            startActivity(siruAct);
                            break;
                        case 3:
                            Intent kovAct = new Intent(getApplicationContext(), SamActivity.class);
                            startActivity(kovAct);
                            break;
                    }
                }
            });
        }
    }
}
