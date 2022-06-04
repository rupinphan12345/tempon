package phandinhnhat_19511041.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sanPham")
public class SanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "tenSanPham")
	private String tenSanPham;
	
	@Column(name = "donGia")
	private double donGia;
	
	@ManyToOne
	@JoinColumn(name = "loaiSanPhamID")
	private LoaiSanPham loaiSanPham;

	public SanPham(int id, String tenSanPham, double donGia) {
		super();
		this.id = id;
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
	}

	public SanPham() {
		super();
	}

	public SanPham(int id) {
		super();
		this.id = id;
	}

	public SanPham(String tenSanPham, double donGia, LoaiSanPham loaiSanPham) {
		super();
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.loaiSanPham = loaiSanPham;
	}

	public SanPham(int id, String tenSanPham, double donGia, LoaiSanPham loaiSanPham) {
		super();
		this.id = id;
		this.tenSanPham = tenSanPham;
		this.donGia = donGia;
		this.loaiSanPham = loaiSanPham;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}

	public LoaiSanPham getLoaiSanPham() {
		return loaiSanPham;
	}

	public void setLoaiSanPham(LoaiSanPham loaiSanPham) {
		this.loaiSanPham = loaiSanPham;
	}

	@Override
	public String toString() {
		return "SanPham [id=" + id + ", tenSanPham=" + tenSanPham + ", donGia=" + donGia + ", loaiSanPham="
				+ loaiSanPham + "]";
	}
	
	
}
