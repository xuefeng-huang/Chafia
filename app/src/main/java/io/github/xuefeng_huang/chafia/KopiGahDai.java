package io.github.xuefeng_huang.chafia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KopiGahDai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kopi_gah_dai);
    }

    public void backToMain(View v) {
        finish();
    }
}
