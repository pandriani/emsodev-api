package eu.emsodev.observations.api;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-04T09:41:08.096Z")

public class ApiException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int code;
	public ApiException (int code, String msg) {
		super(msg);
		this.code = code;
	}
}
