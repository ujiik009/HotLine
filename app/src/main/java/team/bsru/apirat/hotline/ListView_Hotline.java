package team.bsru.apirat.hotline;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ListView_Hotline extends AppCompatActivity {
    private int[] imgcall = new int[]{
            R.drawable.call_01,
            R.drawable.call_02,
            R.drawable.call_03,
            R.drawable.call_04,
            R.drawable.call_05,
            R.drawable.call_06,
            R.drawable.call_07,
            R.drawable.call_08,
            R.drawable.call_09,
            R.drawable.call_10,
            R.drawable.call_11,
            R.drawable.call_12,
            R.drawable.call_13,
            R.drawable.call_14,
            R.drawable.call_15,
            R.drawable.call_16
    };
    private String[] callStrings = new String[]{
            "1155",
            "1677",
            "1192",
            "191",
            "1669",
            "022821815",
            "199",
            "1129",
            "1584",
            "1195",
            "1125",
            "1188",
            "1556",
            "1808",
            "1193",
            "1860",

    };
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view__hotline);
        listView = (ListView) findViewById(R.id.HotLine);
        hot_line_adapter hot_line_adapter = new hot_line_adapter(ListView_Hotline.this, callStrings, imgcall);
        listView.setAdapter(hot_line_adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:" + callStrings[i]));

                if (ActivityCompat.checkSelfPermission(ListView_Hotline.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(intent);
            }
        });


    }
}
