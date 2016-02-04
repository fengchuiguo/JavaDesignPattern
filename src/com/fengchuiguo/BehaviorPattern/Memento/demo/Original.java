package com.fengchuiguo.BehaviorPattern.Memento.demo;

public class Original {
    private String value;

    public Original(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    //创建备份
    public Memento createMemento(){
        return new Memento(value);
    }

    //根据备份来恢复
    public void restoreMemento(Memento memento){
        this.value = memento.getValue();
    }

}
