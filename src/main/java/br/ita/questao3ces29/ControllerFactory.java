package br.ita.questao3ces29;

public class ControllerFactory {
	public static Controller buildController (String type) {
		Controller control = null;
		Class<?> c;
		try {
			c = Class.forName("exe03v2."+type+"Controller");
			control = (Controller) c.newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return control;
	}
}
