# Toasty
[![API](https://img.shields.io/badge/API-9%2B-blue.svg?style=flat)](https://android-arsenal.com/api?level=9) [![](https://jitpack.io/v/GrenderG/Toasty.svg)](https://jitpack.io/#GrenderG/Toasty) [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Toasty-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/5102) [![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=XUUEWEHJYFYV2)

<div align="center">
	<img src="https://raw.githubusercontent.com/GrenderG/Toasty/master/art/web_hi_res_512.png" width="128">
</div>

The usual Toast, but with steroids. **(Screenshots at the end of the file.)**

相对与原项目的更改:

Toasty内部维护单一的toast对象,防止弹出无数的toast.
简化api调用

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
		...
		maven { url "https://jitpack.io" }
	}
}
```

Dependency
--

Add this to your module's `build.gradle` file (make sure the version matches the JitPack badge above):

```gradle
dependencies {
	...
	compile 'com.github.hss01248:Toasty:2.0.0'
}
```

Usage
--

Each method always returns a `Toast` object, so you can customize the Toast much more. **DON'T FORGET THE `show()` METHOD!**

frist,init in Application:

```

 /**
     *
     * @param context applicationcontext
     * @param isDebug 是测试环境还是正式环境
     * @param showInCenter 显示在什么地方.默认在底部,可以设置为屏幕中央.全局起作用
     */
    public static void init(Context context,boolean isDebug,boolean showInCenter)

```

To display an error Toast:

``` java
 MyToast.error("This is an error toast.")
```
To display a success Toast:

``` java
 MyToast.success("Success!")
```
To display an info Toast:

``` java
MyToast.info("Here is some info for you.")
```
To display a warning Toast:

``` java
  MyToast.warn("Beware of the dog.")
```
To display the usual Toast:

``` java
MyToast.normal("Normal toast w/o icon")
```
To display the usual Toast with icon:

``` java
MyToast.normal(CharSequence text ,int resId)
```

You can also create your custom Toasts with the `custom()` method:
``` java
Toasty.custom(yourContext, "I'm a custom Toast", yourIconDrawable, textColor, tintColor, duration, withIcon, true).show();
```
### Extra
[You can pass formatted text to Toasty!](https://github.com/GrenderG/Toasty/blob/master/app/src/main/java/es/dmoral/toastysample/MainActivity.java#L76-L93)

There are variants of each method, feel free to explore this library.

Apps using Toasty
--

Want to be here? Open an `issue` or make a `pull request`.

<table>
	<tr>
		<td><img src="https://lh3.googleusercontent.com/vmch41lYF_TKb1MKgtYrSgz2rKQ4T1EnGRCGpWSMqLRSzi_pgNWoZpw9WJE8UV4t614=w300-rw" width="64"/></td>
		<td><a href="https://play.google.com/store/apps/details?id=com.trivisionzero.chromophoto">ChromoPhoto - Colorize B&W</a></td>
	</tr>
	<tr>
		<td><img src="https://lh3.googleusercontent.com/2EYJPs-qBlKJ3L6cy7idQpzKfZkTzA2G4UQfbs-96VGMftQ-7aV4Dvj77ejzZlAAVx_C=w300-rw" width="64"/></td>
		<td><a href="https://play.google.com/store/apps/details?id=com.serg.chuprin.tageditor">AutoTagger - редактор тегов.</a></td>
	</tr>
	<tr>
		<td><img src="https://archive.org/download/ic_launcher_colorhub/ic_launcher_colorhub.png" width="64"/></td>
		<td><a href="https://play.google.com/store/apps/details?id=cheetatech.com.colorhub">ColorHub - Color Palette</a></td>
	</tr>
</table>

Screenshots
--

<img src="https://raw.githubusercontent.com/GrenderG/Toasty/master/art/scr_1.png" width="250">
<img src="https://raw.githubusercontent.com/GrenderG/Toasty/master/art/scr_2.png" width="250">
<img src="https://raw.githubusercontent.com/GrenderG/Toasty/master/art/scr_3.png" width="250">
<img src="https://raw.githubusercontent.com/GrenderG/Toasty/master/art/scr_4.png" width="250">
<img src="https://raw.githubusercontent.com/GrenderG/Toasty/master/art/scr_5.png" width="250">
<img src="https://raw.githubusercontent.com/GrenderG/Toasty/master/art/scr_6.png" width="250">
<img src="https://raw.githubusercontent.com/GrenderG/Toasty/master/art/scr_7.png" width="250">
