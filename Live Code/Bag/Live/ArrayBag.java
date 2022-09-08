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
      checkIntegrity();
      boolean result = false;
      if (isFull()){ // checks if array has room for items // this. is implied because code is within the class
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
    return numberOfItems;
  }

  public boolean isEmpty(){
    return numberOfItems == 0; //true when items is 0, false otherwise
  }

  public boolean isFull() {
    return numberOfItems >= bag.length;
  }

  public int getFrequencyOf(T item) {
    return 0;
  }

  public void clear(){
    while(!isEmpty){
      remove();
  }

  public T[] toArray(){
    checkIntegrity();
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
    if(capacity > MAX_CAPACITY){
      throw new IllegalStateException(s: "Allocation size exceeds size limit of ArrayBag object")
  }

  private void checkIntegrity(){
    if(!initialized){
      throw new SecurityException(s: "Trying to operate on a non-initialized ArrayBag object")
  }

  private int indexOf(T item){
    return 0;
  }
}
