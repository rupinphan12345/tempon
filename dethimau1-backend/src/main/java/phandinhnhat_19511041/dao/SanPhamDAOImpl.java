package phandinhnhat_19511041.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import phandinhnhat_19511041.entity.SanPham;

@Repository
public class SanPhamDAOImpl implements SanPhamDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<SanPham> getDanhSachSanPham() {
		
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<SanPham> theQuery = currentSession.createQuery("from SanPham", SanPham.class);
		List<SanPham> danhSachSanPham = theQuery.getResultList();
		
		return danhSachSanPham;
	}

	@Override
	public void themSanPham(SanPham sanPham) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(sanPham);
		
	}

	@Override
	public void xoaSanPham(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<SanPham> theQuery = currentSession.createQuery("delete from SanPham where id=:maSanPham");
		theQuery.setParameter("maSanPham", id);
		theQuery.executeUpdate();
		
	}

	@Override
	public void suaSanPham(SanPham sanPham) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(sanPham);
		
	}

	@Override
	public SanPham getSanPham(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		SanPham sanPham = currentSession.get(SanPham.class, id);
		return sanPham;
	}

	@Override
	public List<SanPham> getSanPhamTheoLoai(int maLoaiSanPham) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<SanPham> theQuery = currentSession.createQuery("from SanPham where loaiSanPham.id=:maLoaiSanPham");
		theQuery.setParameter("maLoaiSanPham", maLoaiSanPham);
		List<SanPham> danhSachSanPham = theQuery.getResultList();
		return danhSachSanPham;
	}

	

}
