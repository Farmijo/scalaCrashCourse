val nums = Seq(1,2,3,4)

for(n <- nums) println(n)

val persons = List("Hola", "Adios")

persons foreach println

val ratings = Map(
  "Lady in the Water"  -> 3.0,
  "Snakes on a Plane"  -> 4.0,
  "You, Me and Dupree" -> 3.5
)
ratings.foreach{
  case(movie, rating) => println(s"Movie: ${movie}, Rating: ${rating}")
}

// Collect allows to do pattern matching without failures, so its like a filter
var shyamalanRatings = ratings.collect {
  case (movie, _) if (movie.contains("Lady")) => "Shyamalan"
}

val pairNums = nums.filter(n => n%2==0)

def convertBooleanToStringMessage(bool: Boolean): String = {
  if (bool) "true" else "false"
}

def boolToStringMath(bool:Boolean): String = bool match {
  case true => "True"
  case false => "False"
}

boolToStringMath(true)