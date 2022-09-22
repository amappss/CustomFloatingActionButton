plugins {
  id("com.android.application")
  kotlin("android")
}

android {
  compileSdk = 32
  defaultConfig {
    applicationId = "com.robertlevonyan.views.customfloatingactionbuttonsample"
    minSdk = 25
    targetSdk = 32
    versionCode = 1
    versionName = "1.0"
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }
  buildTypes {
    getByName("release") {
      isMinifyEnabled = true
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
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
  implementation(kotlin("stdlib"))
  implementation("androidx.appcompat:appcompat:1.4.1")
  implementation("androidx.constraintlayout:constraintlayout:2.1.3")
  implementation("androidx.core:core-ktx:1.7.0")

  implementation("com.google.android.material:material:1.5.0")
  implementation(project(mapOf("path" to ":fab")))

}
