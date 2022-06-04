package phandinhnhat_19511041.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import phandinhnhat_19511041.entity.LopHoc;
import phandinhnhat_19511041.service.LopHocService;

@RestController
@RequestMapping("/api")
public class LopHocController {
	
	@Autowired
	private LopHocService lopHocService;
	
	@GetMapping("/danhSachLopHoc")
	public List<LopHoc> getDSLopHoc() {
		return lopHocService.getDSLopHoc();
	}
	
	@PostMapping("/danhSachLopHoc")
	public LopHoc themLopHoc(@RequestBody LopHoc lopHoc) {
		lopHoc.setId(0);
		lopHocService.themLopHoc(lopHoc);
		return lopHoc;
	}
	
	@DeleteMapping("/danhSachLopHoc/{id}")
	public void xoaLopHoc(@PathVariable int id) {
		lopHocService.xoaLopHoc(id);
	}
	
	@GetMapping("/danhSachLopHoc/{id}")
	public LopHoc getLopHoc(@PathVariable int id) {
		return lopHocService.getLopHoc(id);
	}
	
	@PutMapping("/danhSachLopHoc")
	public void suaLopHoc(@RequestBody LopHoc lopHoc) {
		lopHocService.suaLopHoc(lopHoc);
	}
}
