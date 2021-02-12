package clpal.example.java.dagger2;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import clpal.example.java.dagger2.basics.MainViewModel;
import clpal.example.java.dagger2.di.DaggerMainViewModelInjector;

import static clpal.example.java.dagger2.basics.Constants.MY_TAG;

public class MainActivity extends AppCompatActivity {

    private MainViewModel mMainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView=findViewById(R.id.textView);
        Button button=findViewById(R.id.connect);
// DaggerMainViewModelInjector=Dagger +MainViewModelInjector
        mMainViewModel = DaggerMainViewModelInjector.create().getMainViewModel();

        button.setOnClickListener(view -> {
            Log.d(MY_TAG, "onCreate: Data fetched");
            textView.setText(mMainViewModel.fetchData());
        });

    }
}
