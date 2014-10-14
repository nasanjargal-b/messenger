package com.aptech.messenger.model;

import java.io.Serializable;

/**
 * Тухайн хэрэглэгчийн талруу серверээс мэдээллэл илгээж байгаа
 * үед уг моделийн тусламжтайгаар илгээнэ.
 */
public class ServerResultData<T extends Serializable> implements Model {

    /**
     * Хэрэв тухайн хэрэглэгч системд амжилттай нэвтэрсэн үед true
     * амжилтгүй бол false гэсэн утгатай байна.
     */
    private Boolean success;
    /**
     * Хэрэв нэвтрэх явцад алдаа гарсан бол тухайн алдааны message
     * утгыг агуулана.
     */
    private String message;
    /**
     * Серверээс дамжуулж буй мэдээллийг хадгалана.
     */
    private T data;

    public Boolean getSuccess() {
        return this.success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

}