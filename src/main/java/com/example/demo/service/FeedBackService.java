package com.example.demo.service;

import com.example.demo.entities.Category;
import com.example.demo.entities.FeedBack;
import com.example.demo.implementService.IFeedBackService;
import com.example.demo.repo.FeedBackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeedBackService implements IFeedBackService {
    @Autowired
    private FeedBackRepository feedBackRepository;
    @Override
    public FeedBack addFeedBack(FeedBack feedBack) {
        return feedBackRepository.save(feedBack);
    }

    @Override
    public FeedBack updateFeedBack(FeedBack feedBack) {
        if(feedBack != null){
            FeedBack feedBack1 = feedBackRepository.getById(feedBack.getFeedBackId());
            if(feedBack1 != null){
                feedBack1.setContent(feedBack.getContent());
                feedBack1.setName(feedBack.getName());
                feedBack1.setEmail(feedBack.getEmail());
                feedBack1.setTime(feedBack.getTime());

                return feedBackRepository.save(feedBack1);
            }
        }
        return null;
    }

    @Override
    public boolean deleteCFeedBack(Long id) {
        FeedBack feedBack = feedBackRepository.getById(id);
        if(feedBack != null){
            feedBackRepository.delete(feedBack);
            return true;
        }
        return false;
    }

    @Override
    public List<FeedBack> getAllFeedBack() {
        return feedBackRepository.findAll();
    }

    @Override
    public Optional<FeedBack> getFeedBackById(Long id) {
        return Optional.empty();
    }
}
