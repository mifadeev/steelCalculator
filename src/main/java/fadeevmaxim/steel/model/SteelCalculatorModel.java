package fadeevmaxim.steel.model;

import javax.validation.constraints.DecimalMin;

public class SteelCalculatorModel {
	@DecimalMin(value = "0.0", inclusive = false, message = "Число должно быть больше 0")
	private Double length;
	@DecimalMin(value = "0.0", inclusive = false, message = "Число должно быть больше 0")
	private Double width;
	@DecimalMin(value = "0.0", inclusive = false, message = "Число должно быть больше 0")
	private Double height;
	@DecimalMin(value = "0.0", inclusive = false, message = "Число должно быть больше 0")
	private Double diameter;
	@DecimalMin(value = "0.0", inclusive = false, message = "Число должно быть больше 0")
	private Double circleLength;
	@DecimalMin(value = "0.0", inclusive = false, message = "Число должно быть больше 0")
	private Double pipeDiameter;
	@DecimalMin(value = "0.0", inclusive = false, message = "Число должно быть больше 0")
	private Double pipeDepth;
	@DecimalMin(value = "0.0", inclusive = false, message = "Число должно быть больше 0")
	private Double pipeLength;
	public SteelCalculatorModel() {}
	public SteelCalculatorModel(Double length, Double width, Double height) {
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public SteelCalculatorModel(Double diameter, Double circleLength) {
		this.diameter = diameter;
		this.circleLength = circleLength;
	}
	public void setlength(Double length) {
		this.length = length;
	}
	public Double getLength() {
		return length;
	}
	public void setWidth(Double width) {
		this.width = width;
	}
	public Double getWidth() {
		return width;
	}
	public void setHeight(Double height) {
		this.height = height;
	}
	public Double getHeight() {
		return height;
	}
	public void setDiameter(Double diameter) {
		this.diameter = diameter;
	}
	public Double getDiameter() {
		return diameter;
	}
	public void setCircleLength(Double circleLength) {
		this.circleLength = circleLength;
	}
	public Double getCircleLength() {
		return circleLength;
	}
	public void setPipeDiameter(Double pipeDiameter) {
		this.pipeDiameter = pipeDiameter;
	}
	public Double getPipeDiameter() {
		return pipeDiameter;
	}
	public void setPipeDepth(Double pipeDepth) {
		this.pipeDepth = pipeDepth;
	}
	public Double getPipeDepth() {
		return pipeDepth;
	}
	public void setPipeLength(Double pipeLength) {
		this.pipeLength = pipeLength;
	}
	public Double getPipeLength() {
		return pipeLength;
	}
}
