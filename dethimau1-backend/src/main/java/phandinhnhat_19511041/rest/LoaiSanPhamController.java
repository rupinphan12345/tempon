package phandinhnhat_19511041.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import phandinhnhat_19511041.entity.LoaiSanPham;
import phandinhnhat_19511041.service.LoaiSanPhamService;

@RestController
@RequestMapping("/api")
public class LoaiSanPhamController {
	@Autowired
	private LoaiSanPhamService loaiSanPhamService;
	
	@GetMapping("/danhSachLoaiSanPham")
	public List<LoaiSanPham> getDanhSachLoaiSanPham() {
		return loaiSanPhamService.getDanhSachLoaiSanPham();
	}
}
