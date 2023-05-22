package chapter24.sample;

public enum Color {
	WHITE("WS2202-1"),
	BLACK("BS202-1"),
	GOLD("GS202-1");
	
	private String ModelNumber;

	private Color(String modelNumber) {
		ModelNumber = modelNumber;
	} 

	public String getModelNumber() {
		return ModelNumber;
	}

	public void setModelNumber(String modelNumber) {
		ModelNumber = modelNumber;
	}
	
	
}
