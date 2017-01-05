package org.noel.markham.basics;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class Generics {
	
	private class GenericStack<E> {
		private final List<E> values;

		public GenericStack() {
			values = new LinkedList<E>();
		}

		public void push(final E element) {
			values.add(0, element);
		}

		public E pop() {
			if (values.size() == 0) {
				return null;
			}
			return values.remove(0);
		}
	}

	@Test
	public void pushTest() {
		GenericStack<String> stringStack = new GenericStack<String>();
		stringStack.push("One");
		stringStack.push("Two");
		String value = stringStack.pop();
		assertEquals(value,"Two");
		
	}

}
