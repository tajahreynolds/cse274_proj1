import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestArrayUtility {

	@Test
	void testAddInteger() {
		ArrayUtility array = new ArrayUtility();
		assertTrue(array.add(1));
		for (int i = 1; i < 10; i++) {
			array.add(1);
		}
		assertFalse(array.add(1));
		array.remove(1);
		assertTrue(array.add(1));
		array.clear();
		assertTrue(array.add(1));
	}

	@Test
	void testAddIntegerInt() {
		ArrayUtility array = new ArrayUtility();
		assertFalse(array.add(0, 1));
		assertTrue(array.add(0, 0));
		assertTrue(array.add(1, 0));
		for (int i = 2; i < 10; i++) {
			array.add(1);
		}
		assertFalse(array.add(1, 5));
		array.remove(1);
		assertTrue(array.add(1, 5));
	}

	@Test
	void testClear() {
		ArrayUtility array = new ArrayUtility();
		array.add(1);
		assertEquals(array.getCurrentSize(), 1);
		array.clear();
		assertEquals(array.getCurrentSize(), 0);
		for (int i = 0; i < 10; i++) {
			array.add(1);
		}
		array.clear();
		assertEquals(array.getCurrentSize(), 0);
	}

	@Test
	void testContains() {
		ArrayUtility array = new ArrayUtility();
		assertFalse(array.contains(1));
		array.add(1);
		assertTrue(array.contains(1));
		array.removeFirst();
		assertFalse(array.contains(1));
	}

	@Test
	void testGet() {
		ArrayUtility array = new ArrayUtility();
		assertEquals(array.get(0), null);
		array.add(1);
		assertTrue(array.get(0).equals(1));
	}

	@Test
	void testGetCurrentSize() {
		ArrayUtility array = new ArrayUtility();
		array.add(1);
		array.add(1);
		array.add(1);
		assertEquals(array.getCurrentSize(), 3);
		array.clear();
		assertEquals(array.getCurrentSize(), 0);
	}

	@Test
	void testGetFrequencyOf() {
		ArrayUtility array = new ArrayUtility();
		array.add(1);
		assertEquals(array.getFrequencyOf(1), 1);
		assertEquals(array.getFrequencyOf(0), 0);
		array.add(3);
		array.add(1);
		array.add(0);
		assertEquals(array.getFrequencyOf(1), 2);
		assertEquals(array.getFrequencyOf(0), 1);
	}

	@Test
	void testIndexOf() {
		ArrayUtility array = new ArrayUtility();
		assertEquals(array.indexOf(0), -1);
		array.add(3);
		assertEquals(array.indexOf(3), 0);
		array.add(3);
		array.add(1);
		assertEquals(array.indexOf(3), 0);
		assertEquals(array.indexOf(1), 2);
	}

	@Test
	void testIsEmpty() {
		ArrayUtility array = new ArrayUtility();
		assertTrue(array.isEmpty());
		array.add(1);
		assertFalse(array.isEmpty());
		array.clear();
		assertTrue(array.isEmpty());
	}

	@Test
	void testRemove() {
		ArrayUtility array = new ArrayUtility();
		array.add(1);
		assertTrue(array.remove(1));
		assertFalse(array.remove(1));
	}

	@Test
	void testRemoveFirst() {
		ArrayUtility array = new ArrayUtility();
		assertFalse(array.removeFirst());
		array.add(0);
		array.add(1);
		assertTrue(array.removeFirst());
		assertFalse(array.contains(0));
		assertTrue(array.contains(1));
		array.add(2);
		assertTrue(array.removeFirst());
		assertFalse(array.contains(1));
	}

	@Test
	void testRemoveLast() {
		ArrayUtility array = new ArrayUtility();
		assertFalse(array.removeLast());
		array.add(0);
		array.add(1);
		assertTrue(array.removeLast());
		assertFalse(array.contains(1));
		array.add(1, 0);
		assertTrue(array.removeLast());
		assertFalse(array.contains(0));
	}

	@Test
	void testRemoveMiddle() {
		ArrayUtility array = new ArrayUtility();
		assertFalse(array.removeMiddle());
		array.add(0);
		assertTrue(array.removeMiddle());
		assertFalse(array.contains(0));
		array.add(0);
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(7);
		array.add(8);
		array.add(9);
		assertTrue(array.removeMiddle());
		assertFalse(array.contains(4));
		}

	@Test
	void testReverse() {
		ArrayUtility array = new ArrayUtility();
		array.add(0);
		array.add(1);
		array.add(2);
		array.add(3);
		array.reverse();
		for (int i = 0; i < array.getCurrentSize(); i++) {
			assertTrue(array.get(i).equals(3-i));
		}
		array.reverse();
		array.add(4);
		array.add(5);
		array.add(6);
		array.add(7);
		array.add(8);
		array.add(9);
		array.reverse();
		for (int i = 0; i < 10; i++) {
			assertTrue(array.get(i).equals(9-i));
		}
	}

}
