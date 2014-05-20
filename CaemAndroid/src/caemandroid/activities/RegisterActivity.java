package caemandroid.activities;

import com.example.caemandroid.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class RegisterActivity extends Activity {

	private String array_spinner[];
	private Button cancel, register;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		 Spinner s = (Spinner) findViewById(R.id.rUsertypeSpinner);
	        ArrayAdapter adapter = new ArrayAdapter(this,
	        android.R.layout.simple_spinner_item, array_spinner);
	        s.setAdapter(adapter);
	        
	        cancel = (Button) findViewById(R.id.rCancelButton);
	        cancel.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	            	//super.onBackPressed();
	            }
	        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register, menu);
		return true;
	}

}
