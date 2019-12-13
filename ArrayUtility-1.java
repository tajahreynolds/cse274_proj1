/* 
 * Parts of the program that work correctly:
 * All parts of this program work correctly.
 * 
 * Parts of the program that do not work correctly:
 * No part of this program does not work correctly.
 */
public class ArrayUtility implements UtilityInterface<Integer> {
	// An array to store multiple objects of the Integer class
	private Integer[] array;
	// An integer index which always points to the first available location in the array.
	private int last;
	// An integer constant which denotes the default capacity of the array.
	public static final int DEFAULT_CAPACITY = 10;
	
	/** The default constructor which initializes the array with the default capacity	*/
	public ArrayUtility() {
		last = 0;
		array = new Integer[DEFAULT_CAPACITY];
	}
	
	/**
	 * A parameterized constructor which initializes the array with the specified capacity
	 * @param capacity The capacity of the array
	 */
	public ArrayUtility(int capacity) {
		last = 0;
		array = new Integer[capacity];
	}
	
	public boolean add(Integer anElement) {
		if (last >= array.length) {
			return false;
		}
		array[last++] = anElement;
		return true;
	}
	
	public boolean add(Integer anElement, int index) {
		if (last >= array.length || index > last) {
			return false;
		}
		for (int i = last; i > index; i--) {
			array[i] = array[i-1];
		}
		array[index] = anElement;
		last++;
		return true;
	}
	
	public void clear() {
		while (!this.isEmpty()) {
			removeLast();
		}
	}
	
	public boolean contains(Integer anElement) {
		if (this.isEmpty()) {
			return false;
		}
		for (int i = 0; i < last; i++) {
			if (array[i].equals(anElement))
				return true;
		}
		return false;
	}
	
	public Integer get(int index) {
		if (index < 0 || index > array.length)
			return null;
		return array[index];
	}
	
	public int getCurrentSize() {
		return last;
	}
	
	public int getFrequencyOf(Integer anElement) {
		if (this.isEmpty()) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < last; i++) {
			if (array[i].equals(anElement))
				count++;
		}
		return count;
	}
	
	public int indexOf(Integer anElement) {
		if (this.contains(anElement)) {
			for (int i = 0; i < last; i++) {
				if (array[i].equals(anElement))
					return i;
			}
		}
		return -1;
	}
	
	public boolean isEmpty() {
		return last == 0;
	}
	
	public boolean remove(Integer anElement) {
		if (this.contains(anElement)) {
			array[this.indexOf(anElement)] = array[--last];
			array[last] = null;
			return true;
		}
		return false;
	}
	
	public boolean removeFirst() {
		if (!this.isEmpty()) {
			array[0] = array[--last];
			array[last] = null;
			return true;
		}
		return false;
	}
	
	public boolean removeLast() {
		if (!this.isEmpty()) {
			array[--last] = null;
			return true;
		}
		return false;
	}
	
	public boolean removeMiddle() {
		if (!this.isEmpty()) {
			array[(last-1)/2] = array[last-1];
			array[--last] = null;
			return true;
		}
		return false;
	}
	
	public void reverse() {
		Integer[] copy = new Integer[last];
		for (int i = 0; i < last; i++) {
			copy[last-1-i] = array[i];
		}
		for (int i = 0; i < last; i++) {
			array[i] = copy[i];
		}
	}
}
