package phandinhnhat_19511041.model;


public class LoaiSanPham {
	private int id;
	private String tenLoaiSanPham;
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
