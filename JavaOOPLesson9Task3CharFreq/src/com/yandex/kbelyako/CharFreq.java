package com.yandex.kbelyako;

import java.util.Comparator;

public class CharFreq implements Comparable <CharFreq> {
	
	private char charM;
	private int freq;
	
		
	public CharFreq() {
		super();
		
	}
	public CharFreq(char charM, int freq) {
		super();
		this.charM = charM;
		this.freq = freq;
	}
	public char getCharM() {
		return charM;
	}
	public void setCharM(char charM) {
		this.charM = charM;
	}
	public int getFreq() {
		return freq;
	}
	public void setFreq(int freq) {
		this.freq = freq;
	}
	 
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}
	@Override
	public boolean equals(Object arg0) {
		
		return super.equals(arg0);
	}
	@Override
	protected void finalize() throws Throwable {
		
		super.finalize();
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	@Override
	public String toString() {
		return "CharFreq [charM=" + charM + ", freq=" + freq + "]";
	}
	@Override
	public int compareTo(CharFreq o) {
		
	
	//	return Math.abs(this.freq)-Math.abs(o.getFreq());
		return Math.abs(o.getFreq())-Math.abs(this.freq);
	}

	
	

}
