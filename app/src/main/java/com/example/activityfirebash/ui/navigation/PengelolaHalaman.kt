package com.example.activityfirebash.ui.navigation

import android.os.Build
import androidx.annotation.RequiresExtension
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.activityfirebash.ui.view.HomeScreen
import com.example.activityfirebash.ui.view.InsertMhsView
import com.example.activityfirebash.ui.viewModel.DestinasiDetail

@RequiresExtension(extension = Build.VERSION_CODES.S, version = 7)
@Composable
fun PengelolaHalaman(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController()
){
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = Modifier
    ){
        composable(DestinasiHome.route){
            HomeScreen(
                navigateToltemEntry = { navController.navigate(DestinasiInsert.route) },
                onDetailClick = { nim->
                    navController.navigate("${DestinasiDetail.route}/$nim"){
                        popUpTo(DestinasiHome.route){
                            inclusive = true

                        }
                    }
                }
            )

        }

        composable(DestinasiInsert.route) {
            InsertMhsView(onBack = {
                navController.popBackStack()
            }, onNavigate = {
                navController.navigate(DestinasiHome.route)
            })

        }
        composable(DestinasiDetail.routeWithArg) { navBackStackEntry ->
            val nim = navBackStackEntry.arguments?.getString(DestinasiDetail.NIM)
            nim?.let { DetailView(
                nim = it,
                navigateBack = {
                    navController.navigate(DestinasiHome.route) {
                        popUpTo(DestinasiHome.route) {
                            inclusive = true
                        }
                    }
                },
            }
        }
    }
}
