package beep.mostafa.silent;

import android.media.AudioManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends Activity {

	ImageButton silent;
	ImageButton nosilent;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		silent = (ImageButton) findViewById(R.id.imageButton1);
		nosilent = (ImageButton) findViewById(R.id.imageButton2);


	}
		public void img1Func(View v){
			Toast.makeText(this, "silent mode", Toast.LENGTH_LONG).show();
		    AudioManager audiomanage = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
		    audiomanage.setRingerMode(AudioManager.RINGER_MODE_SILENT);
		}
		public void img2Func(View v){
			Toast.makeText(this, "normal mode", Toast.LENGTH_LONG).show();
		    AudioManager audiomanage = (AudioManager)getSystemService(Context.AUDIO_SERVICE);
		    audiomanage.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
		}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
