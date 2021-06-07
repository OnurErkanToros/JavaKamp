package com.onurerkantoros.hrms.Cores.Utilities.Result;

public class SuccessDataResult<T> extends DataResult<T>{
    public SuccessDataResult(T data) {
        super(data,true);
    }

    public SuccessDataResult(String message) {
        super(true, message);
    }

    public SuccessDataResult(T data ,String message) {
        super(true, message, data);
    }
    public SuccessDataResult(){
        super(null,true);
    }
}
