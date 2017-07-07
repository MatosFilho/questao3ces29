package br.ita.questao3ces29;

public abstract class Controller {

	private Person model;
	private PersonView view;

	public void setController(Person model, PersonView view) {
		this.model = model;
		this.view = view;
	}

	public void setName(String name) {
		model.setName(name);
	}

	public String getName() {
		return model.getName();
	}

	public void setRollNo(String rollNo) {
		model.setRollNo(rollNo);
	}

	public String getRollNo() {
		return model.getRollNo();
	}

	public void updateView() {
		view.printDetails(model.getName(), model.getRollNo());
	}
	
}
