package com.rakuten;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class PensionerDetailService {
	
	List<PensionerDetail> details = new ArrayList<>();
	PensionerDetailService() {
		details.add(new PensionerDetail("Ram", "1234567", "12348765", 60000, 5000, "self", "public"));
		details.add(new PensionerDetail("kishore", "5437889", "12345678", 30000, 2000, "family", "private"));
		details.add(new PensionerDetail("Vishu", "234351", "56781234", 70000, 6000, "family", "public"));
		details.add(new PensionerDetail("Imram", "6456234", "56784321", 45000, 3500, "self", "private"));
		
	}
	
	
	PensionerDetail getPensionerDetails(String aadharNumber) {
		List<PensionerDetail> detail = details.stream().filter(pensionDetail -> pensionDetail.getAadharNumber().equals(aadharNumber)).collect(Collectors.toList());
		if(detail.size() == 0) {
			return new PensionerDetail(false);
		}
		System.out.println(detail.get(0));
		return detail.get(0);
	}
}
