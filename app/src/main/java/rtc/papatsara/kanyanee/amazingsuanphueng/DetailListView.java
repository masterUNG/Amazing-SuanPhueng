package rtc.papatsara.kanyanee.amazingsuanphueng;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class DetailListView extends AppCompatActivity {

    //Explicit
    private int anInt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_view);

        anInt = getIntent().getIntExtra("Category", 0);
        Log.d("21novV1", "Catetory  ==> " + anInt);

        try {

            GetRatburyWhereCat getRatburyWhereCat = new GetRatburyWhereCat(DetailListView.this);
            getRatburyWhereCat.execute(Integer.toString(anInt));
            String strJSON = getRatburyWhereCat.get();
            Log.d("21novV2", "JSON (" + anInt + ") ==> " + strJSON);

        } catch (Exception e) {
            Log.d("21novV2", "e onCreate ==> " + e.toString());
        }


    } // Main Method

}   // Main Class
