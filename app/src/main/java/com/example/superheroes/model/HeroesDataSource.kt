/*
 * Copyright (c) 2022 The Android Open Source Project
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.superheroes.model

import com.example.superheroes.R
//daftar isi (list) superhero yang ditampilkan pada layar
object HeroesRepository {
    val heroes = listOf(
        Hero(
            //nama superhero
            nameRes = R.string.hero1,
            //deskripsi superhero
            descriptionRes = R.string.description1,
            //gambar (foto) superhero
            imageRes = R.drawable.android_superhero1
        ),
        Hero(
            //nama superhero
            nameRes = R.string.hero2,
            //deskripsi superhero
            descriptionRes = R.string.description2,
            //gambar (foto) superhero
            imageRes = R.drawable.android_superhero2
        ),
        Hero(
            //nama superhero
            nameRes = R.string.hero3,
            //deskripsi superhero
            descriptionRes = R.string.description3,
            //gambar (foto) superhero
            imageRes = R.drawable.android_superhero3
        ),
        Hero(
            //nama superhero
            nameRes = R.string.hero4,
            //deskripsi superhero
            descriptionRes = R.string.description4,
            //gambar (foto) superhero
            imageRes = R.drawable.android_superhero4
        ),
        Hero(
            //nama superhero
            nameRes = R.string.hero5,
            //deskripsi superhero
            descriptionRes = R.string.description5,
            //gambar (foto) superhero
            imageRes = R.drawable.android_superhero5
        ),
        Hero(
            //nama superhero
            nameRes = R.string.hero6,
            //deskripsi superhero
            descriptionRes = R.string.description6,
            //gambar (foto) superhero
            imageRes = R.drawable.android_superhero6
        )
    )
}
