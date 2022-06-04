package phandinhnhat_19511041.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import phandinhnhat_19511041.entity.LopHoc;

@Repository
public class LopHocDAOImpl implements LopHocDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<LopHoc> getDSLopHoc() {
		// TODO Auto-generated method stub
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<LopHoc> theQuery = currentSession.createQuery("from LopHoc", LopHoc.class);
		List<LopHoc> dsLopHoc = theQuery.getResultList();
		
		return dsLopHoc;
	}

	@Override
	public void themLopHoc(LopHoc lopHoc) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(lopHoc);
		
	}

	@Override
	public void xoaLopHoc(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<LopHoc> theQuery = currentSession.createQuery("delete from LopHoc where id=:id");
		theQuery.setParameter("id", id);
		theQuery.executeUpdate();
		
	}

	@Override
	public LopHoc getLopHoc(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		LopHoc lopHoc = currentSession.get(LopHoc.class, id);
		return lopHoc;
	}

	@Override
	public void suaLopHoc(LopHoc lopHoc) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(lopHoc);
		
	}
	
}
