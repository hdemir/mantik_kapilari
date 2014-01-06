package com.example.mantikkapi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class tamcikar extends Activity{
	boolean tus1=false,tus2=false, tus3=false,tus4=false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tamcik);
		
		final ImageView giris1=(ImageView) findViewById(R.id.led1);
		final ImageView giris2=(ImageView) findViewById(R.id.led2);
		final ImageView giris3=(ImageView) findViewById(R.id.led3);
		final ImageView clock=(ImageView) findViewById(R.id.led4);
		
		final ImageView ledcikis=(ImageView) findViewById(R.id.ledcikis);
		final TextView txsonuc=(TextView) findViewById(R.id.textcik);
		final TextView txnotsonuc=(TextView) findViewById(R.id.textnot);
		final ImageView carycikis=(ImageView) findViewById(R.id.carycikis);
		
		final Button but1=(Button) findViewById(R.id.but1);
		final Button but2=(Button) findViewById(R.id.but2);
		final Button but3=(Button) findViewById(R.id.but3);
		final Button butclock=(Button) findViewById(R.id.clock);
		
but1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				
				
				
				if (tus1==false)
				{
				tus1=true;	
				but1.setText("1");
					giris1.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
				}
				else
				{
					tus1=false;	
					but1.setText("0");
						giris1.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
					
				}
				
			}
		});
but2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (tus2==false)
				{
				tus2=true;	
				but2.setText("1");
					giris2.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
									}
				else
				{
					tus2=false;	
					but2.setText("0");
						giris2.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
					
				
				}
			}
		});
but3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if (tus3==false)
		{
		tus3=true;	
		but3.setText("1");
			giris3.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
							}
		else
		{
			tus3=false;	
			but3.setText("0");
				giris3.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
			
		
		}
	}
});
butclock.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
		
		
		if (tus4==false)
		{
		tus4=true;	
		butclock.setText("1");
			clock.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
							
		
		
		
		
		
		
		
		
	if ((tus1==false)&&(tus2==false)&&(tus3==false))
	{
		ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
		txsonuc.setText("0");	
		txnotsonuc.setText("0");
		carycikis.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
		
	}
	else if ((tus1==false)&&(tus2==false)&&(tus3==true))
	{
		ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
		txsonuc.setText("1");
		txnotsonuc.setText("1");
		carycikis.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
		
	}
	else if ((tus1==false)&&(tus2==true)&&(tus3==false))
	{
		ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
		txsonuc.setText("1");
		txnotsonuc.setText("1");
		carycikis.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
		
	}
	else if ((tus1==false)&&(tus2==true)&&(tus3==true))
	{
		ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
		txsonuc.setText("0");	
		txnotsonuc.setText("1");
		carycikis.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
		
	}
	else if ((tus1==true)&&(tus2==false)&&(tus3==false))
	{
		ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
		txsonuc.setText("1");
		txnotsonuc.setText("0");
		carycikis.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
		
	}
	else if ((tus1==true)&&(tus2==false)&&(tus3==true))
	{
		ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
		txsonuc.setText("0");	
		txnotsonuc.setText("0");
		carycikis.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
		
	}
	else if ((tus1==true)&&(tus2==true)&&(tus3==false))
	{
		ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
		txsonuc.setText("0");	
		txnotsonuc.setText("0");
		carycikis.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
		
	}
	else if ((tus1==true)&&(tus2==true)&&(tus3==true))
	{
		ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
		txsonuc.setText("1");
		txnotsonuc.setText("1");
		carycikis.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
		
	}
	
		}
		else
		{
			tus4=false;	
			butclock.setText("0");
				clock.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
			
		
		}	
	}
});
		

	}
	
	
}
