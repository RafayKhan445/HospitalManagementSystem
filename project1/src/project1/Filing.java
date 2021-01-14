package project1;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Filing {

	public void writeDetails() throws IOException
	{
		FileWriter fw = new FileWriter("E:/Details.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.newLine();
		bw.write(Show.name);
		bw.newLine();
		bw.write(Show.phone);
		bw.newLine();
		bw.write(Show.cnic);
		bw.newLine();
		bw.write(Show.date);
		bw.newLine();
		bw.write(Show.timings);
		bw.newLine();
		bw.append(Show.type);
		bw.newLine();
		bw.close();
		fw.close();
	}
}