package phandinhnhat_19511041.service;

import java.util.List;

import phandinhnhat_19511041.model.SanPham;

public interface SanPhamService {
	List<SanPham> getDanhSachSanPham();
	void xoaSanPham(int id);
	void saveSanPham(SanPham sanPham);
	List<SanPham> getDanhSachSanPhamTheoLoai(int maLoaiSanPham);
	SanPham getSanPham(int id);
}
