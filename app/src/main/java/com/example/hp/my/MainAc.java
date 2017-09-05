package com.example.hp.my;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainAc extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        Button button3=(Button)findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent intent = new Intent("com.example.my.ACTION_START");
                intent.addCategory("com.example.my.MY_CATEGORY");
                startActivity(intent);
            }
        });
        Button button1 = (Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // 弹出功能 Toast.makeText(MainAc.this, "你点了按钮1", Toast.LENGTH_SHORT).show();
               //销毁活动 finish();
                //显式Intent intent = new Intent(MainAc.this,SecondActivity.class);
               //隐式 Intent intent = new Intent("com.example.my.ACTION_START");
                //intent.addCategory("com.example.my.MY_CATEGORY");
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.add_a:
                Toast.makeText(this, "你选择了添加", Toast.LENGTH_SHORT).show();
                break;
            case R.id.add_b:
                Toast.makeText(this,"你选了移除",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}
