package com.example.loginpage; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.EditText; 
import android.widget.Toast; 
import androidx.activity.EdgeToEdge; 
import androidx.appcompat.app.AppCompatActivity; 
import androidx.core.graphics.Insets; 
import androidx.core.view.ViewCompat; 
import androidx.core.view.WindowInsetsCompat; 
public class MainActivity extends AppCompatActivity { 
EditText e1, e2; 
Button b1; 
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
e1 = findViewById(R.id.editTextText); 
e2 = findViewById(R.id.editTextText2); 
b1 = findViewById(R.id.button2); 
b1.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v) { 
String username = e1.getText().toString(); 
String password = e2.getText().toString(); 
if (username.equals("Admin") && password.equals("1234")) { 
Toast.makeText(MainActivity.this, "Welcome " + username, Toast.LENGTH_SHORT).show(); 
} else { 
Toast.makeText(MainActivity.this, "Invalid username or password",Toast.LENGTH_SHORT).show(); 
} 
} 
}); 
} 
}
