package com.fengchuiguo.CreatePattern.Prototype;

import java.io.*;

/**
 * Created by Administrator on 2015/12/23 0023.
 */
public class Prototype implements Cloneable,Serializable {

    private  static  final long serialVersionUID=1L;
    private  int paramint;
    private  String paramstring;
    private  SerializableObject paramobj;

    /* 浅复制 */
    public Prototype clone() throws CloneNotSupportedException {
        Prototype prototype=(Prototype)super.clone();
        return  prototype;
    }

    /* 深复制 */
//    要实现深复制，需要采用流的形式读入当前对象的二进制输入，再写出二进制数据对应的对象。
    public Object deepClone() throws IOException, ClassNotFoundException {

        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream baos=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(baos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bais=new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois=new ObjectInputStream(bais);

        return  ois.readObject();

    }

    public int getParamint() {
        return paramint;
    }

    public void setParamint(int paramint) {
        this.paramint = paramint;
    }

    public String getParamstring() {
        return paramstring;
    }

    public void setParamstring(String paramstring) {
        this.paramstring = paramstring;
    }

    public SerializableObject getParamobj() {
        return paramobj;
    }

    public void setParamobj(SerializableObject paramobj) {
        this.paramobj = paramobj;
    }
}

