// Comparison Operator

// Java에서 equals를 사용했지만, Scala는 모든 것을 ==, !=로 비교한다. 
println(1 == 1)
-> true: Boolean

println('a' == 'a')
-> true: Boolean

println(1 == 'a')
-> false: Boolean

// String Comparison
val s1 = "Scala"
val s2 = "Scala"
val s3 = "SCALA"

println(s1 == s2)
-> true: Boolean

println(s2 == s3)
-> false: Boolean

// Object Comparison
case class Person( name:String, age:Int )
val p1 = Person("Roy", 31)
val p2 = Person("Roy", 31)
val p3 = Person("Clair", 27)

println(p1 == p2)
-> true: Boolean

println(p1 == p3)
-> false: Boolean
