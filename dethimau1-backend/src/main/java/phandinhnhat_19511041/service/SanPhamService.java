package phandinhnhat_19511041.service;

import java.util.List;

import phandinhnhat_19511041.entity.SanPham;

public interface SanPhamService {
	List<SanPham> getdanhSachSanPham();
	void themSanPham(SanPham sanPham);
	void xoaSanPham(int id);
	void suaSanPham(SanPham sanPham);
	SanPham getSanPham(int id);
	List<SanPham> getSanPhamTheoLoai(int maLoaiSanPham);
}
