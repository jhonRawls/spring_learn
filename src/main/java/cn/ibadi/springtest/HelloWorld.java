package cn.ibadi.springtest;

public class HelloWorld {
	private String message;

	public void getMessage() {
		System.out.println("you message" + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init(){
		System.out.println("bean is going through init.");
	}
	
	public void destory(){
		System.out.println("Bean will destory init.");
	}
}

