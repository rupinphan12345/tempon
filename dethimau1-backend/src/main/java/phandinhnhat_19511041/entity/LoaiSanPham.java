package phandinhnhat_19511041.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "loaiSanPham")
public class LoaiSanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "tenLoaiSanPham")
	private String tenLoaiSanPham;
	
	@OneToMany(mappedBy = "loaiSanPham")
	private List<SanPham> danhSachSanPham;

	public LoaiSanPham() {
		super();
	}

	public LoaiSanPham(int id) {
		super();
		this.id = id;
	}

	public LoaiSanPham(String tenLoaiSanPham) {
		super();
		this.tenLoaiSanPham = tenLoaiSanPham;
	}

	public LoaiSanPham(int id, String tenLoaiSanPham) {
		super();
		this.id = id;
		this.tenLoaiSanPham = tenLoaiSanPham;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenLoaiSanPham() {
		return tenLoaiSanPham;
	}

	public void setTenLoaiSanPham(String tenLoaiSanPham) {
		this.tenLoaiSanPham = tenLoaiSanPham;
	}

	@Override
	public String toString() {
		return "LoaiSanPham [id=" + id + ", tenLoaiSanPham=" + tenLoaiSanPham + "]";
	}
	
	
}
