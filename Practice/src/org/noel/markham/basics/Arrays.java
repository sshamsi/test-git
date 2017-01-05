package org.noel.markham.basics;

import static org.junit.Assert.*;

import org.junit.Test;

public class Arrays {

	@Test
	public void arrayReferences() {
		final int[] myArray = new int[] { 0, 1, 2, 3, 4, 5 };
		int[] arrayReference2 = myArray;
		arrayReference2[5] = 99;
		assertFalse(myArray[5] == 5);
	}

}
