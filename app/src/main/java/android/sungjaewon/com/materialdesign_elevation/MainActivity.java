package android.sungjaewon.com.materialdesign_elevation;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
// API level 21이상에서 material design 설정
1. res/values/style.xml의 Theme을 android:Theme.Material로 변경
2. AndroidManifest.xml의 application의 theme속성을 변경된 Theme로 지정 (Default로 되어있음)
3. Activity의 상속 클래스를 AppCompatActivity에서 Activity로 변경

// API level 21미만에서 material desing 설정
1. 상속받는 Activity를 원래대로 AppCompatActivity로 변경
2. style의 AppTheme를 Theme.AppCompat으로 변경
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
