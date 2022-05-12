package fadeevmaxim.steel.controller;
import fadeevmaxim.steel.model.SteelCalculatorModel;
import fadeevmaxim.steel.service.SteelCalculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.BindingResult;

import javax.validation.Valid;

@Controller
public class SteelCalculatorController {
	SteelCalculatorModel steelCalculatorModel = new SteelCalculatorModel();
	@Autowired
	private SteelCalculator steelCalculator;
	@RequestMapping(value = "/steelCalculator")
	public String getSteelCalculator(Model model) {
		model.addAttribute("steelCalculatorModel", steelCalculatorModel);
		return "steelCalculator";
	}
	@RequestMapping(value = "/steelCalculator", params = "sheetWeight", method = RequestMethod.POST)
	public String sheetWeight(@ModelAttribute("steelCalculatorModel") @Valid SteelCalculatorModel steelCalculatorModel, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return"steelCalculator";
		}
		model.addAttribute("resultSheet", steelCalculator.sheetWeight(steelCalculatorModel));
		return "steelCalculator";
	}
	@RequestMapping(value = "/steelCircleCalculator", params = "circleWeight", method = RequestMethod.POST)
	public String circleWeight(@ModelAttribute("steelCalculatorModel") @Valid SteelCalculatorModel steelCalculatorModel, BindingResult bindingResult,  Model model) {
		if(bindingResult.hasErrors()) {
			return"steelCalculator";
		}
		model.addAttribute("resultCircle", steelCalculator.circleWeight(steelCalculatorModel));
		return "steelCalculator";
	}
	@RequestMapping(value = "/steelPipeCalculator", params = "pipeWeight", method = RequestMethod.POST)
	public String pipeWeight(@ModelAttribute("steelCalculatorModel") @Valid SteelCalculatorModel steelCalculatorModel, BindingResult bindingResult, Model model) {
		if(bindingResult.hasErrors()) {
			return"steelCalculator";
		}
		model.addAttribute("resultPipe", steelCalculator.pipeWeight(steelCalculatorModel));
		return "steelCalculator";
	}
}