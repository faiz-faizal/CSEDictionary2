package com.maxibi.csedictionary.csedictionary;

import java.util.ArrayList;

public class WordDefinition {
	String word,definition;
	
	public WordDefinition(String word,ArrayList<String> alldefinition) {
		this.word=word;
		
		StringBuilder stringBuilder=new StringBuilder();
		//for each loop
		for (String i : alldefinition) {
			stringBuilder.append(i);
		}		
		this.definition=stringBuilder.toString();
		
	}
	
	public WordDefinition(String word,String alldefinition) {
		this.word=word;		
		this.definition=alldefinition;
		
	}
	
	
}
