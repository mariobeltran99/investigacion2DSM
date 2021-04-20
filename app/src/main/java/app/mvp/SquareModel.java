package app.mvp;

//Practicamente es el objeto donde se implementan las funciones creadas en la interfaz.
//El modelo se comunica con el presentador.
public class SquareModel implements Square.Model {
    private Square.Presenter presenter;
    private double result;

    public SquareModel(Square.Presenter presenter){
        this.presenter = presenter;
    }

    @Override
    public void square(String data) {
        if (data.equals("")){
            presenter.showError("Campo Vacío");
        }else {
            result = Double.parseDouble(data) * Double.parseDouble(data);
            presenter.showResult(String.valueOf(result));
        }
    }
}
