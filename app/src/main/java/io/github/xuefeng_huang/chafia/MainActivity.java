package io.github.xuefeng_huang.chafia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void kopiKosongClick(View v) {
        Intent intent = new Intent(this, KopiKosong.class);
        startActivity(intent);
    }

    public void kopiOClick(View view) {
        Intent intent = new Intent(this, Kopi_O.class);
        startActivity(intent);
    }

    public void kopiOSiewDaiClick(View view) {
        Intent intent = new Intent(this, kopiOSiewDai.class);
        startActivity(intent);
    }

    public void kopiClick(View view) {
        Intent intent = new Intent(this, Kopi.class);
        startActivity(intent);
    }

    public void kopiGahDaiClick(View view) {
        Intent intent = new Intent(this, KopiGahDai.class);
        startActivity(intent);
    }

    public void learnMoreClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://en.wikipedia.org/wiki/Kopi_tiam"));
        startActivity(intent);
    }
}
