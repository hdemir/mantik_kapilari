package com.example.mantikkapi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class tff extends Activity{
	int a=0,degis=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tff);

		final ImageView giris1=(ImageView) findViewById(R.id.led1);
		final ImageView giris2=(ImageView) findViewById(R.id.led2);
		final ImageView ledcikis=(ImageView) findViewById(R.id.ledcikis);
		final TextView txsonuc=(TextView) findViewById(R.id.textcik);
		final TextView txnotsonuc=(TextView) findViewById(R.id.textnot);
		
		final Button giris=(Button) findViewById(R.id.but1);
		final Button clk=(Button) findViewById(R.id.but2);
		
		giris.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (a==0)
				{
					giris1.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
					
					giris.setText("1");
					a=1;
				}
				else
				{
					giris1.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
					
					giris.setText("0");
					a=0;
				}
			}
		});
		
		clk.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
			if (degis==0)
			{
				giris2.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
				
				clk.setText("1");
				degis=1;
				if (a==1)
				{
					
					txsonuc.setText("1");
					txnotsonuc.setText("0");
				ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
					
					
				}
			}
			else
			{
				giris2.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
				
				clk.setText("0");
				degis=0;
				if (a==1)
				{
					txsonuc.setText("0");
					txnotsonuc.setText("1");
					ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
					
					
				}
			}
			}
		});
		
		
	}
}
