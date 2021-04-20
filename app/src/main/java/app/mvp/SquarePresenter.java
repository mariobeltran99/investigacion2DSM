package app.mvp;
//El presentador es que interactua con el modelo y la vista para enviar y recibir datos.
//Las funciones decladas en la interfaz se tienen que declarar aquí.
public class SquarePresenter implements Square.Presenter {
    private Square.View view;
    private Square.Model model;

    public SquarePresenter(Square.View view){
        this.view = view;
        model = new SquareModel(this);
    }
    @Override
    public void showResult(String result) {
        if (view != null){
            view.showResult(result);
        }
    }

    @Override
    public void square(String data) {
        if (view != null){
            model.square(data);
        }
    }

    @Override
    public void showError(String error) {
        if (view != null){
            view.showError(error);
        }
    }
}
