package com.juangm.randomusers.presentation.di

import com.juangm.randomusers.domain.usecase.DeleteLocalUsersUseCase
import com.juangm.randomusers.domain.usecase.GetFavoriteUserListUseCase
import com.juangm.randomusers.domain.usecase.GetUserListUseCase
import com.juangm.randomusers.domain.usecase.UpdateUserUseCase
import org.koin.dsl.module

val domainModule = module {
    single { GetUserListUseCase(get()) }
    single { GetFavoriteUserListUseCase(get()) }
    single { UpdateUserUseCase(get()) }
    single { DeleteLocalUsersUseCase(get()) }
}