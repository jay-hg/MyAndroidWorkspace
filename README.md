# 选择啤酒
功能：从下拉表单选择一项，按button，显示在标签上
用到控件：Spinner TextView Button
string.xml的修改：string string-array enties属性设置@array/list
居中对齐：layout_centerHorizontal
onClick事件响应 public void onClickFinder(View view)

# Intent
功能：发送信息到另一个Activity
用到控件：EditText Button
使用Intent 其构造函数有几种？
put&get Extra
startActivity(intent);
设置信息格式：intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,str);
用Action; new Intent(Intent.ACTION_SEND);
如何自己选择开启的Activity?
Intent.createChooser(intent,title_text);可以返回一个新的Intent

# 计时器
通过计时器了解Activity的生命周期
怎么设置字高：textSize
画好界面，设置onClick函数
回顾Activity的生命过程
create start pause resume stop saveInstanceState destroy
如何设置计时器？
new 一个handler; handler.post(runnable);
runnable重载run方法，其中有handler.postDelayed