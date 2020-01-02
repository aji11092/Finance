package com.finance.common;

/**
 * @author Suresh.C
 *
 */
/**
 * This class is used to store all error messages.
 */

public class ErrorMessages {
	
	public static final String NO_ENTRY_FOUND = "No entry found";
	public static final String METHOD_NOT_SUPPORTED = "Method not supported for provided Ids.";
	public static final String ACCESS_DENIED = "Access Denied";
	public static final String INVALID_PROFILE = "Requested profile is Invalid or Deleted";

	public static final String INTERNAL_SERVER_ERROR = "Internal server error";
	public static final String PROFILE_DUPLICATE_ERROR = "A profile already exist in this name";
	public static final String PAGE_DUPLICATE_ERROR = "A page already exist in this name for this profile";
	public static final String ASSET_DUPLICATE_ERROR="Asset with same asset id already exists";
	public static final String ASSET_ID_MISSING_MESSAG="Given asset id is null";
	public static final String INVALID_PARAMETERS="INVALID_PARAMETERS";
	public static final String INVALID_REQUEST = "Invalid Request Parameter";
	public static final String CATEGORY_ALREADY_ASSIGNED = "This Category already assgined to some report";

	public static final String STRIPE_PARAMETERS = "STRIPE_PARAMETERS";

	private ErrorMessages(){

	}

}
