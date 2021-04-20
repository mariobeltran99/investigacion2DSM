package app.mvp;

//Se crea una interfaz del objeto y se crean las funciones para las vistas
//presentador y el modelo.
public interface Square {
    interface View{
        void showResult(String result);
        void showError(String error);
    }
    interface Presenter{
        void showResult(String result);
        void square(String data);
        void showError(String error);
    }
    interface Model{
        void square(String data);
    }
}
