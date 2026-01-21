package FileHandling;

import java.io.*;

public class Example {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File folder = new File("D:\\JavaFileHandling");
		folder.mkdir();
		File f1 = new File(folder,"Student.txt");
		try {
		f1.createNewFile();
		}catch(Exception e) {
			e.getStackTrace();
		}
		if(folder.exists()) {
			File[] list = folder.listFiles();
			for(int i=0;i<list.length;i++) {
				System.out.println(list[i].getName());
			}
		}
		///Write Data
		FileWriter writer= new FileWriter(f1);
		writer.write("Hello");
		writer.close();
		
		//Write Data in another way
		BufferedWriter bw = new BufferedWriter(new FileWriter(f1));
		bw.write("Hello Student"); 
		bw.newLine();
		bw.write(" Welcome to LPU");
		bw.close();
		////Read in file
		BufferedReader br = new BufferedReader(new FileReader(f1));
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
	}  

}
