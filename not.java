package com.example.mantikkapi;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class not extends Activity{
	boolean tus1=false;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.not);
		final Button but1=(Button)findViewById(R.id.but1);
	
		final ImageView giris1=(ImageView) findViewById(R.id.led1);

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
									
				}
				else
				{
					tus1=false;	
					but1.setText("0");
						giris1.setImageDrawable(getResources().getDrawable(R.raw.miniledy));
						ledcikis.setImageDrawable(getResources().getDrawable(R.raw.miniledk));
						txsonuc.setText("1");
								
					}
				
			}
		});


	}
	
	
}


