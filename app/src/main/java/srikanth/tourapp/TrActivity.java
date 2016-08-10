package srikanth.tourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class TrActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayList<LocList> arrLoc = new ArrayList<>();
        arrLoc.add(new LocList(getString(R.string.txt_sr), R.drawable.srr));
        arrLoc.add(new LocList(getString(R.string.txt_pul), R.drawable.puli));
        arrLoc.add(new LocList(getString(R.string.txt_nit), R.drawable.kalanai));
        arrLoc.add(new LocList(getString(R.string.txt_muk), R.drawable.mkombu));
        arrLoc.add(new LocList(getString(R.string.txt_rock), R.drawable.rock));

        CustomClass customClass = new CustomClass(this, arrLoc);
        ListView lView = (ListView) findViewById(R.id.listView);
        if (lView != null) {
            lView.setAdapter(customClass);
            lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    switch (position) {
                        case 0:
                            Intent monAct = new Intent(getApplicationContext(), SrActivity.class);
                            startActivity(monAct);
                            break;
                        case 1:
                            Intent mblaAct = new Intent(getApplicationContext(), PulianActivity.class);
                            startActivity(mblaAct);
                            break;
                        case 2:
                            Intent siruAct = new Intent(getApplicationContext(), KalActivity.class);
                            startActivity(siruAct);
                            break;
                        case 3:
                            Intent kovAct = new Intent(getApplicationContext(), MukActivity.class);
                            startActivity(kovAct);
                            break;
                        case 4:
                            Intent velAct = new Intent(getApplicationContext(), RockActivity.class);
                            startActivity(velAct);
                            break;
                    }
                }
            });
        }
    }
}
