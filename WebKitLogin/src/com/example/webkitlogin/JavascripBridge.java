package com.example.webkitlogin;

import android.content.Context;
import android.widget.Toast;

public class JavascripBridge {
	
	Context context;
	 public JavascripBridge(Context context){
		 this.context = context;
	 }
	 public boolean login(String username, String password){
		 if(username.equals(password)){
			 Toast.makeText(context, "로그인성공", Toast.LENGTH_LONG).show();
			 return true;
		 }
		 else{
			 Toast.makeText(context, "로그인실패", Toast.LENGTH_LONG).show();
			 return false;
		 }
	 }

}
