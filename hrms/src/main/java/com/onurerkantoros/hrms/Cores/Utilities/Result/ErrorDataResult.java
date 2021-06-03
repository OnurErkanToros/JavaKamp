package com.onurerkantoros.hrms.Cores.Utilities.Result;

public class ErrorDataResult<T> extends DataResult<T> {
    public ErrorDataResult(T data){
        super(data,false);
    }
    public ErrorDataResult(String message) {
        super(false, message);
    }

    public ErrorDataResult( String message, T data) {
        super(false, message, data);
    }
    public ErrorDataResult(){
        super(null,false);
    }
}
