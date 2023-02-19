package io.ctapp.coronavirustracker.controllers;

import io.ctapp.coronavirustracker.models.Locationstats;
import io.ctapp.coronavirustracker.services.CoronaVirusDataScervices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataScervices coronaVirusDataScervices;

    @GetMapping("/")
    public String home(Model model) {
        List<Locationstats> allStats = coronaVirusDataScervices.getAllStats();
        int totalReportedCases = allStats.stream().mapToInt(stat->stat.getLatestTotalCases()).sum();
        model.addAttribute("locationStats",allStats);
        model.addAttribute("totalReportedCases",totalReportedCases);
        return "home";
    }
}
