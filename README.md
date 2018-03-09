# AppRate-Android
[![](https://jitpack.io/v/ridaeh/AppRate-Android.svg)](https://jitpack.io/#ridaeh/AppRate-Android)

Android Library that make easy to implement App rate dialog.

## A quick overview of what's in it
 - Integrate in less than **2 minutes**.
 - Compatible down to **API Level 15**.
 - Show AppRate dialog to rate your app.
 - More then **12 languages**.
 - **Schedule** method to show rate dialog after a number of days and(or) number of launch.

# Screenshots

<img src="https://github.com/ridaeh/AppRate-Android/blob/master/rdme/apprate_dialog.jpeg" width="210" height="330"/>


Ready to see implementation details? Let's scroll.


# Setup
## 1. Provide the gradle dependency

Add this to your build.grade:
```javascript
allprojects {
    repositories {
	//...
	        maven { url "https://jitpack.io" }
	}
}
```
and then in dependencies:
```javascript
	dependencies {
	        compile 'com.github.ridaeh:AppRate-Android:1.2.0'
	}

```

## 2. Add AppRate Dialog
Here is how you utilze the library in your java code:


if you want to show the rate dialog immediatly
```java
	AppRate.app_launched(this,getPackageName());
	//app_launched(Context context,String packageName)
```
To schedule the show of rate dialog use :
```java
	AppRate.app_launched(this,getPackageName(),0,4);
	//app_launched(Context context,String packageName,int daysUntilPrompt,int lanchesUntilPrompt)
```

## 3.Custom colors - colors.xml

No need to create a custom theme. Just set these colors (or some of them) and you have your own style.
```xml
    <!-- AppRate Colors -->
    <!-- Used for the title -->
    <color name="app_rate_title_color">@color/colorPrimary</color>
    <!-- Used for the text -->
    <color name="app_rate_text_color">#000</color>
    <!-- Used for the Buttons -->
    <color name="app_rate_btn_color">@color/colorAccent</color>
    <!-- Used for the background -->
    <color name="app_rate_background">#FFF</color>
```

# Apps using the AppRate Dialog

* [Origami DIY](https://play.google.com/store/apps/details?id=com.breuhteam.origami)


<p>If you implement the library in your app(s) and you upload it on Google Play, let me know.</p>


License
--------

    The MIT License (MIT)

    Copyright (c) 2018 Ridae Hamdani
    
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in
    all copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
    THE SOFTWARE.


