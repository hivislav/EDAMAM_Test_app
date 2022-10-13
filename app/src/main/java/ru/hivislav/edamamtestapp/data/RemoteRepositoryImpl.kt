package ru.hivislav.edamamtestapp.data

import android.util.Log
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import ru.hivislav.edamamtestapp.domain.entities.Food
import ru.hivislav.edamamtestapp.domain.entities.HintsList
import ru.hivislav.edamamtestapp.domain.entities.Nutrients
import ru.hivislav.edamamtestapp.domain.repositories.RemoteRepository

class RemoteRepositoryImpl: RemoteRepository {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(EDAMAM_BASE_URL)
            .addConverterFactory(
                GsonConverterFactory.create(
                    GsonBuilder().setLenient().create()
                )
            )
            .build().create(EdamamApi::class.java)
    }

    override fun getFoodList(ingredient: String): HintsList? {

        val request = retrofit.getFoodList(ingredient = ingredient).request()
        Log.d("pizza request", request.toString())

        return let {
            retrofit.getFoodList(ingredient = ingredient).execute().body()
        }
    }

    override fun getFood(foodId: String): Food {
        //TODO
        return Food("", "", Nutrients(0.0, 0.0, 0.0, 0.0, 0.0), "")
    }
}