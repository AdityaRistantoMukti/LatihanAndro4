package com.arm.apk4;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

public class SecondActivity extends AppCompatActivity {
    Button btn_alert1, btn_alert2, btn_alert3;
    AlertDialog.Builder builder;
    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        builder = new AlertDialog.Builder(this);

        btn_alert1 = findViewById(R.id.alert1);
        btn_alert1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               builder.setMessage("Ini Pesan").setCancelable(false)
//                .setPositiveButton("Iya", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        finish();
//                        Toast.makeText(SecondActivity.this, "Anda Memilih Iya",Toast.LENGTH_SHORT).show();
//                    }
//                })
//                .setNegativeButton("Tutup", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        dialog.cancel();
//                    }
//                })
                       .setNeutralButton("Tutup", new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {
                               dialog.cancel();
                           }
                       });
                AlertDialog alertDialog = builder.create();
                alertDialog.setTitle("Maaf Halaman Belum Tersedia");
                alertDialog.show();
            }
        });

        btn_alert2 = findViewById(R.id.alert2);
        btn_alert2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setTitle("Are you Sure Exit?");
                builder.setMessage("Exit this").setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();

                    }
                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
            AlertDialog alertDialog = builder.create();
            alertDialog.show();
            }
        });

        btn_alert3 = findViewById(R.id.alert3);
        btn_alert3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                builder.setTitle("Warning");
                builder.setMessage("Are you Really Sure to exit??").setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();

                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                        .setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });

                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });






        
    }
}
