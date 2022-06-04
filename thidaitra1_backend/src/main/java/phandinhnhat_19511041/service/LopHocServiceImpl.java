package phandinhnhat_19511041.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import phandinhnhat_19511041.dao.LopHocDao;
import phandinhnhat_19511041.entity.LopHoc;

@Service
public class LopHocServiceImpl implements LopHocService{
	@Autowired
	private LopHocDao lopHocDao;

	@Override
	@Transactional
	public List<LopHoc> getDSLopHoc() {
		// TODO Auto-generated method stub
		return lopHocDao.getDSLopHoc();
	}

	@Override
	@Transactional
	public void themLopHoc(LopHoc lopHoc) {
		lopHocDao.themLopHoc(lopHoc);
		
	}

	@Override
	@Transactional
	public void xoaLopHoc(int id) {
		// TODO Auto-generated method stub
		lopHocDao.xoaLopHoc(id);
		
	}

	@Override
	@Transactional
	public LopHoc getLopHoc(int id) {
		// TODO Auto-generated method stub
		return lopHocDao.getLopHoc(id);
	}

	@Override
	@Transactional
	public void suaLopHoc(LopHoc lopHoc) {
		// TODO Auto-generated method stub
		lopHocDao.suaLopHoc(lopHoc);
	}

}
