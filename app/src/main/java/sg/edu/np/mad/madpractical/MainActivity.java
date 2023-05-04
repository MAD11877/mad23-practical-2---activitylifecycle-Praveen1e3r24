package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       User user = new User("praveen","Male",1,true);

        Button follow = findViewById(R.id.button1);

        if (user.followed)
        {
            follow.setText("Follow");
        }
        else
        {
            follow.setText("Unfollow");
        }

        follow.setOnClickListener(

                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (user.followed)
                        {
                         user.followed=false;
                         follow.setText("Unfollow");

                        }
                        else {
                            user.followed=true;
                            follow.setText("Follow");
                        }
                        Toast.makeText(getApplicationContext(),"followed", Toast.LENGTH_SHORT).show();
                    }
                }

        );



    }


}