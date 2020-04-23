package contract.controller.form;

import java.io.Serializable;

import lombok.Data;

@Data
public class HelloForm implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String val1;
	String val2;
	
}
