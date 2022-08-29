package com.ecopointstandard.demo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.ecopointstandard.demo.domain.EcoPointStandard;
import com.ecopointstandard.demo.repo.PointStandardRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class EcoPointStandardService{

    private final PointStandardRepository pointStandardRepository;

    public String addPointStandard(EcoPointStandard request){
      pointStandardRepository.save(EcoPointStandard.builder()
                .classification(request.getClassification())
                .countweightstandard(request.getCountweightstandard())
                .standardDesc(request.getStandardDesc())
                .ecoPoint(request.getEcoPoint())
                .build());

        return "Success";
    }


    public List<EcoPointStandard> getEcoPointStandardList() {
      List<EcoPointStandard> PointStandardList = pointStandardRepository.findAll();
      // List<User> userList = new ArrayList<>();
      // userList = userRepository.
      // for (User p : posts) {
      //     User post = new User();
          // post.set(p.getSeq());
          // post.setPostTitle(p.getPostTitle());
          // post.setPostContents(p.getPostContents());
          // post.setUserName(p.getUser().getUserName());
          // postList.add(post);
      // }
      return PointStandardList;
  }

    public String editEcoPointStandard(Long standardId, EcoPointStandard request) {
      Optional<EcoPointStandard> standard = pointStandardRepository.findById(standardId);
      // request.setClassification(standard.get().getClassification());
      // request.setCountweightstandard(standard.get().getCountweightstandard());
      // request.setEcoPoint(standard.get().getEcoPoint());
      // request.setStandardDesc(standard.get().getStandardDesc());
      standard.get().setClassification(request.getClassification());
      standard.get().setCountweightstandard(request.getCountweightstandard());
      standard.get().setEcoPoint(request.getEcoPoint());
      standard.get().setStandardDesc(request.getStandardDesc());
      System.out.println(request.getEcoPoint() + " !!!!!!!!!!!!!!!!!!!!!!");
      // request.updateEntity(post.get());
      pointStandardRepository.save(standard.get());
      return "Success";
  }

   public String deleteEcoPointStandard(Long standardId) {
      Optional<EcoPointStandard> standard = pointStandardRepository.findById(standardId);
      pointStandardRepository.delete(standard.get());
      return "Success";
  }

    // public String login(String userId, String password) {
    //   Optional<User> user = pointStandardRepository.findByUserId(userId);
    //   log.info("db password = {}, input password = {}", user.get().getPassword(), password);
    //   if(user.get().getPassword().equals(password)) {
    //     return "Success";
    //   }
    //   return "Failed";
    // }


    
}
