package com.magnitudestudios.playground.ui.auth

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.RequestManager
import com.magnitudestudios.playground.databinding.ActivityAuthBinding
import com.magnitudestudios.playground.viewmodels.ViewModelProviderFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AuthActivity : DaggerAppCompatActivity() {
    private val TAG = "AuthActivity"
    private lateinit var viewModel: AuthViewModel

    @Inject
    lateinit var providerFactory: ViewModelProviderFactory

    @Inject
    lateinit var logo: Drawable

    @Inject
    lateinit var requestManager: RequestManager

    lateinit var bind: ActivityAuthBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityAuthBinding.inflate(layoutInflater)
        setContentView(bind.root)

        viewModel = ViewModelProvider(this, providerFactory)[AuthViewModel::class.java]

        setLogo()

    }

    private fun setLogo() {
        requestManager.load(logo).into(bind.loginLogo)
    }

}
