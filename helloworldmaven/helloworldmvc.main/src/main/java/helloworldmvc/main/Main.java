package helloworldmvc.main;

import helloworldmvc.controller.Controller;
import helloworldmvc.model.Model;
import helloworldmvc.view.View;

public class Main {

	public static void main(String[] args) {
		View uneVue = new View();
		Model unModele = new Model();
		Controller unController = new Controller(uneVue, unModele);
		unController.run();
	}

}
