package com.example.explicit; 
import androidx.appcompat.app.AppCompatActivity; 
import android.content.Intent; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import androidx.activity.EdgeToEdge; 
import androidx.core.graphics.Insets; 
import androidx.core.view.ViewCompat; 
import androidx.core.view.WindowInsetsCompat; 
public class MainActivity extends AppCompatActivity { 
Button btnNext; 
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
btnNext = findViewById(R.id.btnNext); 
btnNext.setOnClickListener(new View.OnClickListener() { 
@Override 
public void onClick(View v) { 
Intent intent = new Intent(MainActivity.this, SecondActivity.class); 
startActivity(intent); 
} 
}); 
} 
} 
DISPLAY CODE 
package com.example.explicit; 
import androidx.appcompat.app.AppCompatActivity; 
import android.os.Bundle; 
import android.widget.TextView; 
import androidx.activity.EdgeToEdge; 
import androidx.core.graphics.Insets; 
import androidx.core.view.ViewCompat; 
import androidx.core.view.WindowInsetsCompat; 
public class SecondActivity extends AppCompatActivity { 
@Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
EdgeToEdge.enable(this); 
setContentView(R.layout.activity_display); 
ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.display), (v, insets) -> { 
Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars()); 
v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom); 
return insets; 
}); 
TextView tvDisplay = findViewById(R.id.tvDisplay); 
tvDisplay.setText("Second Page"); 
} 
}
