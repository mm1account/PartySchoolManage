package com.mqf.partyschoolmanage.Entity;

public class RespEntity {

    private int code;
    private String msg;
    private Object data;
//    private String token;
//    private int sign;
    public RespEntity(RespCode respCode){
        this.code=respCode.getCode();
        this.msg=respCode.getMsg();
    }

    public RespEntity(){

    }
//    public RespEntity(RespCode respCode,String token){
//        this(respCode);
//        this.token=token;
//    }
//    public RespEntity(int sign,Object userData){
//        this.sign=sign;
//        this.data=userData;
//    }
    public RespEntity(RespCode respCode,Object data){
            this.code = respCode.getCode();
            this.msg = respCode.getMsg();
            this.data = data;
//        this.token=token;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }

//    public void setToken(String token) {
//        this.token = token;
//    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

//    public String getToken() {
//        return token;
//    }

//    public int getSign() {
//        return sign;
//    }

//    public void setSign(int sign) {
//        this.sign = sign;
//    }
//    @Override
//    public String toString() {
//        return "RespEntity{" +
//                "code=" + code +
//                ", msg='" + msg + '\'' +
//                ", data=" + data +
//                ", token='" + token + '\'' +
//                ", sign=" + sign +
//                '}';
//    }

    @Override
    public String toString() {
        return "RespEntity{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
