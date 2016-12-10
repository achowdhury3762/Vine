package nyc.c4q.ashiquechowdhury.midterm_practical;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HashMap<String, String> argumentList = new HashMap<>();
        Bundle args = new Bundle();
        args.putSerializable("com.example.ashiquechowdhury.animations.ARGUMENTMAP", argumentList);
        showFragmentInContainer(R.id.rview_container, args, new VineFragment());
    }

    public void showFragmentInContainer(int container, Bundle arguments, Fragment fragment) {
        if (!bundleIsEmpty(arguments)) {
            fragment.setArguments(arguments);
        }
        getSupportFragmentManager().beginTransaction().replace(container, fragment).commit();
    }

    private boolean bundleIsEmpty(Bundle args) {
        return args.size() == 1;
    }
}
