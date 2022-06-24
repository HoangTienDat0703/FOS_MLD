package com.example.demo.implementService;

import com.example.demo.entities.Category;
import com.example.demo.entities.FeedBack;

import java.util.List;
import java.util.Optional;

public interface IFeedBackService {
    public FeedBack addFeedBack(FeedBack feedBack);

    public FeedBack updateFeedBack(FeedBack feedBack);

    public boolean deleteCFeedBack(Long id);

    public List<FeedBack> getAllFeedBack();

    public Optional<FeedBack> getFeedBackById(Long id);
}
