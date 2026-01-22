package com.example.validation; 
import android.os.Bundle; 
import android.util.Patterns; 
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
EditText username, password, email, phone; 
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
username = findViewById(R.id.editTextText); 
email = findViewById(R.id.editTextTextEmailAddress); 
phone = findViewById(R.id.editTextPhone); 
password = findViewById(R.id.editTextTextPassword); 
b1 = findViewById(R.id.button); 
b1.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v) { 
                if (validation()) { 
Toast.makeText(MainActivity.this, "Sign Up Successfully", Toast.LENGTH_SHORT).show(); 
                } 
            } 
        }); 
    } 
 
    private boolean validation() { 
        boolean isValid = true; 
 
        String userVar = username.getText().toString().trim(); 
        String emailVar = email.getText().toString().trim(); 
        String passwordVar = password.getText().toString(); 
        String phoneVar = phone.getText().toString().trim(); 
 
        if (userVar.isEmpty()) { 
            username.setError("Username cannot be empty"); 
            isValid = false; 
        } 
 
        if (emailVar.isEmpty()) { 
            email.setError("Email cannot be empty"); 
            isValid = false; 
        } else if (!Patterns.EMAIL_ADDRESS.matcher(emailVar).matches()) { 
            email.setError("Invalid email format"); 
            isValid = false; 
        } 
 
        if (phoneVar.isEmpty()) { 
            phone.setError("Phone number cannot be empty"); 
            isValid = false; 
        } else if (!Patterns.PHONE.matcher(phoneVar).matches() || phoneVar.length() < 10) { 
            phone.setError("Invalid phone number"); 
            isValid = false; 
        } 
 
        if (passwordVar.isEmpty()) { 
            password.setError("Password cannot be empty"); 
            isValid = false; 
        } else if (passwordVar.length() < 6) { 
            password.setError("Password must be at least 6 characters"); 
            isValid = false; 
        } 
 
        return isValid; 
    } 
}
