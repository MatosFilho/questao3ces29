package br.ita.questao3ces29;

public class MVCPatternDemo {
	public static void main(String[] args) {

		// fetch student record based on his roll no from the database
		Student model = retriveStudentFromDatabase();
		// Create a view : to write student details on console
		StudentView view = new StudentView();
		Controller controller = ControllerFactory.buildController("Student");
		controller.setController(model, view);
		controller.updateView();
		// update model data
		controller.setName("John");
		controller.updateView();
	
		// fetch student record based on his roll no from the database
		Professor modelp = retriveProfessorFromDatabase();
		// Create a view : to write student details on console
		ProfessorView viewp = new ProfessorView();
		Controller controllerp = ControllerFactory.buildController("Professor");
		controllerp.setController(modelp, viewp);
		controllerp.updateView();
		// update model data
		controllerp.setName("Senhor Madruga");
		controllerp.updateView();
	}

	private static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
	
	private static Professor retriveProfessorFromDatabase() {
		Professor prof = new Professor();
		prof.setName("Professor Girafalis");
		prof.setRollNo("1");
		return prof;
	}
	

}