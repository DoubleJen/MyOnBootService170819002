package tw.adouble.app.helloworld.myonbootservice170819002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NoticeActivity extends AppCompatActivity {
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);
        tv = (TextView)findViewById(R.id.tv);
        tv.setText("" + getIntent().getIntExtra("key", -1));

    }
}
