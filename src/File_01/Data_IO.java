package File_01;

import java.io.*;

public class Data_IO {

	public static void main(String[] args) throws IOException { 
	    ByteArrayOutputStream bout = new ByteArrayOutputStream(); 
	    DataOutputStream dout = new DataOutputStream(bout); 
	    
	    String name = "xxy"; 
//	    String name2 = "x"; 

	    int age = 84; 
//	    int date = 100000;
	    dout.writeUTF(name); 
//	    dout.writeUTF(name2); 

	    dout.writeInt(age); 
//	    dout.writeInt(date);
	    
	    byte[] buff = bout.toByteArray(); 
	    
	    ByteArrayInputStream bin = new ByteArrayInputStream(buff); 
	    DataInputStream dis = new DataInputStream(bin); 
	    
	    String newName = dis.readUTF(); 
	    int newAge = dis.readInt(); 
//	    int newDate = dis.readInt();
	    
	    System.out.println(newName + ":" + newAge); 
//	    System.out.println(newDate);
	}
}
