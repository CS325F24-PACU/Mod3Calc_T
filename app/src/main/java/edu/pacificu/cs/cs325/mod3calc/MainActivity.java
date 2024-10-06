package edu.pacificu.cs.cs325.mod3calc;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnZero;
    private Mod3Calc mcCalc;
    private final String LOG_TAG = "MOD3CALCAPP";

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

        // write you code below this line!
        mcCalc = new Mod3Calc();
        btnZero = findViewById(R.id.btnZero);

        btnZero.setOnClickListener( (view) -> {
            Log.d(LOG_TAG, btnZero.getText() + " pressed");
            // add code to interact with mcCalc
        });

    }
}