package app.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


//Es la vista donde recibiremos datos y motrarlos y se comunica con el presentador.
//En la vista van los componentes UI y la carga del layout.
public class SquareView extends AppCompatActivity implements Square.View {

    TextView tvResult;
    EditText edtNumber;
    private Square.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.txResult);
        edtNumber = findViewById(R.id.edtNumber);
        presenter = new SquarePresenter(this);
    }
    public void Process(View view){
        presenter.square(edtNumber.getText().toString());
    }

    @Override
    public void showResult(String result) {
        tvResult.setText(result);
    }

    @Override
    public void showError(String error) {
        tvResult.setText(error);
    }
}