/** A  Java  class  that  has  a  main  method  and  creates  objects  of ArrayUtility  class and tests its  methods. */
public class ArrayUtilityDriver {
	public static void main(String[] args) {
		ArrayUtility array = new ArrayUtility();
		
		// Testing with no items in the array
		// Methods tested: isEmpty() contains() removeFirst() removeLast() removeMiddle() getFrequencyOf() get() indexOf()
		System.out.println(array.isEmpty()); // T
		System.out.println(array.contains(1)); // F
		System.out.println(array.removeFirst()); // F
		System.out.println(array.removeLast()); // F
		System.out.println(array.removeMiddle()); // F
		System.out.println(array.getFrequencyOf(1)); // 0
		System.out.println(array.get(0)); // null
		System.out.println(array.indexOf(1)); // -1
		System.out.println();
		
		//Testing with items in the array
		// Methods tested: add()
		System.out.println(array.add(1)); // T
		System.out.println(array.add(0)); // T
		System.out.println(array.add(1)); // T
		System.out.println(array.add(2)); // T
		System.out.println(array.add(0)); // T
		System.out.println(array.add(1)); // T
		System.out.println();
		
		// Methods tested: reverse()
		array.reverse();
		System.out.println(array.get(0)); // 1
		System.out.println(array.get(1)); // 0
		System.out.println(array.get(2)); // 2
		System.out.println(array.get(3)); // 1
		System.out.println(array.get(4)); // 0
		System.out.println(array.get(5)); // 1
		array.reverse();
		System.out.println();
		
		// Methods tested: getCurrentSize()
		System.out.println(array.getCurrentSize()); // 6
		System.out.println(array.isEmpty()); // F
		System.out.println(array.contains(null)); // F
		System.out.println(array.contains(0)); // T
		System.out.println(array.getFrequencyOf(1)); // 3
		System.out.println(array.get(3)); // 2
		System.out.println();
		
		System.out.println(array.indexOf(2)); // 3
		array.reverse();
		System.out.println(array.indexOf(2)); // 2
		System.out.println();
		
		// Methods tested: add(Integer, Index)
		System.out.println(array.add(4)); // T
		System.out.println(array.add(3, 3)); // T
		System.out.println(array.add(10, 10)); // F
		System.out.println(array.add(9)); // T
		System.out.println(array.add(9, 9)); // T
		System.out.println();
		
		System.out.println(array.getCurrentSize()); // 10
		System.out.println(array.add(1)); // F
		System.out.println(array.add(1, 1)); //F
		System.out.println();
		
		System.out.println(array.get(4));
		System.out.println(array.removeMiddle()); // T
		System.out.println(array.get(4));
		System.out.println();
		
		System.out.println(array.get(8));
		System.out.println(array.removeLast()); // T
		System.out.println(array.getCurrentSize()); // 8
		System.out.println(array.get(7));
		System.out.println();
		
		// Methods tested: remove()
		System.out.println(array.get(0));
		System.out.println(array.getFrequencyOf(1)); // 2
		System.out.println(array.removeFirst()); // T
		System.out.println(array.get(0));
		System.out.println(array.getFrequencyOf(1)); // 1
		System.out.println(array.remove(1)); // T
		System.out.println();
		
		// Methods tested: clear()
		array.clear();
		System.out.println(array.getCurrentSize()); // 0
	}
}
