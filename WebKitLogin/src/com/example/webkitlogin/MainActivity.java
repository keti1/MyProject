package com.example.webkitlogin;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		WebView webView = (WebView)findViewById(R.id.webView1);
		WebSettings browserSettings = webView.getSettings();
		browserSettings.setJavaScriptEnabled(true);
		
		webView.setWebViewClient(new WebViewClient());
		webView.setWebChromeClient(new WebChromeClient());
		
		JavascripBridge bridge = new JavascripBridge(this);
		webView.addJavascriptInterface(bridge, "bridge");
		
		webView.loadUrl("file:///android_asset/login.html");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
