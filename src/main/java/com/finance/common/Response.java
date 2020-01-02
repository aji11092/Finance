package com.finance.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.finance.util.ParamErrors;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author Suresh.c
 *
 */
@ApiModel(value = "ResponseModel",description = "Response model for each operation,every response will be shown by using this entity fields.")
public class Response {

	
	@ApiModelProperty(value = "Boolean value showing success in response,either true/false")
	private boolean success;
	@ApiModelProperty(value = "message to be shown in response",notes = "success/failure")
	private String message;
	@ApiModelProperty(value = "data object which will contain the resulting data")
	private Object data;
	@ApiModelProperty(value = "response code.")
	private String errorCode;
	@ApiModelProperty(value = "extras - to show if any extra information to be shown")
	private Map<String, Object> extras;
	@ApiModelProperty(value = "successCode - to show if success")
	private String successCode;
    @ApiModelProperty(value = "paramErrors - to show params with errors on giving invalid request parametres")
    private List<ParamErrors> paramErrors;
    public Response() {
    }
    public Response(Boolean success, String message, Object data, String errorCode) {
        this.success = success;
        this.message = message;
        this.data = data;
        this.errorCode = errorCode;
    }

	/**
	 * @return the extras
	 */
	public Map<String, Object> getExtras() {
		if (extras == null) {
			extras = new HashMap<>();
		}
		return extras;
	}

	/**
	 * @param extras
	 *            the extras to set
	 */
	public void setExtras(Map<String, Object> extras) {
		this.extras = extras;
	}

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
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
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

    public List<ParamErrors> getParamErrors() {
        return paramErrors;
    }

    public void setParamErrors(List<ParamErrors> paramErrors) {
        this.paramErrors = paramErrors;
    }

  
}
