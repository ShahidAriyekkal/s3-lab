package com.example.sharedpreferenceco21st; 
import android.content.Intent; 
import android.content.SharedPreferences; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
import androidx.activity.EdgeToEdge; 
import androidx.appcompat.app.AppCompatActivity; 
import androidx.core.graphics.Insets; 
import androidx.core.view.ViewCompat; 
import androidx.core.view.WindowInsetsCompat; 
public class MainActivity extends AppCompatActivity { 
EditText etName, etEmail, etPassword; 
Button btnSubmit; 
@Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
EdgeToEdge.enable(this); 
setContentView(R.layout.activity_main); 
ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> { 
Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars()); 
v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom); 
return insets; 
}); 
etName = findViewById(R.id.etName); 
etEmail = findViewById(R.id.etEmail); 
etPassword = findViewById(R.id.etPassword); 
btnSubmit = findViewById(R.id.btnSubmit); 
btnSubmit.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View view) { 
String name = etName.getText().toString(); 
String email = etEmail.getText().toString(); 
String password = etPassword.getText().toString(); 
SharedPreferences sp = getSharedPreferences("UserDetails", MODE_PRIVATE); 
SharedPreferences.Editor editor = sp.edit(); 
editor.putString("Name", name); 
editor.putString("Email", email); 
editor.putString("Password", password); 
editor.apply(); 
Intent intent = new Intent(MainActivity.this, DisplayActivity.class); 
intent.putExtra("Name", name); 
intent.putExtra("Email", email); 
startActivity(intent); 
} 
}); 
} 
} 


DISPLAY CODE 


package com.example.sharedpreferenceco21st; 
import android.content.SharedPreferences; 
import android.os.Bundle; 
import android.widget.TextView; 
import androidx.appcompat.app.AppCompatActivity; 
import androidx.core.graphics.Insets; 
import androidx.core.view.ViewCompat; 
import androidx.core.view.WindowInsetsCompat; 
public class DisplayActivity extends AppCompatActivity { 
@Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
setContentView(R.layout.activity_display); 
ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.display), (v, insets) -> { 
Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars()); 
v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom); 
return insets; 
}); 
SharedPreferences sharedPref = getSharedPreferences("UserDetails", MODE_PRIVATE); 
String name = sharedPref.getString("Name", "DefaultName"); 
String email = sharedPref.getString("Email", "DefaultEmail"); 
String password = sharedPref.getString("Password", "DefaultPassword"); 
TextView tv = findViewById(R.id.tvDisplay); 
TextView tv1 = findViewById(R.id.tvDisplay2); 
TextView tv2 = findViewById(R.id.tvDisplay3); 
tv.setText("Name: " + name); 
tv1.setText("Email: " + email); 
tv2.setText("Password: " + password);
}
}
