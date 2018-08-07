package sg.edu.rp.c346.p12practicalquiz;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvOne;
    Spinner spnChoose;
    WebView wvMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOne = findViewById(R.id.textViewOne);
        spnChoose = findViewById(R.id.spinnerChoose);
        wvMedia = findViewById(R.id.webViewMedia);

        wvMedia.setWebViewClient(new WebViewClient());

        spnChoose.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int pos = spnChoose.getSelectedItemPosition();

                if (pos == 0) {
                    String url = "https://www.google.com";
                    wvMedia.loadUrl(url);
                }
                else if (pos == 1) {
                    String url = "https://www.rp.edu.sg";
                    wvMedia.loadUrl(url);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
