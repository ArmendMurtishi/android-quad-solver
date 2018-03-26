package armend.murtishi;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;
import android.widget.Toast;

public class QuadFormula extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final TextView info = (TextView) findViewById(R.id.info);
        final TextView atext = (TextView) findViewById(R.id.a);
        final TextView btext = (TextView) findViewById(R.id.b);
        final TextView ctext = (TextView) findViewById(R.id.c);
        
        final Button solveButton = (Button) findViewById(R.id.solve);
        solveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                int a = Integer.parseInt(atext.getText().toString());
                int b = Integer.parseInt(btext.getText().toString());
                int c = Integer.parseInt(ctext.getText().toString());
                
                double discriminant = Math.pow(b, 2) - (4 * a * c);
                double root1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
                double root2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);
                
                info.setText("Root 1 is " + root1 + "\nRoot 2 is " + root2);
            }
        });
    }
}