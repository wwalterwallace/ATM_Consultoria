package com.example.atmconsultoria.ui.sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 */
public class SobreFragment extends Fragment {

    public SobreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String descricao = "bla bla bla bla bla bla bla bla bla bla bla bla" +
                "bla blabla blabla blabla blabla blabla blabla blabla blabla bla";

        Element versao = new Element();
        versao.setTitle("Versão 1.0.1");

        return new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(descricao)

                .addGroup("Entre em contato")
                .addEmail("atendimento@atmconsultoria.com.br", "Envie um e-mail")
                .addWebsite("https://www.google.com", "Acesse nosso site")

                .addGroup("Redes Sociais")
                .addFacebook("jamiltondamasceno", "Facebook")
                .addInstagram("jamiltondamasceno", "Instagram")
                .addTwitter("jamiltondamasceno", "Twitter")
                .addYoutube("jamiltondamasceno", "Youtube")
                .addGitHub("jamiltondamasceno", "Github")
                .addPlayStore("com.facebook.katana", "Download APP")

                .addItem(versao)

                .create();


        //return inflater.inflate(R.layout.fragment_sobre, container, false);
    }
}
