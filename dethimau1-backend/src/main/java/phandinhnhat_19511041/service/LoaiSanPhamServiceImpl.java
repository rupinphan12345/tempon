package phandinhnhat_19511041.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import phandinhnhat_19511041.dao.LoaiSanPhamDAO;
import phandinhnhat_19511041.entity.LoaiSanPham;

@Service
public class LoaiSanPhamServiceImpl implements LoaiSanPhamService{
	
	@Autowired
	private LoaiSanPhamDAO loaiSanPhamDAO;
	
	@Override
	@Transactional
	public List<LoaiSanPham> getDanhSachLoaiSanPham() {
		return loaiSanPhamDAO.getDanhSachLoaiSanPham();
	}
	
}
