package Ankit.Coronavirus.tracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Ankit.Coronavirus.tracker.model.LocationStats;
import Ankit.Coronavirus.tracker.services.Services;

@Controller
public class HomeController {
	
	@Autowired
	Services services;
	
	@GetMapping("/")
	public String home(Model model) {
		List<LocationStats> allStats =  services.getAllStats();
		int totalReportedCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
		int totalNewCases = allStats.stream().mapToInt(stat -> stat.getDiffromprevday()).sum();
		model.addAttribute("locationStats",allStats);
		model.addAttribute("totalReportedCases",totalReportedCases);
		model.addAttribute("totalNewCases", totalNewCases);
		return "home";
	}
}
