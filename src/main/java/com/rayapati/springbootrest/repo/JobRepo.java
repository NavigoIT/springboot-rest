package com.rayapati.springbootrest.repo;

import com.rayapati.springbootrest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {

    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);


//    List<JobPost> jobs = new ArrayList<>(List.of(
//            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2, List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
//            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4, List.of("Python", "Machine Learning", "Data Analysis")),
//            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React", 3, List.of("HTML", "CSS", "JavaScript", "React"))
//    ));
//
//    public List<JobPost> getAllJobs() {
//        return jobs;
//    }
//
//    public void addJob(JobPost jobPost) {
//        jobs.add(jobPost);
//    }
//
//
//    public JobPost getJob(int jobId) {
//        for(JobPost job : jobs) {
//            if(job.getPostId() == jobId) {
//                return job;
//            }
//        }
//        return null;
//    }
//
//    public void updateJob(JobPost jobPost) {
//        for(JobPost job : jobs) {
//            if(job.getPostId() == jobPost.getPostId()) {
//                job.setPostDesc(jobPost.getPostDesc());
//                job.setPostProfile(jobPost.getPostProfile());
//                job.setReqExperience(jobPost.getReqExperience());
//                job.setPostTechStack(jobPost.getPostTechStack());
//            }
//        }
//    }
//
//    public void deleteJob(int postId) {
//        jobs.removeIf(job -> job.getPostId() == postId);
//    }

}
