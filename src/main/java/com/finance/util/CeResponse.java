package com.finance.util;

import java.util.List;
import java.util.Map;

public class CeResponse {

    private boolean success;
    private String message;
    private Object data;
    private String successCode;
    private Map<String, Object> extras;
    private boolean modified;
    private List<ParamErrors> paramErrors;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    private String errorCode;


    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getSuccessCode() {
        return successCode;
    }

    public void setSuccessCode(String successCode) {
        this.successCode = successCode;
    }

    public Map<String, Object> getExtras() {
        return extras;
    }

    public void setExtras(Map<String, Object> extras) {
        this.extras = extras;
    }

    public boolean isModified() {
        return modified;
    }

    public void setModified(boolean modified) {
        this.modified = modified;
    }
    public List<ParamErrors> getParamErrors() {
        return paramErrors;
    }

    public void setParamErrors(List<ParamErrors> paramErrors) {
        this.paramErrors = paramErrors;
    }


}
