package com.fifty.cryptocurrencyapp.data.repository

import com.fifty.cryptocurrencyapp.data.remote.CoinPaprikaApi
import com.fifty.cryptocurrencyapp.data.remote.dto.CoinDetailDto
import com.fifty.cryptocurrencyapp.data.remote.dto.CoinDto
import com.fifty.cryptocurrencyapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> =
        api.getCoins()

    override suspend fun getCoinById(coinId: String): CoinDetailDto =
        api.getCoinById(coinId)

}