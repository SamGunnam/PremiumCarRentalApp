package edu.udayton.premiumcarrentalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class PictureActivity extends Activity {
    public static final String ID_KEY = "RES_ID", LBL_KEY = "LABEL";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture);


        Intent myIntent = getIntent();
        Bundle myExtras = myIntent.getExtras();

        if (myExtras != null) {

            String res_label = myExtras.getString(LBL_KEY);


            TextView titleTextView = (TextView) findViewById(R.id.titleTextView);
            titleTextView.setText(res_label);


            String image_id = myExtras.getString(ID_KEY);

            int imageId = Integer.parseInt(image_id);

            ImageView pictureImageView = (ImageView) findViewById(R.id.pictureimageView);
            pictureImageView.setImageResource(imageId);
            pictureImageView.setContentDescription(res_label);
        }
    }
}
