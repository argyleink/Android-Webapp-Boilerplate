package com.ratio.android.rolodexwebview;

import android.app.Activity;
import android.webkit.*;
import android.os.Bundle;

public class RatioRolodex extends Activity {
    
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        WebView engine = (WebView) findViewById(R.id.web_engine);  
        engine.loadUrl("http://rolodex.herokuapp.com/");
        engine.getSettings().setJavaScriptEnabled(true);
    }
	
}