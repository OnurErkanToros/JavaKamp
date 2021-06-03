package com.onurerkantoros.hrms.Cores.Utilities.Result;

public class SuccessDataResult<T> extends DataResult<T>{
    public SuccessDataResult(T data) {
        super(data,true);
    }

    public SuccessDataResult(String message) {
        super(true, message);
    }

    public SuccessDataResult(String message, T data) {
        super(true, message, data);
    }
    public SuccessDataResult(){
        super(null,true);
    }
}
