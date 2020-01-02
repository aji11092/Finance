package com.finance.util;



import java.io.Serializable;
import java.util.List;

public class RestResponseForFalse implements Serializable {

    private static final long serialVersionUID = 3392828328687879107L;

    private String summary;

    private String description;

    private String errorCode;

    private Integer statusCode;

    private List<ParamErrors> paramErrors;

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public List<ParamErrors> getParamErrors() {
        return paramErrors;
    }

    public void setParamErrors(List<ParamErrors> paramErrors) {
        this.paramErrors = paramErrors;
    }

    public RestResponseForFalse(String summary, String description, String errorCode, Integer statusCode, List<ParamErrors> paramErrors) {
        this.summary = summary;
        this.description = description;
        this.errorCode = errorCode;
        this.statusCode = statusCode;
        this.paramErrors = paramErrors;
    }
}