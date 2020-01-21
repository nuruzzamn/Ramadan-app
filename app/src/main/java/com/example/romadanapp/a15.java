package com.example.romadanapp;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class a15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a15);

        TextView t1=(TextView)findViewById(R.id.a1t);

        t1.setText("মাসআলা : একটি রোযার জন্য দুই মাস ধারাবাহিকভাবে রোযা রাখতে হবে। কোনো কারণে ধারাবাহিকতা ছুটে গেলে পুনরায় নতুন করে রোযা রাখতে হবে। পেছনের রোযাগুলো কাফফারার রোযা হিসাবে ধর্তব্য হবে না। তবে মহিলাদের হায়েযের কারণে ধারাবাহিকতা নষ্ট হলে অসুবিধা নেই।\n" +
                "\n" +
                "ইবরাহীম নাখায়ী রাহ. বলেন, ‘যার উপর কাফফারা হিসাবে  দুই মাস ধারাবাহিকভাবে রোযা রাখা জরুরি সে যদি মাঝে অসুস্থ হওয়ার কারণে রোযা রাখতে না পারে, তাহলে আবার নতুন করে রোযা রাখা শুরু করবে।’-আলমুহাল্লা ৪/৩৩১; মাবসূত, সারাখসী ৭/১৪; আলবাহরুর রায়েক ২/২৭৭; আলমুহীতুল বুরহানী ৫/১৯৬ ");
    }
}
