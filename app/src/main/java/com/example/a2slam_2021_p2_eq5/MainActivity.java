package com.example.a2slam_2021_p2_eq5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    //on définit une collection de caractéristiques d'un resto
    ArrayList<Resto> lesRestos = new ArrayList<Resto>();

    //on définit un objet ListView
    ListView listViewRestos;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //on associe l'objet au widget
        listViewRestos = findViewById(R.id.listViewRestos);

        //creation de la requete http sur le serveur local, cela necessite
        OkHttpClient httpclient = new OkHttpClient();

        //prépare la requête
        Request requestClients = new Request.Builder().url(getString(R.string.server) + getString(R.string.location_api)).build();

        httpclient.newCall(requestClients).enqueue(new Callback() {
            @Override
            //si la requête échoue affichage d'un message d'erreur dans les log
            public void onFailure(Call call, IOException e) {
                e.printStackTrace();
                Log.i("erreur1", "erreur requete getAllRestosJSON.php");
            }

            @Override
            //si la requête réussie
            public void onResponse(Call call, Response response) throws IOException {

                final String myResponse = response.body().string();
                MainActivity.this.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            // on crée un objet JSON à partir de notre réponse.
                            JSONObject jsonObjectlesrestos = new JSONObject(myResponse);
                            //on transforme cet objet JSON en array d'objet resto sous forme JSON
                            JSONArray jsonArray = jsonObjectlesrestos.optJSONArray("restos");
                            //on parcours cette collection d'objet restos pour ajouter chaque restos dans notre liste d'objet resto


                            //on efface le contenu de la liste
                            lesRestos.clear();
                            for (int i = 0; i < Objects.requireNonNull(jsonArray).length(); i++) {
                                JSONObject jsonObject = jsonArray.getJSONObject(i);
                                String nomR = jsonObject.getString("nomR");
                                String villeR = jsonObject.getString("villeR");



                                // TO DO
                                Log.i("clients", nomR + " "+villeR+" "); //message qui apparait dans la console pour vérifier
                                // TO DO
                                Resto c = new Resto(nomR, villeR);
                                //on ajoute le client à la collection lesClients
                                lesRestos.add(c);
                            }
                            //on affecte cette liste d'objet clients dans la listeview pour l'afficher
                            ArrayAdapter<Resto> dataAdapter = new ArrayAdapter<Resto>(MainActivity.this, android.R.layout.simple_list_item_1, lesRestos);
                            listViewRestos.setAdapter(dataAdapter);



                        } catch (final JSONException e) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    Log.e("erreur", "Exceptions " + String.valueOf(e));
                                }
                            });
                        }
                    }

                });
            }

            ;
        });

        // on sélectionne un client de la liste et l'on passe son id à l'activity AfficheUnClient

//        listViewRestos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
//
//                Toast.makeText(getApplicationContext(), "id selectionné : " + String.valueOf(id), Toast.LENGTH_LONG).show();
//                Intent intent = new Intent(MainActivity.this, NewReservationActivity.class);
//                intent.putExtra("IDResto", id);
//
//                Toast.makeText(getApplicationContext(), "resto :" + id, Toast.LENGTH_LONG).show();
//
//                startActivity(intent);
//            }
//        });
    }

}