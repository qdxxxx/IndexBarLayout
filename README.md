# IndexBarLayout

[![](https://www.jitpack.io/v/qdxxxx/IndexBarLayout.svg)](https://www.jitpack.io/#qdxxxx/IndexBarLayout)

类似手机联系人最右侧的字母导航栏.

拼音提取首字母可以参考使用[https://github.com/promeG/TinyPinyin]( https://github.com/promeG/TinyPinyin)

悬浮头部效果和头部分层，参考使用[StickyHeaderDecoration]( https://github.com/qdxxxx/StickyHeaderDecoration)
<br/>
 ![image](https://github.com/qdxxxx/IndexBarLayout/blob/master/appGif/GIF.gif)
 

 
 ---
 ### Download
 [https://fir.im/j54h]( https://fir.im/j54h)

 ---
### 集成方式

 - 注入依赖
 Step 1. Add the JitPack repository to your build file
 Step 2. Add the dependency
```
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
```
	dependencies {
 	   compile 'com.github.qdxxxx:IndexBarLayout:1.0.1'
	}
```

#### Activity里面集成代码
 - 设置index首字母信息
```
        indexLayout.getIndexBar().setIndexsList(List<String> indexs);
```

 - index字母改变的事件通知
 ```
        indexLayout.getIndexBar().setIndexChangeListener(new IndexBar.IndexChangeListener() {
            @Override
            public void indexChanged(String indexName) {
            }
        });
 ```
 
#### Layout
```
<qdx.indexbarlayout.IndexLayout
        android:id="@+id/index_layout"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />
```

 
### 方法及属性介绍
---

#### indexLayout

name                   | format         |中文解释
----                   |------          |----
setDrawByTouch         | boolean  	|触摸显示的字母圆的y轴中心点与手指触摸相同
setCircleRadius        | float    	|触摸显示的字母圆的半径
setCircleDuration      | integer   	|触摸显示的字母圆显示时间
setCircleColor         | integer	|圆的颜色
setIndexBarWidth       | integer 	|字母导航栏的宽度
setIndexBarHeightRatio | float          |字母导航栏高度相对父高度占比
getIndexBar	       |                |获取字母导航栏

<br/>

#### indexBar

indexBar可以通过indexLayout.getIndexBar()获取.

name                   | format               |中文解释
----                   |------                |----
setIndexsList          | List                 |初始化字母导航栏
setIndexChangeListener | IndexChangeListener  |设置字母改变监听事件
setIndexTextSize       | integer	      |字母文字大小
setSelTextColor        | integer 	      |字母文字选中颜色
setNorTextColor        | integer  	      |字母文字未选中颜色

####  License
---

```
MIT License

Copyright (c) 2017 qdx

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
