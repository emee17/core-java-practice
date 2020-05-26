package org.codingo;

import java.util.Optional;

public class OptionalUse {

	public static void main(String[] args) {
		
		Integer val = null;
		Integer val2 = 5;
		
		Optional<Integer> oVal = Optional.ofNullable(val);
		Optional<Integer> oVal2 = Optional.of(val);
		
		System.out.println(oVal);
		System.out.println(oVal2);
		
	}

}
