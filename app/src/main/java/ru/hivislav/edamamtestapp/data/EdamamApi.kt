package ru.hivislav.edamamtestapp.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
import ru.hivislav.edamamtestapp.BuildConfig
import ru.hivislav.edamamtestapp.domain.entities.HintsList

interface EdamamApi {

    @GET(EDAMAM_PARSER_END_POINT)
    fun getFoodList(
        @Query("app_id") edamamAppId: String = BuildConfig.EDAMAM_APP_ID,
        @Query("app_key") edamamAppKey: String = BuildConfig.EDAMAM_APP_KEY,
        @Query("ingr") ingredient: String
    ): Call<HintsList>
}