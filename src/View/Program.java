package View;

import Presenter.Presenter;
import model.CommonModel;

public class Program {

    public static void main(String[] args) {

        Presenter presenter = new Presenter(new UI(), new CommonModel());

        presenter.runOperation();

    }
}