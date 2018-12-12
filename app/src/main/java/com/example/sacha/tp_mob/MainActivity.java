package com.example.sacha.tp_mob;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewName;

    private Button buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }


    private void initViews(){

        textViewName = findViewById(R.id.activity_main_textview_name);
        buttonNext = findViewById(R.id.activity_main_button_next);
        //textViewName.setText(R.string.activity_main_textview_name);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()){

                    case R.id.activity_main_button_next :
                        Intent intent  = new Intent(MainActivity.this, FormActivity.class);
                        startActivity(intent);

                        break;
                }
            }
        });

    }

    @Override
    protected void onResume(){
        super.onResume();
        textViewName.setText(DataManager.getInstance().getName());
    }



    /*@Override
    public void onActvityResult(int requestCode, int resultCode, @Nullable Intent data){

        if (requestCode == 1 ){

            if (resultCode == RESULT_OK && data.getExtras()!= null){

                Bundle args = data.getExtras();

                String username = args.getString("USERNAME");

                textViewName.setText(username);

            }else{

                //code

            }
        }
    }*/

}