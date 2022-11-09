package kr.co.api.backend.dao;

import kr.co.api.backend.dto.ReviewDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
public interface ReviewDAO {
    void saveReview(ReviewDTO reviewDTO);
    ReviewDTO getReview(@Param("reviewId") String reviewId);
    List<ReviewDTO> getReviewsByKeySet(@Param("reviewUpdateDate") String reviewUpdateDate,
                                       @Param("reviewId") String reviewId);
    List<ReviewDTO> getReviewsForMap();
    void deleteReviews(@Param("reviewIds") List<String> reviewIds);
}
