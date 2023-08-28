package pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponsePojo implements Serializable {
	private int code;
	private String type;

	public ResponsePojo() {
	}

	public ResponsePojo(int code, String type) {
		this.code = code;
		this.type = type;
	}

	public void setCode(int code){
		this.code = code;
	}

	public int getCode(){
		return code;
	}

	public void setType(String type){
		this.type = type;
	}

	public String getType(){
		return type;
	}


	@Override
 	public String toString(){
		return 
			"ResponsePojo{" + 
			"code = '" + code + '\'' + 
			",type = '" + type + '\'' +
			"}";
		}
}