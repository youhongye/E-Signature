## 签名效果预览
<div align=center><img width="324" height="768" src="https://raw.githubusercontent.com/youhongye/E-Signature/1.0/app/src/main/res/drawable-xxhdpi/img_signature.png"/></div>

## Gradle引用
	implementation 'com.github.youhongye:E-Signature:1.0'    
 jitpack要求在工程 **根目录** 的`build.gradle`中添加如下：  
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
## 使用文档
#### xml布局文件使用
```
<com.ylly.signature.view.SignatureView
        android:id="@+id/signature_view"
        android:layout_width="match_parent"
        android:layout_height="300dp"
        app:paintColor="#333333"
        app:paintMaxWidth="6dp"
        app:paintMinWidth="4dp" />
```
#### 画笔属性
```
app:paintColor  	画笔颜色，默认黑色
app:paintMaxWidth	画笔最大宽度
app:paintMinWidth	画笔最小宽度
```
#### 保存画板  save()
```
/**
 * @param path       保存到路径
 * @param clearBlank 是否清楚空白区域
 * @param blank      边缘空白区域
 * @param isEncrypt  加密存储，选择加密存储会自动追加后缀为.sign
 */
save(String path, boolean clearBlank, int blank, boolean isEncrypt)
```
#### 设置画笔颜色  setPaintColor()
```
/**
 * @param paintColor	画笔颜色
 */
setPaintColor(int paintColor)
```
#### 设置画笔宽度  setPaintWidth()
```
/**
 * @param mMinWidth	最小宽度
 * @param mMaxWidth	最大宽度
 */
setPaintWidth(int mMinWidth, int mMaxWidth)
```
#### 清除画板  clear()
```
clear()
```
#### 是否存在签名  isSign()
```
isSign()
```
