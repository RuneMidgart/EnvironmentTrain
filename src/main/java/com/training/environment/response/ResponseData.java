package com.training.environment.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseData<T> {
    private long timestamp;
    private Integer code;
    private String message;
    private T data;

    public ResponseData(){
        this.timestamp = System.currentTimeMillis();
    }

    public static <T> ResponseData<T> success(T data){
        ResponseData<T> responseData = new ResponseData<>();
        responseData.setCode(ResponseCode.SUCCESS.getCode());
        responseData.setMessage(ResponseCode.SUCCESS.getMessage());
        responseData.setData(data);
        return responseData;
    }

    public static <T> ResponseData<T> fail(){
        ResponseData<T> responseData = new ResponseData<>();
        responseData.setCode(ResponseCode.FAIL.getCode());
        responseData.setMessage(ResponseCode.FAIL.getMessage());
        return responseData;
    }
}
