package br.ita.questao3ces29;

public class ProfessorView extends PersonView{
	
	@Override
	public void printDetails(String personName, String personRollNo) {
		System.out.println("Professor: ");
		System.out.println("Name: " + personName);
		System.out.println("Roll No: " + personRollNo);
	}
}
