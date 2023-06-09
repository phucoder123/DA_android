package com.example.da_android;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.btn_nhap);

    }
    InputFragment inputFragment = new InputFragment();
    StatisticalCalendarFragment statisticalCalendarFragment = new StatisticalCalendarFragment();


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.btn_nhap:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_container, inputFragment)
                        .commit();
                return true;
            case R.id.btn_lich:
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.frame_container, statisticalCalendarFragment)
                        .commit();
                return true;
        }
        return false;
    }
//    GridView gridView;
//    ArrayList<HinhAnh> arrayImg;
//    GirdViewAdapter adapter;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.layout_danhmuc);
//        AnhXa();
//        adapter = new GirdViewAdapter(this,R.layout.layout_item_danhmuc,arrayImg);
//        gridView.setAdapter(adapter);
//    }
//
//    private void AnhXa() {
//        gridView = (GridView) findViewById(R.id.id_gridview_danhmuc);
//        arrayImg = new ArrayList<>();
//        arrayImg.add(new HinhAnh("Ăn uống", R.drawable.ic_danhmuc_diningset));
//        arrayImg.add(new HinhAnh("Quần Áo", R.drawable.ic_danhmuc_gift));
//        arrayImg.add(new HinhAnh("Mỹ phẩm ", R.drawable.ic_danhmuc_bandage));
//        arrayImg.add(new HinhAnh("Phí giao lưu ", R.drawable.ic_danhmuc_beer));
//        arrayImg.add(new HinhAnh("Y tế ", R.drawable.ic_danhmuc_ball));
//        arrayImg.add(new HinhAnh("Giáo dục ", R.drawable.ic_danhmuc_book));
//        arrayImg.add(new HinhAnh("Tiền điện ", R.drawable.ic_danhmuc_diamond));
//        arrayImg.add(new HinhAnh("Đi lại ", R.drawable.ic_danhmuc_bus));
//        arrayImg.add(new HinhAnh("Phí liên lạc ", R.drawable.ic_danhmuc_phone));
//        arrayImg.add(new HinhAnh("Tiền nhà ", R.drawable.ic_danhmuc_home));
//
//
//    }
//
//    class Adapter extends BaseAdapter {
//
//        @Override
//        public int getCount() {
//            return 0;
//        }
//
//        @Override
//        public Object getItem(int i) {
//            return null;
//        }
//
//        @Override
//        public long getItemId(int i) {
//            return 0;
//        }
//
//        @Override
//        public View getView(int i, View view, ViewGroup viewGroup) {
//            return null;
//        }
//    }
}