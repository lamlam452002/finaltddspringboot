package com.SamSung.FisrtSpringBoot.common;

public class OK<T> extends ResponseHeader {
    public T data;

    public OK(T data, String Message, int Status) {
        this.data = data;
        this.Message = Message;
        this.Status = Status;
    }

}
