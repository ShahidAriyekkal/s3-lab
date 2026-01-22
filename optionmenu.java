package com.example.optionmenu; 
import android.content.Intent; 
import android.os.Bundle; 
import android.view.Menu; 
import android.view.MenuItem; 
import android.widget.Toast; 
import androidx.appcompat.widget.Toolbar; 
import androidx.appcompat.app.AppCompatActivity; 
import androidx.activity.EdgeToEdge; 
import androidx.core.graphics.Insets; 
import androidx.core.view.ViewCompat; 
import androidx.core.view.WindowInsetsCompat; 
public class MainActivity extends AppCompatActivity { 
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
Toolbar toolbar = findViewById(R.id.toolbar); 
setSupportActionBar(toolbar); 
} 
@Override 
public boolean onCreateOptionsMenu(Menu menu) { 
getMenuInflater().inflate(R.menu.options_menu, menu); 
return true; 
} 
@Override 
public boolean onOptionsItemSelected(MenuItem item) { 
switch (item.getItemId()) { 
case R.id.menu_home: 
startActivity(new Intent(this, HomeActivity.class)); 
return true; 
case R.id.menu_profile: 
startActivity(new Intent(this, ProfileActivity.class)); 
return true; 
case R.id.menu_settings: 
startActivity(new Intent(this, SettingsActivity.class)); 
return true; 
case R.id.option_menu: 
Toast.makeText(this, "Logged out", Toast.LENGTH_SHORT).show(); 
return true; 
default: 
return super.onOptionsItemSelected(item); 
} 
} 
} 
HOME CODE 
package com.example.optionmenu; 
import android.os.Bundle; 
import androidx.activity.EdgeToEdge; 
import androidx.appcompat.app.AppCompatActivity; 
import androidx.core.graphics.Insets; 
import androidx.core.view.ViewCompat; 
import androidx.core.view.WindowInsetsCompat; 
public class HomeActivity extends AppCompatActivity { 
@Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
EdgeToEdge.enable(this); 
setContentView(R.layout.menu_home); 
ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.menu_home), (v, insets) -> 
{ 
} 
Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars()); 
v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom); 
return insets; 
}); 
} 
PROFILE CODE 
package com.example.optionmenu; 
import android.os.Bundle; 
import androidx.activity.EdgeToEdge; 
import androidx.appcompat.app.AppCompatActivity; 
import androidx.core.graphics.Insets; 
import androidx.core.view.ViewCompat; 
import androidx.core.view.WindowInsetsCompat; 
public class ProfileActivity extends AppCompatActivity { 
@Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
EdgeToEdge.enable(this); 
setContentView(R.layout.menu_profile); 
ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.menu_profile), (v, insets) -> 
{ 
} 
Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars()); 
v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom); 
return insets; 
}); 
} 
SETTING CODE 
package com.example.optionmenu; 
import android.os.Bundle; 
import androidx.activity.EdgeToEdge; 
import androidx.appcompat.app.AppCompatActivity; 
import androidx.core.graphics.Insets; 
import androidx.core.view.ViewCompat; 
import androidx.core.view.WindowInsetsCompat; 
public class SettingsActivity extends AppCompatActivity { 
@Override 
protected void onCreate(Bundle savedInstanceState) { 
super.onCreate(savedInstanceState); 
EdgeToEdge.enable(this); 
setContentView(R.layout.menu_settings); 
ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.menu_settings), (v, insets) -> 
{ 
Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars()); 
v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom); 
return insets; 
}); 
} 
}
