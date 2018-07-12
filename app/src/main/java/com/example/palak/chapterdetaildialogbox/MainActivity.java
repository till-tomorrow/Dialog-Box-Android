package com.example.palak.chapterdetaildialogbox;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

//import com.squareup.picasso.Picasso;
import com.yinglan.shadowimageview.ShadowImageView;

//import butterknife.BindView;
//import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    /*@BindView(R.id.thumbnailIV)
    ImageView thumnailIV;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        //ButterKnife.bind(this);

        /*Picasso.with(this)
                .load("")
                .into(thumnailIV);*/
        Dialog dialog = new Dialog(this, R.style.AppCompatAlertDialogStyle);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog);
        dialog.show();
    }
}
