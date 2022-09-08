public final class ArrayBag<T> implements BagInterface<T> {

  public ArrayBag(){
    this(DEFAULT_CONSTRUCTOR);
  }

  public ArrayBag(int initialCapacity){
    //TODO
  }

  //Copy constructor
  public ArrayBag(ArrayBag<T> other){
    //TODO
  }

    /** Adds an item to the bag if possible
    * @param item the item to be added
    * @return true if adding was sucessful, or false otherwise
    */
    public boolean add(T item) {
      boolean result = false;
      if (bag.length > numberOfItems){ // checks if array has room for items
        bag[numberOfItems] = item; // if so, adds item to array and increases item count
        numberOfItems++;
        result = true;
      }
      return result; // returns based on whether items were added or not
    }
  

  /** Removes an aribtrary instance of a given item from the bag.
    * @param item the item to be removed
    * @return the removed item, or null if item is not in the bag
    */
  public T remove(T item){
    //TODO
    return null;
  }

  public T remove(){
    //TODO
    return null;
  }


  public int size(){
    return 0;
  }

  public boolean isEmpty(){
    return false;
  }

  public boolean isFull() {
    return false;
  }

  public int getFrequencyOf(T item) {
    return 0;
  }

  public void clear(){
  }

  public T[] toArray(){
    T[] result = (T[]) new Object[numberOfItems]; // creates temporary array for security purposes // fill based on logical size, not physical size
    for(int i=0; i<numberOfItems; i++){
      result[i] =bag[i]; // creates a shallow copy of every item in the bag
  }

  public boolean contains(T item){
    return false;
  }



  public BagInterface<T> intersection(BagInterface<T> anotherBag){
    
    return null;
  }

public BagInterface<T> union(BagInterface<T> anotherBag){
    return null;
}

public BagInterface<T> difference(BagInterface<T> anotherBag){
 return null;
}

  private void checkCapacity(int capacity){
    
  }

  private void checkIntegrity(){
    
  }

  private int indexOf(T item){
    return 0;
  }
}
