package com.yandex.kbelyako;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		CharFreq a = new CharFreq('d', 5);

		CharFreq b = new CharFreq('e', 7);

		CharFreq c = new CharFreq('t', 2);

		ArrayList<CharFreq> test = new ArrayList<CharFreq>();

		test.add(a);
		test.add(c);
		test.add(b);

		System.out.println(test);
		Collections.sort(test);
		System.out.println(test);
		String res = "";
		try (BufferedReader f = new BufferedReader(new FileReader("d.txt"))) {
			String str = "";
			String str1 = "";
			for (; (str1 = f.readLine()) != null;) {
				str = str1 + str;

			}
			res = str;
		} catch (IOException e) {
			System.out.println("ERROR");
		}
String res1=FiletoString("d.txt");
		System.out.println(res);
		System.out.println(res1);
		char[] charArray = res.toCharArray();
		String alphabetString = "abcdefghijklmnopqrstuvwxyz";
		char[] alphabet = alphabetString.toCharArray();

		ArrayList<CharFreq> alphabetList = new ArrayList<CharFreq>();

		for (int i = 0; i < alphabet.length; i++) {
			CharFreq tmp = new CharFreq(' ', 0);
			tmp.setCharM(alphabet[i]);
			alphabetList.add(tmp);
		}

		// System.out.println(alphabetList(3));
		System.out.println(alphabetList);
		System.out.println(alphabetList.size());

		for (int i = 0; i < charArray.length; i++) {
			for (int j = 0; j < alphabetList.size(); j++) {
				if (charArray[i] == alphabetList.get(j).getCharM()) {
					int counter = alphabetList.get(j).getFreq() + 1;
					alphabetList.get(j).setFreq(counter);
				}
			}
		}

		Collections.sort(alphabetList);
		System.out.println(alphabetList);

	}

	public static String FiletoString(String fileName) {
		String res = "";
		try (BufferedReader f = new BufferedReader(new FileReader(fileName))) {
			String str = "";
			String str1 = "";
			for (; (str1 = f.readLine()) != null;) {
				str = str1 + str;

			}
			res = str;
		} catch (IOException e) {
			System.out.println("ERROR");
		}

		return res;
	}

}
