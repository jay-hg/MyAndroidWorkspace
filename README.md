# ѡ��ơ��
���ܣ���������ѡ��һ���button����ʾ�ڱ�ǩ��
�õ��ؼ���Spinner TextView Button
string.xml���޸ģ�string string-array enties��������@array/list
���ж��룺layout_centerHorizontal
onClick�¼���Ӧ public void onClickFinder(View view)

# Intent
���ܣ�������Ϣ����һ��Activity
�õ��ؼ���EditText Button
ʹ��Intent �乹�캯���м��֣�
put&get Extra
startActivity(intent);
������Ϣ��ʽ��intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,str);
��Action; new Intent(Intent.ACTION_SEND);
����Լ�ѡ������Activity?
Intent.createChooser(intent,title_text);���Է���һ���µ�Intent

# ��ʱ��
ͨ����ʱ���˽�Activity����������
��ô�����ָߣ�textSize
���ý��棬����onClick����
�ع�Activity����������
create start pause resume stop saveInstanceState destroy
������ü�ʱ����
new һ��handler; handler.post(runnable);
runnable����run������������handler.postDelayed