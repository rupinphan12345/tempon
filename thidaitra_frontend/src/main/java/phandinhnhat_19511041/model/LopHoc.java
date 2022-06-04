package phandinhnhat_19511041.model;

public class LopHoc {
	private int id;
	private String tenLopHoc;
	private String dayNha;
	private String buoiHoc;
	public LopHoc(int id, String tenLopHoc, String dayNha, String buoiHoc) {
		super();
		this.id = id;
		this.tenLopHoc = tenLopHoc;
		this.dayNha = dayNha;
		this.buoiHoc = buoiHoc;
	}
	public LopHoc() {
		super();
	}
	public LopHoc(String tenLopHoc, String dayNha, String buoiHoc) {
		super();
		this.tenLopHoc = tenLopHoc;
		this.dayNha = dayNha;
		this.buoiHoc = buoiHoc;
	}
	public LopHoc(int id) {
		super();
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTenLopHoc() {
		return tenLopHoc;
	}
	public void setTenLopHoc(String tenLopHoc) {
		this.tenLopHoc = tenLopHoc;
	}
	public String getDayNha() {
		return dayNha;
	}
	public void setDayNha(String dayNha) {
		this.dayNha = dayNha;
	}
	public String getBuoiHoc() {
		return buoiHoc;
	}
	public void setBuoiHoc(String buoiHoc) {
		this.buoiHoc = buoiHoc;
	}
	@Override
	public String toString() {
		return "LopHoc [id=" + id + ", tenLopHoc=" + tenLopHoc + ", dayNha=" + dayNha + ", buoiHoc=" + buoiHoc + "]";
	}
	
	
}
