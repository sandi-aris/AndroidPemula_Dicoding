package com.example.tugasaris;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String mTitle [] = {"Coto makasar",
            "Sarabba",
            "Sup Konro",
            "Nasu palekko",
            "Kapurung",
            "Buras",
            "Doko-Doko Cangkuling",
            "Gogoso",
            "Sokko (Songkolo)",
            "Mie titi",
            "Pisang epe",
            "Jalangkote",
            "Kue Dange"
    };
    String mDescription [] = {"Coto Makassar atau Coto Mangkasara adalah makanan yang sangat terkenal di tanah Makassar. Makanan ini merupakan makanan berkuah yang menggunakan jeroan atau isi perut sapi. Sebelum disantap bersama kuah segar, jeroan sapi harus direbus dan dibumbui terlebih dahulu dengan bumbu yang diracik secara khusus.\n" +
            "\n" +
            "Coto makassar biasanya disajikan dengan ketupat dan burasa. Bagi kamu yang belum tahu, burasa sendiri adalah nama panganan khas Bugis dan Makassar yang juga dikenal dengan sebutan lapat dan lontong bersantan. Bentuk dari burasa mirip seperti lontong yang berukuran sedikit pipih dan diproses masak dengan cara tersendiri. Kalau kamu berkeinginan untuk mencoba coto makassar langsung dari tempat asalnya, kamu bisa mendatangi warung-warung makan di pinggir jalan kota Makassar.",
            "Sarabba adalah minuman khas Makassar yang juga tak boleh kamu lewatkan begitu saja. Selain menjadi minuman khas Makassar, sarabba juga terkenal sebagai minuman khas Gorontalo. Saraba atau sarabba sendiri merupakan minuman tradisional yang hangat dan bisa menyegarkan badan. Sarba dibuat dari campuran rimpang jahe, gula aren, santan, dan merica bubuk.\n" +
                    "\n" +
                    "Penyajian sarabba juga unik, ada yang menggunakan kuning telur ataupun tidak. Dari bahan-bahan tersebut, bisa diketahui bahwasanya sarabba mempunyai cita rasa manis dengan sesai hangat dan pedas. Saat diminum, sarabba akan langsung menghangatkan tenggorokan dan badan. Sarabba paling enak dinikmati saat malam hari. Ketika mengeuk secangkir sarabba, jangan lupa untuk ditemani dengan aneka gorengan dan ubi rebus..",
            "Sup konro adalah sajian yang hampir digemari banyak orang. Sup konro merupakan makanan tradisional khas Makassar yang hampir sama dengan coto makassar. Sup konro dibuat dari iga sapi yang harus melewati proses perebusan terlebih dahulu sebelum disantap dengan tujuan agar iga sapi bisa empuk dan bisa terlepas dari tulang.\n" +
                    "\n" +
                    "Makanan yang dibuat dari bermacam-macam rempah ini umumnya dihidangkan dengan ketupat atau burasa. Di Makassar, kamu bisa mendapati banyak warung makan yang menjual menu makanan khas Makassar ini, semisal di Jl. Daeng Tata dan Jl. Gunung Lompobattang. Sup konro sendiri bisa sudah bisa dinikmati hanya dengan merogoh kocok antara Rp30.000 – Rp50.000.",
            "Biasanya nasu palekko disajikan bersama daging sapi atau bebek dengan bumbu seperti rendang. Namun nasu palekko dengan daging bebek lebih populer dibandingkan yang berisi daging sapi.\n" +
                    "\n" +
                    "Daging bebek yang dibumbui aneka rempah ini lebih bagus dipilih yang menggunakan bahan dasar bebek muda. Sebab daging bebek muda lebih empuk ketika dimakan. Bagi yang ingin mencicipi olahan daging ini, kamu bisa mudah menemukannya di Pinrap, Pirang, Pangkajene, hingga Kabupaten Wajo.",
            "Jika Papua dan Maluku memiliki Papeda, Sulawesi Selatan ternyata juga mempunyai jenis makanan yang mirip seperti olahan sagu tersebut. Namanya Kapurung. Makanan berbahan dasar tepung sagu ini diolah sedemikian rupa dengan campuran ikan, daging sapi, atau sayuran. Kalau ingin menikmati makanan khas sulawesi selatan, yang satu ini wajib dicoba. Sulit menemukan makanan ini di daerah lain.\n" +
                    "\n" +
                    "Mulai dari kaki lima sampai restoran bintang lima, olahan tradisional ini bisa dengan mudah dijumpai di sulawesi selatan sana. Di daerah seperti Palopo, Kabupaten Luwu, Luwu Utara, hingga Luwu Timur, kamu akan mudah menjumpai makanan dengan rasa gurih ini.",
            "Buras mirip seperti ketupat atau lontong. Hanya saja bentuknya lebih pipih dengan balutan daun pisang. Biasanya makanan berbahan dasar beras ini disantap bersama coto makassar, sop saudara, atau sop konro.\n" +
                    "\n" +
                    "Selain dinikmati dengan hidangan tersebut, kamu bisa menyantapnya dengan taburan serundeng yang dibumbui cabe, garam, dan gula. Biasanya buras sangat sering ditemui di bulan Ramadan. Namun di bulan lainnya pun kamu tetap bisa menjumpainya, terutama di resto-resto khas Makassar.",
            "Camilan khas Sulawesi Selatan ini cocok bagi penggemar cita rasa manis. Camilan ini juga cocok dijadikan oleh-oleh khas Makassar. Kue dengan bungkusan daun pisang ini terbuat dari campuran tepung beras, tepung terigu, kentang, serta santan. Uniknya ketika digigit, akan merasakan rasa gula merah yang lumer.\n" +
                    "\n" +
                    "Kue basah ini sangat mudah dijumpai di pasar tradisional daerah Sulawesi Selatan dengan harga relatif terjangkau. Jadi tak ada salahnya kalau berkunjung kesana, pulang bawa oleh-oleh doko-doko cangkuling.",
            "Gogoson memiliki bentuk mirip kue lemper. Jika kue lemper dimasak dengan cara dikukus, olahan berbahan dasar beras ketan ini diolah dengan cara dibakar sampai matang. Karena proses pembakaran tersebut, aroma daun pisangnya akan begitu kuat sampai ke beras ketan.\n" +
                    "\n" +
                    "Biasanya gogoson dihidangkan bersama telur asin. Namun jika langsung dimakan begitu saja sudah cukup lezat karena isiannya adalah daging sapi.",
            "Biasanya olahan berbahan dasar beras ketan memiliki cita rasa manis. Namun berbeda dengan sokko atau songkolo ini. Berbahan dasar beras ketan hitam atau putih, penyajiannya menggunakan serundeng sehingga rasanya begitu gurih.\n" +
                    "\n" +
                    "Sebagai pelengkap, sokko juga bisa disantap dengan ikan asin, telur asin, serta sambal tomat. Bagi yang hendak bersambang ke Sulawesi Selatan, jangan lewatkan kuliner unik satu ini ya.",
            "Tak hanya Aceh yang memiliki kuliner khas berupa mie. Sulawesi Selatan juga memiliki olahan bertajuk Mie Titi. Sekilas, Mie Titi mirip seperti Tamie yang merupakan salah satu masakan khas Tiongkok. Namun cita rasanya cukup unik karena bahan utamanya adalah mie kering.\n" +
                    "\n" +
                    "Mie kuning kering disiram dengan kuah mirip cap tjay dengan tambahan udang. Jamur, cumi, dan berbagai macam sayuran. Selain sedap dinikmati selagi hangat, bisa menambahkan perasan jeruk nipis agar rasanya makin mantap.",
            "Camilan berbahan dasar pisang kepok ini memiliki cita rasa manis nan legit yang menggoda. Pisang kepok matang diolah dengan cara dibakar sembari dibolak-balik. Kemudian pisang dipipihkan dengan cara ditekan-tekan hingga berwarna kecoklatan. Pisang yang telah dibakar tersebut nantinya dihidangkan dengan siraman gula merah cair.\n" +
                    "\n" +
                    "Camilan legit ini sangat mudah dijumpai di berbagai sudut daerah Sulawesi Selatan. Kamupun bisa mencoba membuatnya sendiri jika tak sempat berkunjung ke provinsi tersebut.",
            "Sekilas tampilan dari makanan khas sulawesi selatan yang satu ini mirip seperti kue pastel. Jalangkote merupakan kue khas Sulawesi Selatan yang dibuat dengan cara yang tidak jauh berbeda dengan kue pastel.\n" +
                    "\n" +
                    "Hanya saja, untuk isianya jalangkote lebih beranekaragam bila dibandingkan dengan pastel. Kamu bisa memilih isian yang terbuat dari wortel, kentang, bihun, telur rebus, hingga daging bahkan ikan. Cocok sekali disantap ketika sedang santai.",
            "Memiliki cita rasa yang gurih, manis dan legit. Kue dange tidak jauh berbeda dengan kue pukis atau sagu rangi. Rasa gurih kue dange berasal dari kelapa parut yang dicampurkan dengan gula merah.\n" +
                    "\n" +
                    "Kue dange termasuk salah satu kue tradisional yang saat ini kehadirannya sudah jarang ditemukan. Namun, jika kamu berkunjung ke daerah Pangkep, masih bisa menemukan jajanan tradisional khas Bugis ini dengan mudah.\n" +
                    "\n" +
                    "Masih banyak lagi kuliner khas Sulawesi Selatan yang tentunya sangat menggugah selera. Jadi jika jalan-jalan ke provinsi satu ini, jangan lupa mencicipi makanan khasnya ya.",};
    int images[] = {
            R.drawable.coto,
            R.drawable.sarabba,
            R.drawable.konro,
            R.drawable.nasu,
            R.drawable.kapurung,
            R.drawable.buras,
            R.drawable.doko,
            R.drawable.gogoso,
            R.drawable.sokko,
            R.drawable.mie,
            R.drawable.pisang,
            R.drawable.jalangkote,
            R.drawable.kue,};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.MakananKhas);
        Myadapter adapter = new Myadapter(this,mTitle,mDescription,images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    Intent intent = new Intent(getApplicationContext(), DataMakanan.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("Images" ,images[0]);
                    intent.putExtras(bundle);


                    intent.putExtra("title",mTitle[0]);
                    intent.putExtra("Description", mDescription[0]);
                    intent.putExtra("position", ""+0);
                    startActivity(intent);
                }
                if (position == 1){
                    Intent intent = new Intent(getApplicationContext(), DataMakanan.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("Images" ,images[1]);
                    intent.putExtras(bundle);


                    intent.putExtra("title",mTitle[1]);
                    intent.putExtra("Description", mDescription[1]);
                    intent.putExtra("position", ""+1);
                    startActivity(intent);
                }
                if (position == 2){
                    Intent intent = new Intent(getApplicationContext(), DataMakanan.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("Images" ,images[2]);
                    intent.putExtras(bundle);


                    intent.putExtra("title",mTitle[2]);
                    intent.putExtra("Description", mDescription[2]);
                    intent.putExtra("position", ""+2);
                    startActivity(intent);
                }
                if (position == 3){
                    Intent intent = new Intent(getApplicationContext(), DataMakanan.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("Images" ,images[3]);
                    intent.putExtras(bundle);


                    intent.putExtra("title",mTitle[3]);
                    intent.putExtra("Description", mDescription[3]);
                    intent.putExtra("position", ""+3);
                    startActivity(intent);
                }
                if (position == 4){
                    Intent intent = new Intent(getApplicationContext(), DataMakanan.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("Images" ,images[4]);
                    intent.putExtras(bundle);


                    intent.putExtra("title",mTitle[4]);
                    intent.putExtra("Description", mDescription[4]);
                    intent.putExtra("position", ""+4);
                    startActivity(intent);
                }
                if (position == 5){
                    Intent intent = new Intent(getApplicationContext(), DataMakanan.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("Images" ,images[5]);
                    intent.putExtras(bundle);


                    intent.putExtra("title",mTitle[5]);
                    intent.putExtra("Description", mDescription[5]);
                    intent.putExtra("position", ""+5);
                    startActivity(intent);
                }
                if (position == 6){
                    Intent intent = new Intent(getApplicationContext(), DataMakanan.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("Images" ,images[6]);
                    intent.putExtras(bundle);


                    intent.putExtra("title",mTitle[6]);
                    intent.putExtra("Description", mDescription[6]);
                    intent.putExtra("position", ""+6);
                    startActivity(intent);
                }
                if (position == 7){
                    Intent intent = new Intent(getApplicationContext(), DataMakanan.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("Images" ,images[7]);
                    intent.putExtras(bundle);


                    intent.putExtra("title",mTitle[7]);
                    intent.putExtra("Description", mDescription[7]);
                    intent.putExtra("position", ""+7);
                    startActivity(intent);
                }
                if (position == 8){
                    Intent intent = new Intent(getApplicationContext(), DataMakanan.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("Images" ,images[8]);
                    intent.putExtras(bundle);


                    intent.putExtra("title",mTitle[8]);
                    intent.putExtra("Description", mDescription[8]);
                    intent.putExtra("position", ""+8);
                    startActivity(intent);
                }
                if (position == 9){
                    Intent intent = new Intent(getApplicationContext(), DataMakanan.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("Images" ,images[9]);
                    intent.putExtras(bundle);


                    intent.putExtra("title",mTitle[9]);
                    intent.putExtra("Description", mDescription[9]);
                    intent.putExtra("position", ""+9);
                    startActivity(intent);
                }
                if (position == 10){
                    Intent intent = new Intent(getApplicationContext(), DataMakanan.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("Images" ,images[10]);
                    intent.putExtras(bundle);


                    intent.putExtra("title",mTitle[10]);
                    intent.putExtra("Description", mDescription[10]);
                    intent.putExtra("position", ""+10);
                    startActivity(intent);
                }
                if (position == 11){
                    Intent intent = new Intent(getApplicationContext(), DataMakanan.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("Images" ,images[11]);
                    intent.putExtras(bundle);


                    intent.putExtra("title",mTitle[11]);
                    intent.putExtra("Description", mDescription[11]);
                    intent.putExtra("position", ""+11);
                    startActivity(intent);
                }
                if (position == 12){
                    Intent intent = new Intent(getApplicationContext(), DataMakanan.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("Images" ,images[12]);
                    intent.putExtras(bundle);


                    intent.putExtra("title",mTitle[12]);
                    intent.putExtra("Description", mDescription[12]);
                    intent.putExtra("position", ""+12);
                    startActivity(intent);
                }
                if (position == 13){
                    Intent intent = new Intent(getApplicationContext(), DataMakanan.class);
                    Bundle bundle = new Bundle();
                    bundle.putInt("Images" ,images[13]);
                    intent.putExtras(bundle);


                    intent.putExtra("title",mTitle[13]);
                    intent.putExtra("Description", mDescription[13]);
                    intent.putExtra("position", ""+13);
                    startActivity(intent);
                }
            }
        });
    }

    class Myadapter extends ArrayAdapter<String>{
        Context context;
        String rTitle [];
        String rDescription [];
        int rImgs[];

        Myadapter (Context c, String title[], String description[],int imgs[]){
            super(c, R.layout.row_data, R.id.testView1, title);
            this.context = c;
            this.rTitle = title;
            this.rDescription = description;
            this.rImgs = imgs;


        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View row = layoutInflater.inflate(R.layout.row_data,parent,false);
            ImageView images = row.findViewById(R.id.Image);
            TextView myTitle = row.findViewById(R.id.testView1);
            TextView myDescription = row.findViewById(R.id.testView2);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);


            return row;


        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    public void about (MenuItem menu){
        startActivity(new Intent(MainActivity.this,About.class));
    }
}
