package com.advert.repository;

import com.advert.models.Ad;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AdRepository extends PagingAndSortingRepository<Ad, Integer> {
}
