package  com.example.crystal_ball;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;

public class MainActivity extends Activity implements OnClickListener {
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);

Button button=(Button)findViewById(R.id.button1);
button.setOnClickListener(this);
}


public void animatedCristal()
{
	ImageView  animatedimage=(ImageView)findViewById(R.id.imageView1);
	
	animatedimage.setImageResource(R.drawable.ball_animation);
	
	AnimationDrawable ball= (AnimationDrawable)  animatedimage.getDrawable();
	if(ball.isRunning())
	{
		
		ball.stop();
	}

ball.start();
}



public  void onClick(View v)
{
	
	int id=v.getId();
	if(id==R.id.button1)
	{
		animatedCristal();
		
	}
	
	
}

}

