package demo.com.xiongyantest01.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.TextView;

import demo.com.xiongyantest01.R;

/**
 * Created by xiongyan on 2017/7/27.
 * 利用Theme自定义Activity间的切换动画
 * blog http://blog.csdn.NET/lmj623565791/article/details/22990643
 */

public class AnimationActivity extends Activity {
    TextView demo,demo1,demo2,demo3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_activity);
        demo = (TextView) findViewById(R.id.demo);
        demo1 = (TextView) findViewById(R.id.demo1);
        demo2 = (TextView) findViewById(R.id.demo2);
        demo3 = (TextView) findViewById(R.id.demo3);
        demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendIntent();
            }
        });
        setText();
    }


    private void sendIntent() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();

    }

    private void setText() {
        SpannableStringBuilder spanBuilder = new SpannableStringBuilder(getResources().getString(R.string.vip_un_login_esc));
        spanBuilder.setSpan(new TextAppearanceSpan(null, 0, 30, null, null), 4, spanBuilder.length () , Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        demo.setText(spanBuilder);

        SpannableStringBuilder spanBuilder1 = new SpannableStringBuilder(getResources().getString(R.string.vip_not));
        spanBuilder1.setSpan(new TextAppearanceSpan(null, 0, 30, null, null), 4, spanBuilder1.length() , Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        demo1.setText(spanBuilder1);


        SpannableStringBuilder spanBuilder2 = new SpannableStringBuilder(getResources().getString(R.string.vip_is_esc));
        spanBuilder2.setSpan(new TextAppearanceSpan(null, 0, 30, null, null), 4, spanBuilder2.length() , Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        demo2.setText(spanBuilder2);

        SpannableStringBuilder spanBuilder3 = new SpannableStringBuilder(getResources().getString(R.string.vip_is_expire));
        spanBuilder3.setSpan(new TextAppearanceSpan(null, 0, 30, null, null), 4, spanBuilder3.length() , Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        demo3.setText(spanBuilder3);

    }
}
