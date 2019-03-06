package example.fgurgur.picassoornek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView img,img2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img = findViewById(R.id.img);
        img2 = findViewById(R.id.img2);

        String resimUrl = "http://resimdiyari.com/_data/i/upload/2012/10/14/20121014183634-0b00cb13-me.jpg";

        //picasso using with url, getting image from url
        Picasso.with(getApplicationContext())
                .load(resimUrl)
                .placeholder(R.drawable.yukleniyor)
                .error(R.drawable.hata)
                .into(img);

        Picasso.with(getApplicationContext())
                .load(R.drawable.araba)
                .placeholder(R.drawable.yukleniyor)
                .error(R.drawable.hata)
                .into(img2);

    }
}
