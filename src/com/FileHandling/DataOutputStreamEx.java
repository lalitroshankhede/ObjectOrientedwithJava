package com.FileHandling;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamEx {

public static void main(String[] args) {
		
		try
		{
			FileOutputStream obj=new FileOutputStream("D:\\fileDemo\\fileOutputstream.txt");
			DataOutputStream dataOutputStream=new DataOutputStream(obj);
			String string="Welcome to java tpoint";
			byte b[]=string.getBytes(); //converting string into byte array
			obj.write(b);
			 
			obj.write(65);
			obj.close();
			System.out.println("Success");
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
}
