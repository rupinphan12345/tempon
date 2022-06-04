package phandinhnhat_19511041.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import phandinhnhat_19511041.model.LopHoc;
import phandinhnhat_19511041.service.LopHocService;

@Controller
@RequestMapping("")
public class LopHocController {
	@Autowired
	private LopHocService lopHocService;
	
	@GetMapping("/danhSachLopHoc")
	public String getDSLopHoc(Model model) {
		List<LopHoc> dsLopHoc = lopHocService.getDSLopHoc();
		model.addAttribute("dsLopHoc",dsLopHoc);
		return "danhSachLopHoc";
	}
	
	@PostMapping("/saveLopHoc")
	public String saveLopHoc(@ModelAttribute("lopHoc") LopHoc lopHoc) {
		lopHocService.themLopHoc(lopHoc);
		return "redirect:/danhSachLopHoc";
	}
	
	@GetMapping("/formLopHoc")
	public String showFormLopHoc(Model model) {
		LopHoc lopHoc = new LopHoc();
		model.addAttribute("lopHoc",lopHoc);
		return "formLopHoc";
	}
	
	@GetMapping("/danhSachLopHoc/delete")
	public String xoaLopHoc(@RequestParam("maLopHoc") int maLopHoc) {
		lopHocService.xoaLopHoc(maLopHoc);
		return "redirect:/danhSachLopHoc";
	}
	
	
	@GetMapping("/showFormUpdate")
	public String showFormUpdate(Model model, @RequestParam("maLopHoc") int id) {
		LopHoc lopHoc = lopHocService.getLopHoc(id);
		model.addAttribute("lopHoc",lopHoc);
		return "formLopHoc";
	}
	
	
}
