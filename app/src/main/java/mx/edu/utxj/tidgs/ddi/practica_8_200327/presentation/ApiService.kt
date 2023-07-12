import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("data")
    fun getData(): Call<ResponseBody>
}
