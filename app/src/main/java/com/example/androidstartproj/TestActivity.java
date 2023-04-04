package com.example.androidstartproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import android.view.View;
import androidx.fragment.app.FragmentTransaction;

public class TestActivity extends AppCompatActivity {
    private Button btn_fragment1, btn_fragment2;
    private FirstFragment firstFragment = new FirstFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        btn_fragment1 = findViewById(R.id.btn_fragment1);
        btn_fragment2 = findViewById(R.id.btn_fragment2);
        setNewFragment(firstFragment);

        btn_fragment1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setNewFragment(firstFragment);
            }
        });
        btn_fragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragment secondFragment = new SecondFragment();
                setNewFragment(secondFragment);
            }
        });

    }
    private void setNewFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.frameLayout, fragment);
        ft.commit();
}
}