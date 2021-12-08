import java.lang.reflect.Array
import java.time.LocalDate

fun sortList(list:Collection<Int>):MutableList<Int>{
    var tempList = mutableListOf<Int>()
    tempList.addAll(list.sorted())
    return tempList;
}
fun sortElements(array:IntArray):IntArray{
    var tempList = mutableListOf<Int>();
    tempList.sorted();
    var array=tempList.sorted().toIntArray();
    return array;
}
 fun main(){

 }




