package FileHandling;

import java.io.*;
public class Student implements Serializable {
	String name;
	int id;
	Student(){
		
	}
	Student(String  name,int id){
		this.name=name;
		this.id=id;
	}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Student s = new Student("Tanu",2);
		File f1 = new File("D:\\JavaFileHandling","Class.ser");
		f1.createNewFile();
		
		//Serialization
		FileOutputStream fio = new FileOutputStream(f1);
		ObjectOutputStream out = new ObjectOutputStream(fio);
		out.writeObject(s);
		
		//Desrialization
		FileInputStream fii = new FileInputStream(f1);
		ObjectInputStream in = new ObjectInputStream(fii);
		Student s1 = (Student) in.readObject();
		
		System.out.println(s.name);
		System.out.println(s.id);
		in.close();
		
	}

}
