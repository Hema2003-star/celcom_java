package com.day8;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {
	public static void main(String[] args) throws IOException {
		
		FileInputStream fi = new FileInputStream("D://santa.jpg");
		FileOutputStream fo = new FileOutputStream("D://santa1.jpg");
		
		
		int ch ;
		while((ch = fi.read()) != -1) {
			fo.write(ch);	
			
		}
		
		fi.close();
		fo.close();
		System.out.println("image copied");
		
	}

}
