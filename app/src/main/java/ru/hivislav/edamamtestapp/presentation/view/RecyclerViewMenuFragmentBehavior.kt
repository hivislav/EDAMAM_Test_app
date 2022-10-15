package ru.hivislav.edamamtestapp.presentation.view

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import com.google.android.material.appbar.AppBarLayout

class RecyclerViewMenuFragmentBehavior(
    context: Context, attrs: AttributeSet? = null): AppBarLayout.ScrollingViewBehavior(context, attrs) {

    override fun onDependentViewChanged(
        parent: CoordinatorLayout,
        child: View,
        dependency: View
    ): Boolean {

        if (dependency is AppBarLayout) {
            if (dependency.y *-1 >= parent.y) {
            dependency.elevation = 50f
            } else {
                dependency.elevation = 0f
            }
        }
        return super.onDependentViewChanged(parent, child, dependency)
    }
}