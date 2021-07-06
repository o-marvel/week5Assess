 fun main(){
     var str = "life is more than hardship"
    println(remVowels(str))
 }
  fun  remVowels ( f : String) : String{
      var vowels = setOf('a', 'e', 'i','o', 'u')
      return f.filter { it !in vowels }
  }