package com.example.mantikkapi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class giris extends Activity {

		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.giris);
			
			Button and=(Button ) findViewById(R.id.and);
			and.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getApplicationContext(), and.class);
					startActivity(i);
				}
			});

			Button or=(Button ) findViewById(R.id.or);
			or.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getApplicationContext(), or.class);
					startActivity(i);
				}
			});
			Button nand=(Button ) findViewById(R.id.nand);
			nand.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getApplicationContext(), nand.class);
					startActivity(i);
				}
			});
			Button nor=(Button ) findViewById(R.id.nor);
			nor.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getApplicationContext(), nor.class);
					startActivity(i);
				}
			});
			Button exor=(Button ) findViewById(R.id.exor);
			exor.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getApplicationContext(), exor.class);
					startActivity(i);
				}
			});
			Button exnor=(Button ) findViewById(R.id.exnor);
			exnor.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getApplicationContext(), exnor.class);
					startActivity(i);
				}
			});
			Button not=(Button ) findViewById(R.id.not);
			not.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getApplicationContext(), not.class);
					startActivity(i);
				}
			});
			Button flipflop=(Button ) findViewById(R.id.flipflop);
			flipflop.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getApplicationContext(), ffsayfa.class);
					startActivity(i);
				}
			});
			Button yarimtoplayi=(Button ) findViewById(R.id.yarimtoplayici);
			yarimtoplayi.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getApplicationContext(), yarimtopla.class);
					startActivity(i);
				}
			});
			Button yarimcikari=(Button ) findViewById(R.id.yarimcikarici);
			yarimcikari.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getApplicationContext(), yarimcikar.class);
					startActivity(i);
				}
			});
			Button tamtopla=(Button ) findViewById(R.id.tamtoplayici);
			tamtopla.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getApplicationContext(), tamtopla.class);
					startActivity(i);
				}
			});
			Button tamcik=(Button ) findViewById(R.id.tamcikarici);
			tamcik.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent i=new Intent(getApplicationContext(), tamcikar.class);
					startActivity(i);
				}
			});
			}
			
		}

