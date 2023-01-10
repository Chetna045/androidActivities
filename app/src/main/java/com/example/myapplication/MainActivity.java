package com.example.myapplication;

import static com.example.myapplication.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    ImageView iv;
    Boolean flag;
    int images[]={R.drawable.index,R.drawable.hd,R.drawable.in};
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        Toast.makeText(getApplicationContext(),"Application Created",Toast.LENGTH_SHORT).show();
       /* WebView web2=(WebView)findViewById(R.id.www);
        web2.loadUrl("https://www.google.com");*/
        iv=(ImageView)findViewById(R.id.image);
        b1=(Button)findViewById(R.id.button);
        flag=true;
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view )
            {iv.setImageResource(images[i]);
            i++;
            if(i==3)
                i=0;}
        });



    }
    protected void onStart() {
        super.onStart( );

        Toast.makeText(getApplicationContext(),"Application Started",Toast.LENGTH_SHORT).show();
    }
    protected void onPause() {
        super.onPause();

        Toast.makeText(getApplicationContext(),"Application Paused",Toast.LENGTH_SHORT).show();
    }
    protected void onStop() {
        super.onStop();

        Toast.makeText(getApplicationContext(),"Application Stopped",Toast.LENGTH_SHORT).show();
    }
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(getApplicationContext(),"Application Destroyed",Toast.LENGTH_SHORT).show();
    }
}