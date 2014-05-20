package caemandroid.activities;

import com.example.caemandroid.R;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity {

	private String array_spinner[];
	private Button login, register;
	private EditText userName , pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        array_spinner=new String[2];
        array_spinner[0]="Standard User";
        array_spinner[1]="Place/Event Owner";

        Spinner s = (Spinner) findViewById(R.id.mUsertypeSpinner);
        ArrayAdapter adapter = new ArrayAdapter(this,
        android.R.layout.simple_spinner_item, array_spinner);
        s.setAdapter(adapter);
        
        userName = (EditText) findViewById(R.id.mUsernameEdit);
        pass = (EditText) findViewById(R.id.mPasswordEdit);
        
        
        login = (Button) findViewById(R.id.mLoginButton);
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               toLoginActivity();
            }
        });
        register = (Button) findViewById(R.id.mRegisterButton);
        register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               toRegisterActivity();
            }
        });
    }


    protected void toRegisterActivity() {
    	Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
		
	}


    private boolean validationCheck (){
    	if(userName.getText() == null || userName.getText().toString().equals("") || pass.getText() ==null
    			|| pass.getText().toString().equals("")  ){
    		return false;
    	}
    	return true;
    	
    }
	protected void toLoginActivity() {
		if(!validationCheck()){
			Toast.makeText(this, "Please fill all fields.",Toast.LENGTH_SHORT ).show();
		}
		else{
			
		}
		
	}



	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
