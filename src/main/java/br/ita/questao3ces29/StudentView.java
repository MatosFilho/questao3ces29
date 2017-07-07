package br.ita.questao3ces29;

public class StudentView extends PersonView{
	@Override
	public void printDetails(String studentName, String studentRollNo) {
		System.out.println("Student: ");
		System.out.println("Name: " + studentName);
		System.out.println("Roll No: " + studentRollNo);
	}
}
