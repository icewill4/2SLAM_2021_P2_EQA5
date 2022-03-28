package com.example.a2slam_2021_p2_eq5;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class NewReservationActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservationresto);

        Intent intent = getIntent();
        long idResto = intent.getLongExtra("IdResto",0);


        Toast.makeText(getApplicationContext(), "resto :" + idResto, Toast.LENGTH_LONG).show();



//        final Spinner listDeroulanteRestos
//
//        //programmation des boutons enregistrer et quitter
//        Button btnEnregistrerReservation = findViewById(R.id.btnEnregistrerReservation);
//        Button btnQuitterReservation = findViewById(R.id.btnQuitterReservation);
//
//
//
//        //récupération des données saisies
//        final EditText nom = findViewById(R.id.Nom);
//
//        final EditText prenom = findViewById(R.id.Prénom);
//
//        final EditText tel = findViewById(R.id.Tel);
//
//        final EditText horaire = findViewById(R.id.Horaire);
//
//        final EditText nbpersonne = findViewById(R.id.Nbpersonnes);
//
//
//        //on place un écouteur dessus
//        View.OnClickListener ecouteur = new View.OnClickListener() {
//            //on implémente la méthode onclick
//            @Override
//            public void onClick(View v) {
//                switch (v.getId()) {
//                    case R.id.btnEnregistrerReservation:
//                        Toast.makeText(getApplicationContext(), "enregistrement du nouveau client !", Toast.LENGTH_LONG).show();
//                        Reservation unereservation = new Reservation(nom.getText().toString(), prenom.getText().toString(), tel.getText().toString(), horaire.getText().toString(),nbpersonne.getText().toString());
//
//                        //le curseur pour afficher le nombre de clients dans la base
//
//
//
//                        finish();
//                        break;
//                    case R.id.btnQuitterReservation:
//                        finish();
//                        break;
//
//                }
//            }
//        };
//        //on affecte au bouton l'écouteur
//        btnEnregistrerReservation.setOnClickListener(ecouteur);
//        btnQuitterReservation.setOnClickListener(ecouteur);

    }
}
