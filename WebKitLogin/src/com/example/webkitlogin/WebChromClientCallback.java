package com.example.webkitlogin;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class WebChromClientCallback extends WebChromeClient {

	@Override
	public boolean onJsAlert(WebView view, String url, String message,final JsResult result) {
		// TODO Auto-generated method stub
	
		
		
	AlertDialog.Builder builder=new AlertDialog.Builder(view.getContext()).setTitle("¾Ë¸²").setMessage(message)
			.setPositiveButton(android.R.string.ok, new OnClickListener() {
				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					// TODO Auto-generated method stub
					result.confirm();
				}
			});
		
		//.setCancelable(true).create().show();
		AlertDialog alertDialog = builder.create();
		alertDialog.show();
		
		return true;
	}

	@Override
	public boolean onJsConfirm(WebView view, String url, String message,
			JsResult result) {
		// TODO Auto-generated method stub
		return super.onJsConfirm(view, url, message, result);
	}

	
	
}
