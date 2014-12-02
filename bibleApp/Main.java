package bibleApp;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import collections.Collection;


public class Main {
	//private Collection[] books;
	//private Command commands;

	public static void main(String args[]) {

		try {
			Runtime rt = Runtime.getRuntime();
			Process pr = rt.exec("cmd /c dir");
			//Process pr = rt.exec("F:\\helloworld.exe");
			

			BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));

			String line=null;

			while((line=input.readLine()) != null) {
				System.out.println(line);
			}

			int exitVal = pr.waitFor();
			System.out.println("Exited with error code "+exitVal);

		} catch(Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
		}
	}
}

