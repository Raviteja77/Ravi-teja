package com.Raviteja.EpamHomeTask6;

public class RemoveFisrt2Occurance_A {
	String Remove_a(String string) {
		char firstCharacter = string.charAt(0);
		char secondCharacter = string.charAt(1);
		String result = string;
		if (firstCharacter == 'A' && secondCharacter == 'A')
			result = string.substring(2);
		else if(firstCharacter == 'A')
			result = string.substring(1);
		else if(secondCharacter == 'A')
			result = string.substring(0, 1) + string.substring(2);
		return result;
	}

}
