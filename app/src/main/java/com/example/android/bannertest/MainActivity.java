package com.example.android.bannertest;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.bumptech.glide.Glide;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;
import com.youth.banner.indicator.CircleIndicator;
import com.youth.banner.listener.OnBannerListener;

public class MainActivity extends AppCompatActivity {
    private Banner mBanner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initView() {
        findViewById(R.id.button).setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
        mBanner = findViewById(R.id.mBanner);
    }

    private void initData() {
        mBanner.setAdapter(new BannerImageAdapter<DateBean>(DateBean.getTestData()) {
            @Override
            public void onBindView(BannerImageHolder holder, DateBean data, int position, int size) {
                Glide.with(holder.imageView)
                        .load(data.imageUrl)
                        .thumbnail(Glide.with(holder.itemView).load(R.drawable.loading))    //加载成功前显示loading图标
                        .into(holder.imageView);
            }
        }).addBannerLifecycleObserver(this)                         //添加生命周期观察者
                .setIntercept(false)                                //是否拦截事件
                .setBannerRound(10f)                                //圆角
                .setIndicator(new CircleIndicator(this))     //圆形指示器
                .setOnBannerListener(new OnBannerListener() {
                    @Override
                    public void OnBannerClick(Object data, int position) {
                        Toast.makeText(MainActivity.this, "Position" + position + "", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}