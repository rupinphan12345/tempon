package phandinhnhat_19511041.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import phandinhnhat_19511041.entity.LoaiSanPham;

@Repository
public class LoaiSanPhamDaoImpl implements LoaiSanPhamDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

//	@Override
	public List<LoaiSanPham> getDanhSachLoaiSanPham() {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<LoaiSanPham> theQuery = currentSession.createQuery("from LoaiSanPham order by tenLoaiSanPham", LoaiSanPham.class);
		List<LoaiSanPham> danhSachLoaiSanPham = theQuery.getResultList();
		
		return danhSachLoaiSanPham;
	}

}
