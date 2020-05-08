
interface RecipeDataSource {
    fun retrieveMuseums(callback: OperationCallback<Museum>)
    fun cancel()
}