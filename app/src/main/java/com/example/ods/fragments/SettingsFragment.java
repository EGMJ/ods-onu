package com.example.ods.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.example.ods.R;

public class SettingsFragment extends Fragment {

//    private Button btnSair;

    public SettingsFragment() {
        // Construtor público vazio necessário
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Infla o layout para este fragmento
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

//        // Referência para o botão "Sair"
//        btnSair = view.findViewById(R.id.btnSair);
//
//        // Configuração do clique do botão "Sair"
//        btnSair.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                // Encerra a atividade que contém o fragmento
//                if (getActivity() != null) {
//                    getActivity().finish();
//                }
//            }
//        });
//
        return view; // Retorna a view inflada
    }
}
