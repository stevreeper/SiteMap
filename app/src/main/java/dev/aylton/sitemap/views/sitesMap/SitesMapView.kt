package dev.aylton.sitemap.views.sitesMap


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import dev.aylton.sitemap.R

/**
 * A simple [Fragment] subclass.
 */
class SitesMapView : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sites_map, container, false)
    }


}