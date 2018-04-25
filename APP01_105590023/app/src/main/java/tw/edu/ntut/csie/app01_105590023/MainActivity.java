package tw.edu.ntut.csie.app01_105590023;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextResult;
    private EditText mEdtGrade;
    private Button mbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextResult = (TextView) findViewById(R.id.resultText);
        mEdtGrade = (EditText) findViewById(R.id.editText);
        mbtn = (Button) findViewById(R.id.button);

        mbtn.setOnClickListener(btnOnClick);
    }

    private View.OnClickListener btnOnClick = new View.OnClickListener(){

        @Override
        public void onClick(View v){
            String strGrade = mEdtGrade.getText().toString();
            int intGrade = Integer.parseInt(strGrade);
            letterGrade result = new letterGrade();

            mTextResult.setText(result.letterGrade(intGrade));
        }
    };
}
