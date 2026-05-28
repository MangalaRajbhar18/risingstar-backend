package com.rsps.responseWrapper;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MyResponseWrapper {
	
	    private Object data;
	    public Object getData() {
			return data;
		}
		public void setData(Object data) {
			this.data = data;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		private String message;
	    
	    

}
