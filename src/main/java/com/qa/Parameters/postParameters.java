package com.qa.Parameters;
/*Post类型的接口通常有请求参数，请求参数也是json类型，所以需要写一个类将请求参数序列化成json对象

以常见的登录接口为例

新建一个package,和postParameters类*/

public class postParameters {
    private String userName;
    private String password;

    public postParameters(){

    }
    //login
    public postParameters(String userName , String password){
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}
