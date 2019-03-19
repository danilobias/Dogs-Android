package com.personallabs.dogs.data

interface BreedDataSource {
    fun listAll(success : (List<Breed>) -> Unit, failure: () -> Unit)
}