package project1;


public class Validation {

	public static int validate()
	{
		appointment t = new appointment();
		String cnic = t.txtcnic.getText();
		System.out.println(cnic);
		if(cnic.matches("[0-9]{5}-[0-9]{7}-[0-9]{1}"))
			return 0;
		else
			return 1;
	}
}