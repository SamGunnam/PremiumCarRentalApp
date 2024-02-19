package edu.udayton.premiumcarrentalapp;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        List<String> CarTypes = Arrays.asList(getResources().getStringArray(R.array.CarTypes));
        // Got GUI
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.carModels, CarTypes));
    }
    protected void onListItemClick(ListView l, View v, int position,long id){
        Intent itemIntent;
        switch (position) {

            case 0:       //BMW image display
                itemIntent = new Intent(MainActivity.this, PictureActivity.class);
                //Add label text and image resource id to the item intent as string extras

                itemIntent.putExtra(PictureActivity.LBL_KEY, getResources().getString(R.string.txtBMW));
                itemIntent.putExtra(PictureActivity.ID_KEY, Integer.toString(R.drawable.bms5series));
                break;
            case 1:       //Website with BMW  car  - website
                itemIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://turo.com/us/en/car-rental/united-states/cincinnati-oh/bmw/5-series/2083438/"));
                break;
            case 2:       //Corvette image display
                itemIntent = new Intent(MainActivity.this, PictureActivity.class);
                //Add label text and image resource id to the item intent as string extras

                itemIntent.putExtra(PictureActivity.LBL_KEY, getResources().getString(R.string.txtCorvette));
                itemIntent.putExtra(PictureActivity.ID_KEY, Integer.toString(R.drawable.corvette));
                break;
            case 3:       //Website with corvette car  - website
                itemIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://turo.com/us/en/car-rental/united-states/daly-city-ca/chevrolet/corvette/1155573/"));
                break;
            case 4:       //Lamborghini Image display
                itemIntent = new Intent(MainActivity.this, PictureActivity.class);
                //Add label text and image resource id to the item intent as string extras

                itemIntent.putExtra(PictureActivity.LBL_KEY, getResources().getString(R.string.txtTesla));
                itemIntent.putExtra(PictureActivity.ID_KEY, Integer.toString(R.drawable.lamborginiurus));

                break;
            case 5:       //For Lamborghini Car rental - website
                itemIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://turo.com/us/en/suv-rental/united-states/hamilton-oh/lamborghini/urus/2074575/"));
                break;
            default:
                Toast myToast = Toast.makeText(MainActivity.this, "Invalid choice is made", Toast.LENGTH_LONG);
                myToast.show();
                itemIntent = null;
                break;
        }// end switch

        if (itemIntent != null) {
            startActivity(itemIntent);
        }

    }
}