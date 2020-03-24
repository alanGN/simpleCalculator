object ApplicationId {
    val id = "com.modular.calculator"
}

object Modules {
    val app = ":app"
    val navigation = ":navigation"
    val common = ":common"
    val commonTest = ":common_test"
    val featureCalculator = ":features:calculatorfeature"
}

object Releases {
    val versionCode = 1
    val versionName = "1.0"
}

object Versions {
    val kotlin = "1.3.61"
    val gradle = "3.3.2"
    val compileSdk = 28
    val minSdk = 23
    val targetSdk = 28
    val appCompat = "1.1.0"
    val coreKtx = "1.1.0"
    val constraintLayout = "1.1.3"
    val junit = "4.12"
    val uiautomator = "2.2.0-alpha3"
    val androidTestRunner = "1.1.2-alpha02"
    val espressoCore = "3.2.0-alpha02"
    val coroutines = "1.1.1"
    val koin = "1.0.2"
    val lifecycle = "2.1.0-alpha04"
    val nav = "2.1.0-alpha03"
    val recyclerview = "1.0.0"
    val safeArgs = "2.1.0-alpha01"
    val glide = "4.9.0"
    val mockwebserver = "2.7.5"
    val archCoreTest = "2.0.0"
    val androidJunit = "1.1.0"
    val mockk = "1.9.2"
    val fragmentTest = "1.1.0-alpha06"
    val databinding = "3.3.2"
    val material = "1.2.0-alpha05"
    val expressionCalculator = "0.4.8"
}

object Libraries {
    // KOIN
    val koin = "org.koin:koin-android:${Versions.koin}"
    val koinViewModel = "org.koin:koin-android-viewmodel:${Versions.koin}"
    // GLIDE
    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    //EXPRESSION BUILDER
    val expressionCalculator = "net.objecthunter:exp4j:${Versions.expressionCalculator}"

}

object KotlinLibraries {
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val kotlinCoroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
}

object AndroidLibraries {
    // KOTLIN
    val kotlinCoroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    // ANDROID
    val appCompat = "androidx.appcompat:appcompat:${Versions.appCompat}"
    val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle}"
    val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerview}"
    val navigation = "androidx.navigation:navigation-ui-ktx:${Versions.nav}"
    val navigationFrag = "androidx.navigation:navigation-fragment-ktx:${Versions.nav}"
    //MATERIAL COMPONENTS
    val material = "com.google.android.material:material:${Versions.material}"
}

object TestLibraries {
    // ANDROID TEST
    val androidTestRunner = "androidx.test:runner:${Versions.androidTestRunner}"
    val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoCore}"
    val uiautomator = "androidx.test.uiautomator:uiautomator:${Versions.uiautomator}"
    val espressoContrib = "androidx.test.espresso:espresso-contrib:${Versions.espressoCore}"
    val archCoreTest = "androidx.arch.core:core-testing:${Versions.archCoreTest}"
    val junit = "androidx.test.ext:junit:${Versions.androidJunit}"
    val fragmentNav = "androidx.fragment:fragment-testing:${Versions.fragmentTest}"
    // KOIN
    val koin = "org.koin:koin-test:${Versions.koin}"
    // MOCK WEBSERVER
    val mockWebServer = "com.squareup.okhttp:mockwebserver:${Versions.mockwebserver}"
    // MOCK
    val mockkAndroid = "io.mockk:mockk-android:${Versions.mockk}"
    val mockk = "io.mockk:mockk:${Versions.mockk}"
    // COROUTINE
    val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-test:${Versions.coroutines}"
    // DATA BINDING
    val databinding = "androidx.databinding:databinding-compiler:${Versions.databinding}"

}