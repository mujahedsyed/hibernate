package com.mujahed.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.mujahed.entity.Guide;

@Repository("guideDao")
public class GuideDao extends AbstractDao {

	public List<Guide> findAllGuides() {
		Criteria criteria = this.getSession().createCriteria(Guide.class);
		List<Guide> guides = criteria.list();
		return guides;
	}
}
