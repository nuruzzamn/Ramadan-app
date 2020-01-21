package com.example.romadanapp;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class a22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a22);

        TextView t1=(TextView)findViewById(R.id.a1t);

        t1.setText("উল্লেখিত বিষয় গুলো মাসিক আল কাওসার হতে সংগৃহীত । আল্লাহ তাদের এই দ্বীনি খেদমতকে কবুল করেন । আমিন ।\n" +
                "\n" +
                "মানুষ মাত্রই ভুল করবে । তাই ভুল গুলো ক্ষমা সুন্দর দৃষ্টিতে দেখবেন আর অবশ্যই ফিডব্যাকে আপনার মতামত জানাবেন । ইনশাল্লাহ পরবর্তী আপডেটে বিষয়গুলো ঠিক করা হবে । \n" +
                "\n" +
                "ধৈর্য্য ধরে পড়ার জন্য ধন্যবাদ । আল্লাহ আপনাকে উত্তম জাযাখায়ের দান করুক ।\n" +
                "\n" +
                "আসসালামুয়ালাইকুম ।।।\n" +
                "\n");
    }
}
