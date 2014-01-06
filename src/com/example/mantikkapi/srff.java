package com.example.mantikkapi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class srff extends Activity{
	int s=0,r=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.srff);
		

		final ImageView giris1=(ImageView) findViewById(R.id.led1);
		final ImageView giris2=(ImageView) findViewById(R.id.led2);
		final ImageView clock=(ImageView) findViewById(R.id.led3);
		final ImageView ledcikis=(ImageView) findViewById(R.id.ledcikis);
		final TextView txsonuc=(TextView) findViewById(R.id.textcik);
		final TextView txnotsonuc=(TextView) findViewById(R.id.textnot);
		
		final Button giriss=(Button) findViewById(R.id.but1);
		final Button clk=(Button) findViewById(R.id.but3);
		
		final Button girisr=(Button) findViewById(R.id.but2);
		
		giriss.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (s==0)
				{
					giris1.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
					
					giriss.setText("1");
					s=1;
				}
				else
				{
					giris1.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
					
					giriss.setText("0");
					s=0;
				}	
			}
		});
girisr.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (r==0)
				{
					giris2.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
					
					girisr.setText("1");
					r=1;
				}
				else
				{
					giris2.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
					
					girisr.setText("0");
					r=0;
				}	
			}
		});
clk.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	
		if (clk.getText().equals("0"))
		{
			clk.setText("1");
			clock.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
			if ((s==1)&&(r==1))
			{
				txsonuc.setText("B");
				txnotsonuc.setText("B'");
				
			}
			else if ((s==0)&&(r==1))
			{
				txsonuc.setText("0");
				txnotsonuc.setText("1");
				ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
				
			}
			else if ((s==1)&&(r==0))
			{
				txsonuc.setText("1");
				txnotsonuc.setText("0");
				ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
				
			}
			
			
		}
		else
		{
			clk.setText("0");	
			clock.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
			
			
			
			
		}
	}
});
		
		
	}
}
