def RecursiveBinarySearch(arr: Array[Int],
                          Element_to_Search: Int)
                         (low: Int = 0,
                          high: Int = arr.length - 1): Int =
{
  if(low>=high) None
  val middle = (low+high)/2

  if(arr(middle) == Element_to_Search) middle
  else if(arr(middle)>Element_to_Search) RecursiveBinarySearch(arr, Element_to_Search)(low, middle -1)
  else RecursiveBinarySearch(arr, Element_to_Search)(middle+1, high)
}

def logBinarySearch(sortedArray: Array[Int], toFind: Int): Unit = {
  def index = RecursiveBinarySearch(sortedArray, toFind)()
  println("The index is " + index)
}

logBinarySearch(Array(1,2,3,4,5,6,7,9), 9)