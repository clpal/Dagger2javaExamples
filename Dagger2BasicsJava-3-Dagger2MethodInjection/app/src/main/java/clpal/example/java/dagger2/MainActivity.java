package clpal.example.java.dagger2;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import clpal.example.java.dagger2.R;

import clpal.example.java.dagger2.basics.Constants;
import clpal.example.java.dagger2.basics.MainViewModel;
import clpal.example.java.dagger2.di.DaggerMainViewModelInjector;

import javax.inject.Inject;

import androidx.appcompat.app.AppCompatActivity;

import static clpal.example.java.dagger2.basics.Constants.TAG;

public class MainActivity extends AppCompatActivity {

    @Inject
    MainViewModel mMainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView=findViewById(R.id.textView);
        Button button=findViewById(R.id.connect);

        DaggerMainViewModelInjector.create().injectFields(this);

        button.setOnClickListener(view -> {
            Log.d(Constants.TAG, "onCreate: Data fetched");
            textView.setText(mMainViewModel.fetchData());
        });

    }
// if we are comment DaggerMainViewModelInjector.create().injectFields(this); then occured run time null pointer exception and field and method will not run .
// it means method are also depends on inject Line 31 not field Injection
 //

    @Inject
    public void testMethod() {
        Log.d(TAG, "testMethod: this is test method from main activity");
    }

}
