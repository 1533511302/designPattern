
import top.maniy.factory.YouthGirl;
import top.maniy.template.Games;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        Girl girl =new Girl();

        //Girl这个类 也是一个实例对象，任何一个类都都是Class的实例对象
        //这个实例对象有三种表达方式


        //第一种表达方式--》实际在告诉我们任何一个类都有一个隐含的静态成员变量
        Class c1 =Girl.class;

        //第二中表达方式，已经知道该类的对象通过getClass方法
        Class c2 =girl.getClass();//c2是Girl类类型（class type）

        System.out.println(c1);
        //第三种表达方式
        Class c3 =null;

        try {
            c3 =Class.forName("Girl");//如果有包要加包名 如:top.maniy.Girl
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(c2==c3);

        //可以通过类的类类型创建给类的对象实例 --》通过c1\c2\c3创建Girl类实例
        try {
            Girl girl1 =(Girl)c1.newInstance();

            girl1.print();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }



        Class c4 =int.class;//int类类型
        Class c5 =String.class;//String类的类类型
        System.out.println(c5.getName());//含包名的类名称
        System.out.println(c5.getSimpleName());//不含包名的类名称

        /**
         * Method类，方法对象
         * 一个成员方法就是一个Method对象
         * getMethods()方法获取的是所有的public的函数，包括父类继承而来的
         * getDeclaredMethods()获取的是所有该类自己声明的方法，不问访问权限
         */
        Method[] ms =c4.getMethods();
        Method[] mds =c5.getDeclaredMethods();

        for(int i =0;i<ms.length;i++){
            //得到方法的返回值类型的类类型 如：class int
            Class returnType=ms[i].getReturnType();
            //其类类型名名称 如：int
            System.out.println(returnType.getName());
            //获取方法名
            System.out.println(ms[i].getName());

            //获取参数类型--》得到的是参数列表的类型的类类型
            Class[] paramTypes =ms[i].getParameterTypes();

            for (int j = 0; j <ms.length ; j++) {
                System.out.println(ms[i].getName());
            }

        }


        /**
         * 成员变量也是对象
         * java.lang.reflect.Field
         * Field类封装了关于成员变量的操作
         * getFields()方法获取的是所有的public的成员变量的信息
         */
        Field[] fs =c1.getFields();
        Field[] fds =c1.getDeclaredFields();
        for(Field field:fs){
            //得到成员变量的类型的类类型
            Class fieldType =field.getType();
            String typeName =fieldType.getTypeName();
            //得到成员变量的名称
            String fieldName =field.getName();

        }

        /**
         * 构造函数也是对象
         * java.lang.Constructor中封装构造函数的信息
         */
        Constructor[] cs = c1.getConstructors();
        for(Constructor constructor:cs){
            System.out.println(constructor.getName());
            //获取参数类型--》得到的是参数列表的类型的类类型
            Class[] paramTypes =constructor.getParameterTypes();

            for (int j = 0; j <ms.length ; j++) {
                System.out.println(ms[j].getName());
            }
        }


        /**
         * 方法的反射操作
         */

        try {
            //Method m=c1.getMethod("aPrint", new Class[]{int.class, int.class});
            Method m=c1.getMethod("aPrint", int.class, int.class);
            //方法的反射操作是用m对象来进行方法调用 和c1.aPrint完全相同
            //Object o =m.invoke(girl,new Object[]{20,30});
            Object o =m.invoke(girl,20,30);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
class Girl{
    void print(){
        System.out.println("hello class");
    }

    void aPrint(int a,int b){
        System.out.println(a+b);
    }
}