package com.example.mantikkapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ffsayfa extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ffanasayfa);
		
		Button jk=(Button) findViewById(R.id.jkflip);
		Button sr=(Button) findViewById(R.id.srflip);
		Button d=(Button) findViewById(R.id.dflip);
		Button t=(Button) findViewById(R.id.tflip);
		
		
		jk.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(), jkff.class);
				startActivity(i);
			}
		});
sr.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i=new Intent(getApplicationContext(), srff.class);
				startActivity(i);
			}
		});
d.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i=new Intent(getApplicationContext(), dff.class);
		startActivity(i);
	}
});
t.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent i=new Intent(getApplicationContext(), tff.class);
		startActivity(i);
	}
});
		
	}
}
