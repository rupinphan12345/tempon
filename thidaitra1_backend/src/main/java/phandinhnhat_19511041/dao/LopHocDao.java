package phandinhnhat_19511041.dao;

import java.util.List;

import phandinhnhat_19511041.entity.LopHoc;

public interface LopHocDao {
	List<LopHoc> getDSLopHoc();
	void themLopHoc(LopHoc lopHoc);
	void xoaLopHoc(int id);
	LopHoc getLopHoc(int id);
	void suaLopHoc(LopHoc lopHoc);
}
