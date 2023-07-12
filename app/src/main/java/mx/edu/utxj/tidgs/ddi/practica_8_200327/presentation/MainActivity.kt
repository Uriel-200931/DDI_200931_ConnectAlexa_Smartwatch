/* While this template provides a good starting point for using Wear Compose, you can always
 * take a look at https://github.com/android/wear-os-samples/tree/main/ComposeStarter and
 * https://github.com/android/wear-os-samples/tree/main/ComposeAdvanced to find the most up to date
 * changes to the libraries and their usages.
 */
package mx.edu.utxj.tidgs.ddi.practica_8_200327.presentation;


import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.ComponentActivity
import mx.edu.utxj.tidgs.ddi.practica_8_200327.R
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.ResponseBody
import org.json.JSONObject


import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException

/*
Para convertir grados Kelvin (K) a grados Celsius (°C), debes restar 273.15 a la temperatura en Kelvin.
Temperatura en °C = Temperatura en K - 273.15

URL NAVEGADOR:
XICOTEPEC
https://api.openweathermap.org/data/2.5/weather?lat=20.274167&lon=-97.95483032049188&appid=5e3120f5659a09f20f44e404a94d52ce
*/
class MainActivity : ComponentActivity() {

    private lateinit var textViewSaludo: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Enviar solicitud a la API utilizando Retrofit
        val apiService = RetrofitClient.apiService
        val call: Call<ResponseBody> = apiService.getData()

        call.enqueue(object : Callback<ResponseBody> {
            override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
                if (response.isSuccessful) {
                    // Mostrar mensaje en la consola
                    Log.d("Skill_Connected", "Conexión exitosa con la skill de Alexa");
                    Log.d("Skill_Connected", "Conexión exitosa con la skill de Alexa");
                    Log.d("Skill_Connected", "Conexión exitosa con la skill de Alexa");
                    Log.d("Skill_Connected", "Conexión exitosa con la skill de Alexa");
                    Log.d("Skill_Connected", "Conexión exitosa con la skill de Alexa");
                    Log.d("Skill_Connected", "Conexión exitosa con la skill de Alexa");
                    Log.d("Skill_Connected", "Conexión exitosa con la skill de Alexa");

                } else {
                    Log.e("API_ERROR", "Error en la respuesta: ${response.code()}")
                }
            }

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                Log.e("API_ERROR", "Error en la solicitud: ${t.message}")
            }
        })
    }
}