package com.avatar.model;

import java.io.Serializable;
import java.util.List;

public class Pokemon implements Serializable{
	
	
	private int count;
	private String next;
	private String previous;
	
	private List<Results> lstResults;
	
	
	
	public Pokemon() {}

	
	public Pokemon(int count, String next, String previous, List<Results> lstResults) {
		super();
		this.count = count;
		this.next = next;
		this.previous = previous;
		this.lstResults = lstResults;
	}
	
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}


	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}


	public String getPrevious() {
		return previous;
	}
	public void setPrevious(String previous) {
		this.previous = previous;
	}


	public List<Results> getLstResults() {
		return lstResults;
	}
	public void setLstResults(List<Results> lstResults) {
		this.lstResults = lstResults;
	}

}
