package helloworldmvc.controller;

import helloworldmvc.Contract.IModel;
import helloworldmvc.Contract.IView;

public class Controller {
    private final IView view;
    private final IModel model;
    
    public Controller(final IView v, final IModel m) {
        view = v;
        model = m;
    }
    
    public void run() {
        this.view.displayMessage(model.getHelloWorld());
    }
}
