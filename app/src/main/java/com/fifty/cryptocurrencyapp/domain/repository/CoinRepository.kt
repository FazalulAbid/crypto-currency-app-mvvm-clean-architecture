package com.fifty.cryptocurrencyapp.domain.repository

import com.fifty.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.fifty.cryptocurrencyapp.data.remote.dto.CoinDto

interface CoinRepository {
    suspend fun getCoins(): List<CoinDto>
    suspend fun getCoinById(coinId: String): CoinDetailDto
}