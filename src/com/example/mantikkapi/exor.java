package com.example.mantikkapi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class exor extends Activity{
	boolean tus1=false,tus2=false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exor);
		final Button but1=(Button)findViewById(R.id.but1);
		final Button but2=(Button)findViewById(R.id.but2);
		final ImageView giris1=(ImageView) findViewById(R.id.led1);
		final ImageView giris2=(ImageView) findViewById(R.id.led2);
		final ImageView ledcikis=(ImageView) findViewById(R.id.ledcikis);
		final TextView txsonuc=(TextView) findViewById(R.id.textcik);
		
		but1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (tus1==false)
				{
				tus1=true;	
				but1.setText("1");
					giris1.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
					ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
					txsonuc.setText("0");
					if (tus2==false)
					{
						ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
						txsonuc.setText("1");
					}				
				}
				else
				{
					tus1=false;
					but1.setText("0");
					giris1.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
					ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
					txsonuc.setText("0");
					if (tus2==true)
					{
						ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
						txsonuc.setText("1");
					}
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
					ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
					txsonuc.setText("0");
					if (tus1==false)
					{
						ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
						txsonuc.setText("1");
					}		
				}
				else
				{
					tus2=false;
					but2.setText("0");
					giris2.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
					ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
					txsonuc.setText("0");
				
					if (tus1==true)
					{
						ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
						txsonuc.setText("1");
					}		
				}
			}
		});
		

	}
	
	
}

