package com.info.jsonparseislemi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.json.JSONException
import org.json.JSONObject

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val jsonBayraklarSonuc = "{\"bayraklar\":[{\"bayrak_id\":\"1\",\"bayrak_ad\":\"T\\u00fcrkiye\",\"bayrak_resim\":\"turkiye\"},{\"bayrak_id\":\"2\",\"bayrak_ad\":\"Almanya\",\"bayrak_resim\":\"almanya\"},{\"bayrak_id\":\"3\",\"bayrak_ad\":\"\\u0130talya\",\"bayrak_resim\":\"italya\"},{\"bayrak_id\":\"4\",\"bayrak_ad\":\"Fransa\",\"bayrak_resim\":\"fransa\"},{\"bayrak_id\":\"5\",\"bayrak_ad\":\"Hollanda\",\"bayrak_resim\":\"hollanda\"},{\"bayrak_id\":\"6\",\"bayrak_ad\":\"\\u0130spanya\",\"bayrak_resim\":\"ispanya\"},{\"bayrak_id\":\"7\",\"bayrak_ad\":\"Slovenya\",\"bayrak_resim\":\"slovenya\"},{\"bayrak_id\":\"8\",\"bayrak_ad\":\"Slovakya\",\"bayrak_resim\":\"slovakya\"},{\"bayrak_id\":\"9\",\"bayrak_ad\":\"Estonya\",\"bayrak_resim\":\"estonya\"},{\"bayrak_id\":\"10\",\"bayrak_ad\":\"Rusya\",\"bayrak_resim\":\"rusya\"},{\"bayrak_id\":\"11\",\"bayrak_ad\":\"Bulgaristan\",\"bayrak_resim\":\"bulgaristan\"},{\"bayrak_id\":\"12\",\"bayrak_ad\":\"Romanya\",\"bayrak_resim\":\"romanya\"},{\"bayrak_id\":\"13\",\"bayrak_ad\":\"Norve\\u00e7\",\"bayrak_resim\":\"norvec\"},{\"bayrak_id\":\"14\",\"bayrak_ad\":\"Yunanistan\",\"bayrak_resim\":\"yunanistan\"},{\"bayrak_id\":\"15\",\"bayrak_ad\":\"Bosna Hersek\",\"bayrak_resim\":\"bosnahersek\"}],\"success\":1}"

        try{

            val jsonObject = JSONObject(jsonBayraklarSonuc)

            val bayraklarListe = jsonObject.getJSONArray("bayraklar")

            for(i in 0 until bayraklarListe.length()){

                val b = bayraklarListe.getJSONObject(i)

                val bayrak_id = b.getInt("bayrak_id")
                val bayrak_ad = b.getString("bayrak_ad")
                val bayrak_resim = b.getString("bayrak_resim")

               /* Log.e("********","********")
                Log.e("Bayrak id",bayrak_id.toString())
                Log.e("Bayrak ad",bayrak_ad)
                Log.e("Bayrak resim",bayrak_resim)
                Log.e("********","********")*/
            }


        }catch (e:JSONException){
            e.printStackTrace()
        }

        val filmlerJsonSonuc = "{\"filmler\":[{\"film_id\":\"1\",\"film_ad\":\"Interstellar\",\"film_yil\":\"2015\",\"film_resim\":\"interstellar.png\",\"kategori\":{\"kategori_id\":\"4\",\"kategori_ad\":\"Bilim Kurgu\"},\"yonetmen\":{\"yonetmen_id\":\"1\",\"yonetmen_ad\":\"Christopher Nolan\"}},{\"film_id\":\"2\",\"film_ad\":\"Inception\",\"film_yil\":\"2010\",\"film_resim\":\"inception.png\",\"kategori\":{\"kategori_id\":\"4\",\"kategori_ad\":\"Bilim Kurgu\"},\"yonetmen\":{\"yonetmen_id\":\"1\",\"yonetmen_ad\":\"Christopher Nolan\"}},{\"film_id\":\"3\",\"film_ad\":\"The Pianist\",\"film_yil\":\"2002\",\"film_resim\":\"thepianist.png\",\"kategori\":{\"kategori_id\":\"3\",\"kategori_ad\":\"Drama\"},\"yonetmen\":{\"yonetmen_id\":\"4\",\"yonetmen_ad\":\"Roman Polanski\"}},{\"film_id\":\"4\",\"film_ad\":\"Bir Zamanlar Anadolu'da\",\"film_yil\":\"2011\",\"film_resim\":\"birzamanlaranadoluda.png\",\"kategori\":{\"kategori_id\":\"3\",\"kategori_ad\":\"Drama\"},\"yonetmen\":{\"yonetmen_id\":\"3\",\"yonetmen_ad\":\"Nuri Bilge Ceylan\"}},{\"film_id\":\"5\",\"film_ad\":\"The Hateful Eight\",\"film_yil\":\"2015\",\"film_resim\":\"thehatefuleight.png\",\"kategori\":{\"kategori_id\":\"1\",\"kategori_ad\":\"Aksiyon\"},\"yonetmen\":{\"yonetmen_id\":\"2\",\"yonetmen_ad\":\"Quentin Tarantino\"}},{\"film_id\":\"18\",\"film_ad\":\"Django\",\"film_yil\":\"2013\",\"film_resim\":\"django.png\",\"kategori\":{\"kategori_id\":\"1\",\"kategori_ad\":\"Aksiyon\"},\"yonetmen\":{\"yonetmen_id\":\"2\",\"yonetmen_ad\":\"Quentin Tarantino\"}}],\"success\":1}"

        try{

            val jsonObject = JSONObject(filmlerJsonSonuc)

            val filmlerListe = jsonObject.getJSONArray("filmler")

            for(i in 0 until filmlerListe.length()){

                val f = filmlerListe.getJSONObject(i)

                val film_id = f.getInt("film_id")
                val film_ad = f.getString("film_ad")
                val film_yil = f.getInt("film_yil")
                val film_resim = f.getString("film_resim")

                val kategori = f.getJSONObject("kategori")
                val kategori_id = kategori.getInt("kategori_id")
                val kategori_ad = kategori.getString("kategori_ad")

                val yonetmen = f.getJSONObject("yonetmen")
                val yonetmen_id = yonetmen.getInt("yonetmen_id")
                val yonetmen_ad = yonetmen.getString("yonetmen_ad")

                Log.e("********","********")
                Log.e("Film id",film_id.toString())
                Log.e("Film ad",film_ad)
                Log.e("Film yıl",film_yil.toString())
                Log.e("Film resim",film_resim)
                Log.e("Kategori id",kategori_id.toString())
                Log.e("Kategori ad",kategori_ad)
                Log.e("Yönetmen id",yonetmen_id.toString())
                Log.e("Yönetmen ad",yonetmen_ad)
                Log.e("********","********")
            }


        }catch (e:JSONException){
            e.printStackTrace()
        }


    }
}
