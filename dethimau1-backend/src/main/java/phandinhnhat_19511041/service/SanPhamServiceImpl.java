package phandinhnhat_19511041.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import phandinhnhat_19511041.dao.SanPhamDAO;
import phandinhnhat_19511041.entity.SanPham;

@Service
public class SanPhamServiceImpl implements SanPhamService{
	
	@Autowired
	private SanPhamDAO sanPhamDAO;

	@Override
	@Transactional
	public List<SanPham> getdanhSachSanPham() {
		return sanPhamDAO.getDanhSachSanPham();
	}

	@Override
	@Transactional
	public void themSanPham(SanPham sanPham) {
		sanPhamDAO.themSanPham(sanPham);
		
	}

	@Override
	@Transactional
	public void xoaSanPham(int id) {
		sanPhamDAO.xoaSanPham(id);
		
	}

	@Override
	@Transactional
	public void suaSanPham(SanPham sanPham) {
		sanPhamDAO.suaSanPham(sanPham);
	}

	@Override
	@Transactional
	public SanPham getSanPham(int id) {
		SanPham sanPham = sanPhamDAO.getSanPham(id);
		return sanPham;
	}

	@Override
	@Transactional
	public List<SanPham> getSanPhamTheoLoai(int maLoaiSanPham) {
		return sanPhamDAO.getSanPhamTheoLoai(maLoaiSanPham);
	}

}
