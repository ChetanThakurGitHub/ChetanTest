
import Museum

data class RecipeResponse(val title:String?, val href:String?, val msg:String?, val version:Float, val results:List<Museum>?){
   // fun isSuccess():Boolean= (status==200)
}