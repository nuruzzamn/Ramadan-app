package com.example.romadanapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //////

    private Context mContext;
    private Activity mActivity;

    /////

    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t21,t22;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1=(TextView)findViewById(R.id.text1);
        t2=(TextView)findViewById(R.id.text2);
        t3=(TextView)findViewById(R.id.text3);
        t4=(TextView)findViewById(R.id.text4);
        t5=(TextView)findViewById(R.id.text5);
        t6=(TextView)findViewById(R.id.text6);
        t7=(TextView)findViewById(R.id.text7);

        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a1.class);
                startActivity(i);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a2.class);
                startActivity(i);
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a3.class);
                startActivity(i);
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a4.class);
                startActivity(i);
            }
        });

        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a5.class);
                startActivity(i);
            }
        });

        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a6.class);
                startActivity(i);
            }
        });

        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a7.class);
                startActivity(i);
            }
        });

        ////// /// /////

        t1=(TextView)findViewById(R.id.text11);
        t2=(TextView)findViewById(R.id.text12);
        t3=(TextView)findViewById(R.id.text13);
        t4=(TextView)findViewById(R.id.text14);
        t5=(TextView)findViewById(R.id.text15);
        t6=(TextView)findViewById(R.id.text16);
        t7=(TextView)findViewById(R.id.text17);
        t8=(TextView)findViewById(R.id.text18);
        t9=(TextView)findViewById(R.id.text19);
        t10=(TextView)findViewById(R.id.text20);
        t21=(TextView)findViewById(R.id.text21);
        t22=(TextView)findViewById(R.id.text22);


        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a11.class);
                startActivity(i);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a12.class);
                startActivity(i);
            }
        });

        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a13.class);
                startActivity(i);
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a14.class);
                startActivity(i);
            }
        });

        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a15.class);
                startActivity(i);
            }
        });

        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a14.class);
                startActivity(i);
            }
        });

        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a15.class);
                startActivity(i);
            }
        });

        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a16.class);
                startActivity(i);
            }
        });

        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a17.class);
                startActivity(i);
            }
        });

        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a18.class);
                startActivity(i);
            }
        });

        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a19.class);
                startActivity(i);
            }
        });

        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a20.class);
                startActivity(i);
            }
        });


        t21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a21.class);
                startActivity(i);
            }
        });

        t22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),a22.class);
                startActivity(i);
            }
        });




        ////////


        // Get the application context
        mContext = getApplicationContext();
        mActivity = MainActivity.this;
    }

    //code for menu

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.home)
        {
            Intent i=new Intent(MainActivity.this,MainActivity.class);
            startActivity(i);

        }

        if(item.getItemId()==R.id.feedback)
        {
            Intent i=new Intent(MainActivity.this,feedback.class);
            startActivity(i);
            Toast.makeText(this," Welcome for Interested to feedback ",Toast.LENGTH_LONG).show();
        }

        if(item.getItemId()==R.id.moreapp)
        {
            Intent i=new Intent(MainActivity.this,moreapp.class);
            startActivity(i);

            Toast.makeText(this," Welcome for Interested to show our other app ",Toast.LENGTH_LONG).show();
        }

        if(item.getItemId()==R.id.about)
        {
            Intent i=new Intent(MainActivity.this,about.class);
            startActivity(i);

            Toast.makeText(this," Welcome for Interested ",Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }

    //close code for menu

    protected void showAppExitDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(mActivity);

        builder.setTitle("Please Confirm");
        builder.setMessage("Do you want to exit?");
        builder.setCancelable(true);

        builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // Do something when user want to exit the app
                // Let allow the system to handle the event, such as exit the app
                MainActivity.super.onBackPressed();
            }
        });

        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                // Do something when want to stay in the app
                Toast.makeText(mContext," THANK YOU ",Toast.LENGTH_LONG).show();
            }
        });

        // Create the alert dialog using alert dialog builder
        AlertDialog dialog = builder.create();

        // Finally, display the dialog when user press back button
        dialog.show();
    }

    @Override
    public void onBackPressed(){

        // Ask the user to exit the app or stay in here
        showAppExitDialog();

    }

}
