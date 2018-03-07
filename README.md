# AppRate-Android
Android Library that make easy to implement App rate dialog it has :

 * Show rate dialog with more then 10 languages.
 * Add schedule methode to show rate dialog after a number of days and(or) number of launch.

<img src="https://github.com/ridaeh/AppRate-Android/blob/master/rdme/apprate_dialog.jpeg" width="210" height="330"/>

Ready to see implementation details? Let's scroll.


# Usage

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
	        compile 'com.github.ridaeh:AppRate-Android:1.0.1'
	}

```


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


