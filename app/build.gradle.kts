import org.gradle.internal.impldep.org.junit.experimental.categories.Categories.CategoryFilter.exclude

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("org.jetbrains.kotlin.plugin.parcelize")
}

android {
    namespace = "com.farhan.netflixclone"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.farhan.netflixclone"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    //outline textview
    implementation(libs.outlinetextview) {
        exclude(group = "com.android.support", module = "support-compat")
    }

    //retrofit
    implementation(libs.retrofit)
    implementation(libs.okhttp)
    implementation(libs.gson)

    //lifecycle
    implementation(libs.androidx.lifecycle.viewmodel.android)

    //glide
    implementation(libs.glide)
    annotationProcessor(libs.glide.compiler)

    //navigation
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)

    //youtubePlayer
    implementation(libs.youtube.player)
}