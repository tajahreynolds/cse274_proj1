/**
 * A Java interface that describes the utility operations on an array of objects.
 * 
 * @author TaJah
 *
 * @param <T>
 */
public interface UtilityInterface<T> {

	/**
	 * Adds an element to the first available location/index of the array
	 * @param anElement The element to add to the array
	 * @return True if the element can be added to the array, false otherwise
	 */
	public boolean add(T anElement);
	
	/**
	 * Adds an element to the specified location/index of the array/ If it is 
	 * already occupied then shift the elements to the right by one position 
	 * and add the new element. If the index is greater than the number of 
	 * elements currently in the array then don't add and return false
	 * @param anElement The element to add to the array
	 * @param index The index or location to add the element
	 * @return True if the element can be added to the array, false otherwise
	 */
	public boolean add(T anElement, int index);
	
	/** Removes all the elements from the array 	*/
	public void clear();
	
	/**
	 * Check to see whether the array has the specified element
	 * @param anElement The element to be found in the array
	 * @return True if the array contains anElement, and false otherwise
	 */
	public boolean contains(T anElement);
	
	/**
	 * Gets the object at the specified index
	 * @param index An integer index of the array
	 * @return The object at the specified index if it is a valid index, and null otherwise
	 */
	public T get(int index);
	
	/**
	 * Gets the current number of elements in the array
	 * @return An integer, number of elements currently in the array
	 */
	public int getCurrentSize();
	
	/**
	 * Finds the frequency of a given element
	 * @param anElement The given object (element)
	 * @return The total number of times the given element is in the array
	 */
	public int getFrequencyOf(T anElement);
	
	/**
	 * Gets the index of the first occurrence of the specified element in the array
	 * @param anElement - The given object (element)
	 * @return An integer, index in the array if found, and -1 otherwise
	 */
	public int indexOf(T anElement);
	
	/**
	 * Checks whether the array is empty
	 * @return True if array is empty (has no elements), and false otherwise
	 */
	public boolean isEmpty();
	
	/**
	 * Removes the first occurrence of the specified element
	 * @param anElement The element to remove from the array
	 * @return True if the element can be removed from the array, false otherwise.
	 */
	public boolean remove(T anElement);
	
	/**
	 * Removes the first element from the array if there is any.
	 * @return True if the first element can be removed from the array, false otherwise. 
	 */
	public boolean removeFirst();
	
	/**
	 * Removes the last element from the array if there is any.
	 * @return True if the last element can be removed from the array, false otherwise. 
	 */
	public boolean removeLast();
	
	/**
	 * Removes the middle element from the array if there is any.
	 * @return True if the middle element can be removed from the array, false otherwise. 
	 */
	public boolean removeMiddle();
	
	/** Reverses the current order of the elements in the array 	*/
	public void reverse();
	
}
