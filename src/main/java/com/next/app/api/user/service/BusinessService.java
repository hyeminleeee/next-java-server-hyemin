package com.next.app.api.user.service;

import com.next.app.api.user.entity.Business;
import com.next.app.api.user.repository.BusinessRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BusinessService {

    @Autowired
    private BusinessRepository businessRepository;

    //기업 전체 조회
    public List<Business> getAllBusiness() {
        return businessRepository.findAll();
    }

    //상품 단건 조회
    public Business getBusinessById(Long id) {
        return businessRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Business Not Found with id: " + id));
    }

    //기업 생성
    public Business createBusiness(Business business) {
        return businessRepository.save(business);
    }
    // 기업 수정
    public Business updateBusiness(Long id, Business updatedBusiness) {
        Business business = businessRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Business not found with id: " + id));
        business.setBusinessNumber(updatedBusiness.getBusinessNumber());
        business.setCompanyName(updatedBusiness.getCompanyName());
        business.setRepresentativeName(updatedBusiness.getRepresentativeName());
        business.setContactEmail(updatedBusiness.getContactEmail());
        business.setContactPhone(updatedBusiness.getContactPhone());
        business.setAddress(updatedBusiness.getAddress());
        return businessRepository.save(business);
    }
    // 기업 삭제
    public void deleteBusiness(Long id) {
        businessRepository.deleteById(id);
    }
}
