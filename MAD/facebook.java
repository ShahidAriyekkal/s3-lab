XML CODE 
  
<?xml version="1.0" encoding="utf-8"?>  
<RelativeLayout 
xmlns:android="http://schemas.android.com/apk/res/android" 
android:id="@+id/main" 
android:layout_width="match_parent" 
android:layout_height="match_parent" 
android:background="#FFFFFF" 
android:padding="20dp"> 
<TextView 
android:id="@+id/fbTitle" 
android:layout_width="wrap_content" 
android:layout_height="wrap_content" 
android:text="facebook" 
android:textColor="#1877F2" 
android:textStyle="bold" 
android:textSize="36sp" 
android:layout_centerHorizontal="true" 
android:layout_marginTop="80dp" /> 
<EditText 
android:id="@+id/editTextEmail" 
android:layout_width="match_parent" 
android:layout_height="50dp" 
android:layout_below="@id/fbTitle" 
android:layout_marginTop="80dp" 
android:hint="Email or Phone" 
android:inputType="textEmailAddress" 
android:padding="10dp" 
android:background="@drawable/edittext_background" 
android:textSize="16sp" /> 
<EditText 
android:id="@+id/editTextPassword" 
android:layout_width="match_parent" 
android:layout_height="50dp" 
android:layout_below="@id/editTextEmail" 
android:layout_marginTop="15dp" 
android:hint="Password" 
android:inputType="textPassword" 
android:padding="10dp" 
android:background="@drawable/edittext_background" 
android:textSize="16sp" /> 
    <Button 
        android:id="@+id/btnLogin" 
        android:layout_width="match_parent" 
        android:layout_height="50dp" 
        android:layout_below="@id/editTextPassword" 
        android:layout_marginTop="20dp" 
        android:text="Log In" 
        android:textAllCaps="false" 
        android:textSize="18sp" 
        android:textColor="#FFFFFF" 
        android:backgroundTint="#1877F2" /> 
 
    <TextView 
        android:id="@+id/forgotPassword" 
        android:layout_width="wrap_content" 
        android:layout_height="wrap_content" 
        android:text="Forgotten password?" 
        android:textColor="#1877F2" 
        android:textSize="15sp" 
        android:layout_below="@id/btnLogin" 
        android:layout_centerHorizontal="true" 
        android:layout_marginTop="15dp" /> 
 
    <View 
        android:id="@+id/divider" 
        android:layout_width="match_parent" 
        android:layout_height="1dp" 
        android:background="#BDBDBD" 
        android:layout_below="@id/forgotPassword" 
        android:layout_marginTop="30dp" 
        android:layout_marginBottom="30dp" /> 
 
    <Button 
        android:id="@+id/btnSignup" 
        android:layout_width="wrap_content" 
        android:layout_height="50dp" 
        android:text="Create new account" 
        android:textAllCaps="false" 
        android:textSize="16sp" 
        android:textColor="#FFFFFF" 
        android:backgroundTint="#42B72A" 
        android:layout_below="@id/divider" 
        android:layout_centerHorizontal="true" 
        android:paddingStart="25dp" 
        android:paddingEnd="25dp" 
        android:layout_marginTop="10dp" /> 
</RelativeLayout>
