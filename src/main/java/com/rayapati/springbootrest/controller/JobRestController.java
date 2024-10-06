package com.rayapati.springbootrest.controller;

import com.rayapati.springbootrest.model.JobPost;
import com.rayapati.springbootrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService jobService;

    @GetMapping(path = "jobPosts", produces = "application/json")
    public List<JobPost> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("jobPost/{jobId}")
    public JobPost getJob(@PathVariable("jobId") int jobId) {
        return jobService.getJob(jobId);
    }

    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword) {
        return jobService.search(keyword);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost) {
        jobService.addJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost) {
        jobService.updateJob(jobPost);
        return jobService.getJob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{jobId}")
    public String deleteJob(@PathVariable("jobId") int postId) {
        jobService.deleteJob(postId);
        return "Deleted";
    }

    @GetMapping("load")
    public String loadData() {

        jobService.load();

        return "success";
    }

}
