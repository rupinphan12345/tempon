package phandinhnhat_19511041.service;

import java.util.List;

import phandinhnhat_19511041.entity.LopHoc;

public interface LopHocService {
	List<LopHoc> getDSLopHoc();
	void themLopHoc(LopHoc lopHoc);
	void xoaLopHoc(int id);
	LopHoc getLopHoc(int id);
	void suaLopHoc(LopHoc lopHoc);
}
