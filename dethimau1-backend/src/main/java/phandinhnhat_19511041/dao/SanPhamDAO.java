package phandinhnhat_19511041.dao;

import java.util.List;

import phandinhnhat_19511041.entity.SanPham;

public interface SanPhamDAO {
	List<SanPham> getDanhSachSanPham();
	void themSanPham(SanPham sanPham);
	void xoaSanPham(int id);
	void suaSanPham(SanPham sanPham);
	SanPham getSanPham(int id);
	List<SanPham> getSanPhamTheoLoai(int maLoaiSanPham);
}
 