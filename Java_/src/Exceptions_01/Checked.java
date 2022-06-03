package Exceptions_01;

import java.io.IOException;
import java.rmi.RemoteException;

public class Checked {
	
	public static void main(String[] args) throws IOException {
//		int no = 0 ; 
////	    if ( no != 0) {
//	       int i = 3 / no ;
//	    } 
	    deposit(5);
	}
	
	public static void deposit(double amount) throws RemoteException{
	    // Method implementation
	    throw new RemoteException();
	}
	
}
