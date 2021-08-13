# ToastWallet-Android

[![platform](https://img.shields.io/badge/platform-Android-brightgreen.svg)](https://www.android.com) [![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=16) [![](https://jitpack.io/v/Harshad09/ToastWallet-Android.svg)](https://jitpack.io/#Harshad09/ToastWallet-Android)


<a href="https://www.linkedin.com/in/harshad-dabhade-a2a584175/">
    <img src="https://img.shields.io/badge/Support-Connect%20with%20me%20on%20Linkedin-brightgreen?style=for-the-badge&logo=linkedin" alt="Connect with me on LinkedIn" /></a>


<div align="center">
	<img src="https://github.com/Harshad09/ToastWallet-Android/blob/main/screenshots/Toast.svg" width="128">
</div>

An Android library to create nice Toasts. 

## Prerequisites

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

## Dependency

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	        implementation 'com.github.Harshad09:ToastWallet-Android:0.1.0'
	}
```

## Usage

To display round error Toast:

``` java
ToastWallet.errorRoundToast(context,"This is an Error Toast");
```

<div align="center">
	<img src="https://github.com/Harshad09/ToastWallet-Android/blob/main/screenshots/IMG_20210813_090623.jpg" width="600">
</div>

To display a success Toast:

``` java
ToastWallet.successRoundToast(context,"This is a Success Toast");
```
<div align="center">
	<img src="https://github.com/Harshad09/ToastWallet-Android/blob/main/screenshots/IMG_20210813_090649.jpg" width="600">
</div>

To display an info Toast:

``` java
ToastWallet.infoRoundToast(context,"This is a Info Toast");
```
<div align="center">
	<img src="https://github.com/Harshad09/ToastWallet-Android/blob/main/screenshots/IMG_20210813_090558.jpg" width="600">
</div>

To display a warning Toast:

``` java
ToastWallet.warningRoundToast(context,"This is a Success Toast");
```
<div align="center">
	<img src="https://github.com/Harshad09/ToastWallet-Android/blob/main/screenshots/IMG_20210813_090538.jpg" width="600">
</div>

To display Toast with time duration :

``` java
ToastWallet.errorRoundToast(context,"This is an Error Toast",int duration);
```

Similarly you can display square shaped toast:

``` java
ToastWallet.errorSquareToast(context,"This is an Error Toast");
```

<div align="center">
	<img src="https://github.com/Harshad09/ToastWallet-Android/blob/main/screenshots/IMG_20210813_090454.jpg" width="600">
</div>

<div align="center">
	<img src="https://github.com/Harshad09/ToastWallet-Android/blob/main/screenshots/IMG_20210813_090429.jpg" width="600">
</div>
<div align="center">
	<img src="https://github.com/Harshad09/ToastWallet-Android/blob/main/screenshots/IMG_20210813_090512.jpg" width="600">
</div>

To display Toast with time duration :

``` java
ToastWallet.successSquareToast(context,"This is an Error Toast",int duration);
```
