
package com.example.irsyadjava;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.andihasan7.lib.irsyadulmurid.AwalBulan.IrsyadBulan;
import com.andihasan7.lib.konversi.Konversi;
import com.example.irsyadjava.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate and get instance of binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        // set content view to binding's root
        setContentView(binding.getRoot());
        
        IrsyadBulan bulan = new IrsyadBulan(
            9,
            1445,
            -7.433333334,
            111.433333333334,
            7,
            150,
            true
            );
        
        Double tHilal = bulan.tinggiHakiki();
        
        Konversi hilal = new Konversi();
        String h = hilal.toDegreeFullRound2(tHilal);
        
        binding.hasil.setText(h);
        
        
        
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }
}
