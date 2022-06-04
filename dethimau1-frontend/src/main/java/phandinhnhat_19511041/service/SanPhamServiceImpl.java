package phandinhnhat_19511041.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import phandinhnhat_19511041.model.SanPham;

@Service
public class SanPhamServiceImpl implements SanPhamService{
	
	private RestTemplate restTemplate;
	private String crmRestURL;
	
	@Autowired
	public SanPhamServiceImpl(RestTemplate theRestTemplate, @Value("${crm.rest.url}") String theURL) {
		// TODO Auto-generated constructor stub
		restTemplate = theRestTemplate;
		crmRestURL = theURL;
	}

	@Override
	public List<SanPham> getDanhSachSanPham() {
		ResponseEntity<List<SanPham>> responseEntity = 
				restTemplate.exchange(crmRestURL + "/danhSachSanPham", HttpMethod.GET, null,
						new ParameterizedTypeReference<List<SanPham>>() {
						});
		
		List<SanPham> danhSachSanPham = responseEntity.getBody();
		return danhSachSanPham;

	}

	@Override
	public void xoaSanPham(int id) {
		restTemplate.delete(crmRestURL + "/danhSachSanPham/" + id);
		
	}

	@Override
	public void saveSanPham(SanPham sanPham) {
		int maSanPham = sanPham.getId();
		
		if(maSanPham == 0) {
			restTemplate.postForEntity(crmRestURL + "/danhSachSanPham", sanPham, SanPham.class);
		}else {
			restTemplate.put(crmRestURL + "/danhSachSanPham", sanPham);
		}
	}

	@Override
	public List<SanPham> getDanhSachSanPhamTheoLoai(int maLoaiSanPham) {
		ResponseEntity<List<SanPham>> responseEntity = 
				restTemplate.exchange(crmRestURL + "/danhSachSanPham?maLoaiSanPham=" + maLoaiSanPham, HttpMethod.GET, null,
						new ParameterizedTypeReference<List<SanPham>>() {
						});
		
		List<SanPham> danhSachSanPham = responseEntity.getBody();
		System.out.println(maLoaiSanPham);
		return danhSachSanPham;
	}

	@Override
	public SanPham getSanPham(int id) {
		SanPham sanPham = restTemplate.getForObject(crmRestURL + "/danhSachSanPham/" + id, SanPham.class);
		return sanPham;
	}
}
