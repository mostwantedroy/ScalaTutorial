/* 
  Scala의 자료형은 Java와 동일하다. 
  Scala에는 자바의 원시 자료형이 존재하지 않으며, 모든 것이 클래스이다. 
  Scala의 자료형은 컴파일 시점에 자바의 자료형으로 자동으로 변환된다. 

  Scala의 자료형은 숫자형, 논리형, 문자형이 존재한다. 
  자료형 선언시에 명시적으로 변수의 타입을 선언할 수 있고, 선언하지 않을 수 있다. 
  자료형을 선언하지 않으면, 컴파일러가 자동으로 정수형은 int, 실수형은 Doule로 선언한다. 
*/

/*
  기본 자료형 
  
  Byte 8bit
  Short 16bit
  Int 32bit
  Long 64bit
  
  Float 32bit
  Double 64bit
  Char 16bit
  Boolean 1bit
  
  참조 자료형
  
  String 문자열 표현
  Unit 리턴값이 없음을 표현
  Null Null 값 표현
  Nothing 모든 객체의 서브 타입
  Any 모든 객체의 기본 타입
  AnyVal 기본 값 타입의 부모 타입
  AnyRef 참조 타입의 부모 타입
*/


/* Up-Casting & Down-Casting
  정수형과 실수형 사이의 업캐스팅은 자동으로 이뤄지고, 다운캐스팅은 명시적으로 처리해야 한다. 
*/

// 변수 선언

// 숫자형 변수

// 암묵적 선언 (Implicit Declaration)

var x = 10
var y = "abc"

// 명시적 선언 (Explicit Declaration) 
// Python의 type-hinting과 비슷함
var b: Byte = 10
var s: Short = 10
var i: Int = 10
var l: Long = 10

// 값에 약어를 추가하여 명시적 선언
var f = 10.0f
var d = 20.0d

// 논리형 변수
var t = true

// 문자형 변수
var c1:Char = 'a'
var c2 = 'b'

// 문자열 변수
// Scala에서는 문자열의 표현을 쌍따옴표로 처리한다. 
var str1 = "abc"

// 멀티라인 문자열은 3개의 쌍따옴표로 처리한다. 
var str2 = """ abc
    | def
    | ghi """

