import android.util.Log
import com.emedinaa.kotlinmvvm.data.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

const val TAG="CONSOLE"

class RecipeRepository: RecipeDataSource {

    private var call:Call<RecipeResponse>?=null

    override fun retrieveMuseums(callback: OperationCallback<Museum>) {
        call=ApiClient.build()?.museums()
        call?.enqueue(object :Callback<RecipeResponse>{
            override fun onFailure(call: Call<RecipeResponse>, t: Throwable) {
                callback.onError(t.message)
            }

            override fun onResponse(call: Call<RecipeResponse>, response: Response<RecipeResponse>) {
                response?.body()?.let {
                    if(response.isSuccessful /*&& (it.isSuccess())*/){
                        Log.v(TAG, "data ${it.results}")
                        callback.onSuccess(it.results)
                    }else{
                        callback.onError(it.msg)
                    }
                }
            }
        })
    }



    override fun cancel() {
        call?.let {
            it.cancel()
        }
    }
}
