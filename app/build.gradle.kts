plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.gms.google-services")
}

android {
    namespace = "com.example.myfirstapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.LeenaRizwan.i210430"
        minSdk = 24
        targetSdk = 33
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
      viewBinding=true
    }
}

dependencies {
    implementation ("de.hdodenhof:circleimageview:3.1.0")
    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("com.google.firebase:firebase-auth:22.3.1")
    implementation("com.google.firebase:firebase-database:20.3.1")
    implementation("com.google.firebase:firebase-storage-ktx:20.3.0")
    implementation("androidx.viewpager2:viewpager2:1.0.0")
    implementation("com.google.firebase:firebase-firestore:24.10.3")
    //for firebase ui
    implementation("com.firebaseui:firebase-ui-database:8.0.0")
    implementation("com.firebaseui:firebase-ui-firestore:8.0.0")
    implementation("com.firebaseui:firebase-ui-auth:8.0.0")
    implementation("com.firebaseui:firebase-ui-storage:8.0.0")
    implementation("com.google.firebase:firebase-analytics:17.5.0")
    implementation("com.google.firebase:firebase-messaging:20.2.4")
    implementation("com.google.firebase:firebase-messaging-directboot:20.2.4")
    //for kotlin
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.3.9")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.1.1")


    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}