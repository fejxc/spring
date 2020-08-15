package com.sunyun.excep;
//Ctrl + o 重写方法

//自定义运行时异常
public class NotEnoughException extends RuntimeException {
    public NotEnoughException() {
        super();
    }

    public NotEnoughException(String message) {
        super(message);
    }
}
