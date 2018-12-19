package br.com.casadocodigo.boaviagem;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class ViagemActivity extends Activity{

    public void selecionarOpcao(View view){

        switch (view.getId()){
            case R.id.nova_imagem:
                startActivity(new Intent(this, ViagemActivity.class));
                break;
        }
    }
}
