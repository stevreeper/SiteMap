package dev.aylton.sitemap.views.auth


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import dev.aylton.sitemap.R
import dev.aylton.sitemap.views.BaseView

/**
 * A simple [Fragment] subclass.
 */
class AuthView : BaseView() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_auth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initPresenter(AuthPresenter(this)) as AuthPresenter
    }
}
