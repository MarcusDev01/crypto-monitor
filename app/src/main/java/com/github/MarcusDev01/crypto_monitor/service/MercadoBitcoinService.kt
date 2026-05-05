package com.github.MarcusDev01.crypto_monitor.service

import com.github.MarcusDev01.crypto_monitor.model.TickerResponse
import retrofit2.Response
import retrofit2.http.GET

interface MercadoBitcoinService {

    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}