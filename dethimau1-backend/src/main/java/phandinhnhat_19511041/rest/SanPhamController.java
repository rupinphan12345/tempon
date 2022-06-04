package phandinhnhat_19511041.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import phandinhnhat_19511041.entity.SanPham;
import phandinhnhat_19511041.service.SanPhamService;

@RestController
@RequestMapping("/api")
public class SanPhamController {
	@Autowired
	private SanPhamService sanPhamService;
	
	@GetMapping("/danhSachSanPham")
	public List<SanPham> getDanhSachSanPham(@RequestParam(name = "maLoaiSanPham", required = false) Optional<Integer> maLoaiSanPham ) {
		if(maLoaiSanPham.isPresent()) {
			return sanPhamService.getSanPhamTheoLoai(maLoaiSanPham.get());
		}else {
			return sanPhamService.getdanhSachSanPham();			
		}
		
	}
	
	@PostMapping("/danhSachSanPham")
	public SanPham themSanPham(@RequestBody SanPham sanPham) {
		sanPham.setId(0);
		sanPhamService.themSanPham(sanPham);
		return sanPham;
	}
	
	@DeleteMapping("/danhSachSanPham/{id}")
	public void xoasSanPham(@PathVariable int id) {
		sanPhamService.xoaSanPham(id);
	}
	
	@PutMapping("/danhSachSanPham")
	public SanPham suaSanPham(@RequestBody SanPham sanPham) {
		sanPhamService.suaSanPham(sanPham);
		return sanPham;
	}
	
	@GetMapping("/danhSachSanPham/{id}")
	public SanPham getSanPham(@PathVariable int id) {
		return sanPhamService.getSanPham(id);
	}
	
}
