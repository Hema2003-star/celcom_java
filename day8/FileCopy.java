package com.day8;

import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class FileCopy {
	public static void main(String[] args) throws IOException {
		
				
				FileReader fr = new FileReader("D://filereader.txt");
				FileWriter fw = new FileWriter("D://filereader1.txt");
				FileReader fr1 = new FileReader("D://filereader1.txt");
				
				int ch ;
				while((ch = fr.read()) != -1) {
					fw.write(ch);
					
					
				}
				int ch1;
				while((ch1 = fr1.read()) != -1) {
					System.out.println((char)ch1);
									
				}
				
				fr.close();
				fw.close();
				fr1.close();
				System.out.println("file copied");
				
			}

		}
