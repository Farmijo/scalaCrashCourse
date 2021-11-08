

def binarySearch(sortedArray: Seq[Int], numberToFind: Int)( low: Int = 0, high: Int = sortedArray.length): Int = {
  if(sortedArray.length == 1 && sortedArray(0) != numberToFind) throw new Exception("Number not present")
  var middle = (low + high / 2)
  val numFoundInIteration = sortedArray(middle)
  println(sortedArray)
  var num = 0;
  if(numFoundInIteration==numberToFind) {
     middle
  }
  else
    if(numFoundInIteration!=numberToFind && numFoundInIteration>numberToFind) {
      binarySearch(sortedArray, numberToFind)(0, middle-1)
    }
    else
      binarySearch(sortedArray, numberToFind)(middle+1, high)

}

def logBinarySearch(sortedArray: Seq[Int], toFind: Int): Unit = {
  def index = binarySearch(sortedArray, toFind)()
  println("The index is " + index)
}

logBinarySearch(Seq(1,2,3,4,5,6,7,9), 3)