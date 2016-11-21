package rtc.papatsara.kanyanee.amazingsuanphueng;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit
    private ImageView cat1ImageView, cat2ImageView, cat3ImageView, cat4ImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        cat1ImageView = (ImageView) findViewById(R.id.imageView);
        cat2ImageView = (ImageView) findViewById(R.id.imageView2);
        cat3ImageView = (ImageView) findViewById(R.id.imageView3);
        cat4ImageView = (ImageView) findViewById(R.id.imageView4);

        //Image Controller
        cat1ImageView.setOnClickListener(this);
        cat2ImageView.setOnClickListener(this);
        cat3ImageView.setOnClickListener(this);
        cat4ImageView.setOnClickListener(this);

    }   // Main Method

    @Override
    public void onClick(View view) {

        int i = 0;

        switch (view.getId()) {

            case R.id.imageView:
                i = 0;
                break;
            case R.id.imageView2:
                i = 1;
                break;
            case R.id.imageView3:
                i = 2;
                break;
            case R.id.imageView4:
                i = 3;
                break;
        }   // switch

        Intent intent = new Intent(MainActivity.this, DetailListView.class);
        intent.putExtra("Category", i);
        startActivity(intent);

    }   // onClick

}   // Main Class
