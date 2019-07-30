package com.yandex.kbelyako;

import java.io.BufferedReader;
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

		System.out.println(res);

		char[] array = res.toCharArray();

		char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		ArrayList<CharFreq> alphabetList = new ArrayList<CharFreq>();

		CharFreq tmp = new CharFreq(' ', 0);

		for (int i = 0; i < alphabet.length; i++) {
			// System.out.println(alphabet[i]);
			tmp.setCharM(alphabet[i]);

			// System.out.println(tmp);
			alphabetList.add(tmp);

			// System.out.println(alphabetList);

		}
		System.out.println(alphabetList);
		System.out.println(alphabetList.size());

	}

}
