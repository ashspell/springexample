package com.ashspell.ex.lesson03.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashspell.ex.lesson03.dao.ReviewDAO;
import com.ashspell.ex.lesson03.model.Review;

@Service
public class ReviewBO {
	
	@Autowired
	private ReviewDAO reviewDAO;
	
	// id 값을 전달 바당서 해당하는 리뷰 값을 리턴한다
	public Review getReview(int id) {
		
		return reviewDAO.selectReview(id);	
	}
	
	public int addReviewByObject(Review review) {
		return reviewDAO.insertReviewByObject(review);
	}
	
	public int addReviewByField(int storeId, String menu, String userName, double point, String review) {
		 return reviewDAO.insertReviewByField(storeId, menu, userName, point, review);
	}
	
}
