package phandinhnhat_19511041.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import phandinhnhat_19511041.model.LoaiSanPham;
import phandinhnhat_19511041.service.LoaiSanPhamService;

@Controller
@RequestMapping("")
public class LoaiSanPhamController {
	
	@Autowired
	private LoaiSanPhamService loaiSanPhamService;
	
	@GetMapping("/danhSachLoaiSanPham")
	public String getDanhSachLoaiSanPham(Model model) {
		List<LoaiSanPham> danhSachLoaiSanPham = loaiSanPhamService.getDanhSachLoaiSanPham();
		System.out.println(danhSachLoaiSanPham);
		model.addAttribute("danhSachLoaiSanPham", danhSachLoaiSanPham);
		return "danh-sach-loai-san-pham";
	}

}
