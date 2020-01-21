package com.example.romadanapp;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class a4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a4);

        TextView t1=(TextView)findViewById(R.id.a1t);

        t1.setText("রোযা এমন একটি ইবাদত যা বাহ্যত কষ্টকর হলেও তার প্রচলন ছিল সর্বকালে। হযরত আদম আ.-এর যুগ থেকে শেষ নবী সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম পর্যন্ত সকল নবীর উম্মতের উপরই তা ফরয ছিল। -রূহুল মাআনী ২/৫৬\n" +
                "\n" +
                "অবশ্য পূর্ব যুগে রোযার ধরন ছিল বিভিন্ন প্রকৃতির। রোযা রাখার পদ্ধতির ভিন্নতা ছাড়াও ফরয রোযার সংখ্যাও বিভিন্ন রকম ছিল। প্রাথমিক অবস্থায় উম্মতে মুহাম্মদীর উপরও কেবলমাত্র আশুরার রোযা ফরয ছিল। রমযানের রোযার ফরয বিধান আসার পর আশুরার রোযা ফরয হওয়ার হুকুম রহিত হয়ে যায়। -মাআরিফুস সুনান ৫/৩২৩\n" +
                "\n" +
                "উল্লেখ্য, রোযা ফরয হয় হিজরতের দেড় বৎসর পর, ১০ শাবানে। রোযা ফরয হওয়ার পর নবী কারীম সাল্লাল্লাহু আলাইহি ওয়াসাল্লাম মোট ৯টি রমযান পেয়েছিলেন।");
    }
}
