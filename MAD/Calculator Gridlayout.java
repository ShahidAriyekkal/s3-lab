package com.example.gridlayout; 
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
EditText display; 
String currentInput = ""; 
double firstNumber = 0; 
char operator = ' '; 
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
display = findViewById(R.id.display); 
display.setKeyListener(null); 
int[] numberIds = { 
R.id.btn0, R.id.btn1, R.id.btn2, R.id.btn3, 
R.id.btn4, R.id.btn5, R.id.btn6, R.id.btn7, 
R.id.btn8, R.id.btn9 
}; 
 
        View.OnClickListener numberClick = v -> { 
            Button b = (Button) v; 
            currentInput += b.getText().toString(); 
            display.setText(currentInput); 
        }; 
 
        for (int id : numberIds) { 
            findViewById(id).setOnClickListener(numberClick); 
        } 
 
        findViewById(R.id.btnAdd).setOnClickListener(v -> handleOperator('+')); 
        findViewById(R.id.btnSub).setOnClickListener(v -> handleOperator('-')); 
        findViewById(R.id.btnMul).setOnClickListener(v -> handleOperator('*')); 
        findViewById(R.id.btnDiv).setOnClickListener(v -> handleOperator('/')); 
        findViewById(R.id.btnEqual).setOnClickListener(v -> calculateResult()); 
        findViewById(R.id.btnClear).setOnClickListener(v -> { 
            currentInput = ""; 
            firstNumber = 0; 
            operator = ' '; 
            display.setText(""); 
        }); 
    } 
 
    private void handleOperator(char op) { 
        if (!currentInput.isEmpty()) { 
            firstNumber = Double.parseDouble(currentInput); 
            operator = op; 
            currentInput = ""; 
            display.setText(""); 
        } 
    } 
 
    private void calculateResult() { 
        if (!currentInput.isEmpty() && operator != ' ') { 
            double secondNumber = Double.parseDouble(currentInput); 
            double result = 0; 
            switch (operator) { 
                case '+': result = firstNumber + secondNumber; break; 
                case '-': result = firstNumber - secondNumber; break; 
                case '*': result = firstNumber * secondNumber; break; 
                case '/': 
                    if (secondNumber == 0) { 
                        display.setText("Error"); 
                        return; 
                    } 
                    result = firstNumber / secondNumber; 
                    break; 
            } 
            display.setText(String.valueOf(result)); 
            currentInput = String.valueOf(result); 
            operator = ' '; 
        } 
    } 
}
