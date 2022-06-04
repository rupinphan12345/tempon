package phandinhnhat_19511041.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import phandinhnhat_19511041.model.LoaiSanPham;

@Service
public class LoaiSanPhamServiceImpl implements LoaiSanPhamService{
	
	private RestTemplate restTemplate;
	private String crmRestURL;
	
	@Autowired
	public LoaiSanPhamServiceImpl(RestTemplate theRestTemplate, @Value("${crm.rest.url}") String theURL) {
		// TODO Auto-generated constructor stub
		restTemplate = theRestTemplate;
		crmRestURL = theURL;
	}

	@Override
	public List<LoaiSanPham> getDanhSachLoaiSanPham() {
		ResponseEntity<List<LoaiSanPham>> responseEntity = 
				restTemplate.exchange(crmRestURL + "/danhSachLoaiSanPham", HttpMethod.GET, null,
						new ParameterizedTypeReference<List<LoaiSanPham>>() {
						});
		List<LoaiSanPham> danhSachLoaiSanPham = responseEntity.getBody();
		return danhSachLoaiSanPham;
	}

}
