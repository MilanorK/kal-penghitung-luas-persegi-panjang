package id.sch.smktelkom_mlg.tugas01.xirpl308.hitungenergipotensial;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText Massa, Gravitasi, Tinggi;
    Button Hasil;
    TextView HasilHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Massa = findViewById(R.id.etmassa);
        Gravitasi = findViewById(R.id.etgravitasi);
        Tinggi = findViewById(R.id.ettinggi);
        Hasil = findViewById(R.id.bbutton);
        HasilHitung = findViewById(R.id.tvhasil);
        Hasil.setOnClickListener(this);

    }

    public void onClick(View view) {

        if (view.getId() == R.id.bbutton) {

            String massa = Massa.getText().toString();
            String gravitasi = Gravitasi.getText().toString();
            String tinggi = Tinggi.getText().toString();

            Double dmassa = Double.parseDouble(massa);
            Double dgravitasi = Double.parseDouble(gravitasi);
            Double dtinggi = Double.parseDouble(tinggi);

            Double hitung = dmassa * dgravitasi * dtinggi;

            HasilHitung.setText("Energi Potensial-nya adalah " + hitung + " Joule");

        }
    }

}
