package com.mujahed.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mujahed.dao.GuideDao;
import com.mujahed.entity.Guide;

@Service("guideService")
@Transactional
public class GuideService {

	@Autowired
	private GuideDao dao;

	public List<Guide> getAllGuides() {
		return dao.findAllGuides();
	}
}
