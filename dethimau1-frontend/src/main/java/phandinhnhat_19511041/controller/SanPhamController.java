package phandinhnhat_19511041.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import phandinhnhat_19511041.model.LoaiSanPham;
import phandinhnhat_19511041.model.SanPham;
import phandinhnhat_19511041.service.SanPhamService;

@Controller
@RequestMapping("")
public class SanPhamController {
	@Autowired
	private SanPhamService sanPhamService;
	
	private int maLoaiSanPhamCurrent = -1;
	
	@GetMapping("/danhSachSanPham")
	public String getDanhSachSanPham(Model model, @RequestParam(name = "maLoaiSanPham", required = false) int maLoaiSanPham) {
		maLoaiSanPhamCurrent = maLoaiSanPham;
		List<SanPham> danhSachSanPham;
		danhSachSanPham = sanPhamService.getDanhSachSanPhamTheoLoai(maLoaiSanPham);
		model.addAttribute("danhSachSanpham", danhSachSanPham);
		return "danh-sach-san-pham";
	}
	
	@GetMapping("/danhSachSanPham/delete")
	public String xoaSanPham(@RequestParam("maSanPham") int id) {
		sanPhamService.xoaSanPham(id);
		return "redirect:/danhSachSanPham?maLoaiSanPham="+maLoaiSanPhamCurrent;
	}
	
	@GetMapping("/formSanPham")
	public String showFormSanPham(Model model) {
		SanPham sanPham = new SanPham();
		model.addAttribute("sanPham", sanPham);
		return "form-san-pham";
	}
	
	@PostMapping("/saveSanPham")
	public String saveSanPham(@ModelAttribute("sanPham") SanPham sanPham) {
		sanPham.setLoaiSanPham(new LoaiSanPham(maLoaiSanPhamCurrent));
		sanPhamService.saveSanPham(sanPham);
		return "redirect:/danhSachSanPham?maLoaiSanPham="+maLoaiSanPhamCurrent;
	}
	
	@GetMapping("/showFromUpdate")
	public String updateSanPham(Model model,@RequestParam("maSanPham") int id) {
		SanPham sanPham = sanPhamService.getSanPham(id);
		sanPham.setLoaiSanPham(new LoaiSanPham(maLoaiSanPhamCurrent));
		model.addAttribute("sanPham", sanPham);
		return "form-san-pham";
	}
	
}
