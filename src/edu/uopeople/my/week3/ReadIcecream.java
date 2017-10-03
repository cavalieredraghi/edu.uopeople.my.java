package edu.uopeople.my.week3;

import java.util.ArrayList;
import java.util.Collection;
import java.io.*;

public class ReadIcecream {
	public static void main(String[] args) {
		ReadIcecream readIcecream = new ReadIcecream();

		final Collection<Items> flavors = readIcecream.loadIcecream("icecream.dat");
		for (Items flavor : flavors) {
			System.out.println(flavor.getName());
		}
	}

	public Collection<Items> loadIcecream(String filename) {
		final File icecreamFile = new File(filename);
		final Collection<Items> flavors = new ArrayList<>();
		final InputStream recipeStream;
		try {
			recipeStream = new FileInputStream(icecreamFile);
		} catch (FileNotFoundException e) {
			System.out.println("Couldn't find the file: " + icecreamFile.getAbsolutePath());
			return flavors;
		}
		return flavors;
	}

}