package com.personallabs.dogs

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.personallabs.dogs.viewModels.BreedsViewModel
import com.personallabs.dogs.views.BreedsFragment
import kotlinx.android.synthetic.main.breeds_activity.*

class BreedsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.breeds_activity)

        addFragmentTo(R.id.content_frame, createFragment())
        setSupportActionBar(toolbar)
    }


    fun createViewModel(): BreedsViewModel {
        return BreedsViewModel()
    }

    fun createFragment(): BreedsFragment {
        return BreedsFragment.newInstance(createViewModel())
    }

}