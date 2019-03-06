package com.personallabs.dogs.viewModels

import android.databinding.ObservableArrayList
import android.databinding.ObservableBoolean
import android.databinding.ObservableField
import com.personallabs.dogs.models.Breed

class BreedsViewModel {

    val breeds = ObservableArrayList<Breed>()
    val loadingVisibility = ObservableBoolean(false)
    val message = ObservableField<String>()
}