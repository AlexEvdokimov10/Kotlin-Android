import java.time.LocalDate

data class User(val name:String, var id:Int){
    var qwe= mutableListOf<String>("Petr","Ivan","Oleg")
}
 fun main(){
  var user=User("Olga",23);
     var user1=user.copy()
     var par=user1?.apply {
         33
     }.copy("one")
     println(par)

 }




