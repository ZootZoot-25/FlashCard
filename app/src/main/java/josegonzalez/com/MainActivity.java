package josegonzalez.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.Background).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Original_Answer).setVisibility(View.INVISIBLE);
                findViewById(R.id.flashcard_question).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_answer).setBackgroundColor(getResources().getColor(R.color.torquoise));
                findViewById(R.id.flashcard_incorrectAns1).setBackgroundColor(getResources().getColor(R.color.torquoise));
                findViewById(R.id.flashcard_incorrectAns2).setBackgroundColor(getResources().getColor(R.color.torquoise));
            }
        });

        findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Original_Answer).setVisibility(View.VISIBLE);
                findViewById(R.id.flashcard_question).setVisibility(View.INVISIBLE);
            }
        });

        findViewById(R.id.flashcard_answer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer).setBackgroundColor(getResources().getColor(R.color.green));
            }
        });

        findViewById(R.id.flashcard_incorrectAns1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer).setBackgroundColor(getResources().getColor(R.color.green));
                findViewById(R.id.flashcard_incorrectAns1).setBackgroundColor(getResources().getColor(R.color.red));
            }
        });

        findViewById(R.id.flashcard_incorrectAns2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.flashcard_answer).setBackgroundColor(getResources().getColor(R.color.green));
                findViewById(R.id.flashcard_incorrectAns2).setBackgroundColor(getResources().getColor(R.color.red));
            }
        });

    }
}
