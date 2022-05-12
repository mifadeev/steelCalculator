package fadeevmaxim.steel.service;
import fadeevmaxim.steel.model.SteelCalculatorModel;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class SteelCalculator {
	DecimalFormat decimalFormat = new DecimalFormat("#.##");
	public String sheetWeight(SteelCalculatorModel model) {
		Double sweetWeightResult = (model.getLength() / 1000) * (model.getWidth() / 1000) * model.getHeight() * 7.85;
		String resultSweet = decimalFormat.format(sweetWeightResult);
		return resultSweet;
	}
	public String circleWeight(SteelCalculatorModel model) {
		Double circleWeightResult = (((model.getDiameter() / 1000) * (model.getDiameter() / 1000) * 0.02466) / 4) * (model.getCircleLength());
		String resultCircle = decimalFormat.format(circleWeightResult);
		return resultCircle;
	}
	public String pipeWeight(SteelCalculatorModel model) {
		Double pipeWeightResult = ((model.getPipeDiameter() - model.getPipeDepth()) * model.getPipeDepth() * (model.getPipeLength() / 1000));
		String resultPipe = decimalFormat.format(pipeWeightResult);
		return resultPipe;
	}
}
