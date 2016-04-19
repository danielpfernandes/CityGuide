package net.androidbootcamp.cityguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.ListActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.view.View;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] attraction = {
                "Art Institute of Chicago",
                "Magnificent Mile",
                "Willis Tower",
                "Navy Pier",
                "Water Tower"
        };
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.txtTravel, attraction));
    }
    protected void onListItemClick(ListView l, View v, int position, long id){
        switch (position){
            case 0:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://artic.edu")));
                break;
            case 1:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://themagnificentmile.com")));
                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
        }
    }
}
