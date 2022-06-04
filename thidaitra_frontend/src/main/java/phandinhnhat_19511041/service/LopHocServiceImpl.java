package phandinhnhat_19511041.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import phandinhnhat_19511041.model.LopHoc;

@Service
public class LopHocServiceImpl implements LopHocService{
	
	private RestTemplate restTemplate;
	private String crmRestURL;
	
	@Autowired
	public LopHocServiceImpl(RestTemplate theRestTemplate, @Value("${crm.rest.url}") String theURL) {
		restTemplate = theRestTemplate;
		crmRestURL = theURL;
	}
	
	@Override
	public List<LopHoc> getDSLopHoc() {
		// TODO Auto-generated method stubResPo
		ResponseEntity<List<LopHoc>> responseEntity = restTemplate.exchange(crmRestURL + "/danhSachLopHoc",HttpMethod.GET, null,
				new ParameterizedTypeReference<List<LopHoc>>() {
				});
		List<LopHoc> dsLopHoc = responseEntity.getBody();
		return dsLopHoc;
	}

	@Override
	public void themLopHoc(LopHoc lopHoc) {
		// TODO Auto-generated method stub
		int id = lopHoc.getId();
		if(id == 0) {
			restTemplate.postForEntity(crmRestURL + "/danhSachLopHoc", lopHoc, LopHoc.class);
		}else {
			restTemplate.put(crmRestURL + "/danhSachLopHoc", lopHoc);
		}
		
	}

	@Override
	public void xoaLopHoc(int id) {
		// TODO Auto-generated method stub
		restTemplate.delete(crmRestURL + "/danhSachLopHoc/" + id);
		
	}

	@Override
	public LopHoc getLopHoc(int id) {
		LopHoc lopHoc = restTemplate.getForObject(crmRestURL + "/danhSachLopHoc/" + id, LopHoc.class);
		return lopHoc;
	}


}
