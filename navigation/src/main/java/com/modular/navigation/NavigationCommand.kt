package com.modular.navigation

import android.net.Uri
import androidx.navigation.NavDirections

sealed class NavigationCommand {
    data class To(val directions: NavDirections): NavigationCommand()
    data class RouteTo(val uri:Uri): NavigationCommand()
    object Back: NavigationCommand()
}