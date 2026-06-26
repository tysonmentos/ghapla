

    // @RestController
    // @RequestMapping("/api/portal")
    // @RequiredArgsConstructor
    // public class JobPortalController {


    //     private final JobPortalService service;

    //     // 1. List all companies by industry & location
    //     @GetMapping("/companies")
    //     public ResponseEntity<List<Company>> getCompanies(
    //             @RequestParam Industry industry,
    //             @RequestParam String location) {
    //         return ResponseEntity.ok(service.getCompaniesByIndustryAndLocation(industry, location));
    //     }

    //     // 2. Post new job opening
    //     @PostMapping("/jobs")
    //     public ResponseEntity<Job> postJob(@RequestBody Job job) {
    //         return new ResponseEntity<>(service.postJob(job), HttpStatus.CREATED);
    //     }


    //     // 3. List all job openings from specified location
    //     @GetMapping("/jobs/location/{location}")
    //     public ResponseEntity<List<Job>> getJobsByLocation(@PathVariable String location) {
    //         return ResponseEntity.ok(service.getJobsByLocation(location));
    //     }

    //     // 4. Delete all jobs of specified type & company name
    //     @DeleteMapping("/jobs")
    //     public ResponseEntity<String> deleteJobs(
    //             @RequestParam JobType jobType,
    //             @RequestParam String companyName) {
    //         service.deleteJobsByTypeAndCompany(jobType, companyName);
    //         return ResponseEntity.ok("Jobs deleted successfully.");
    //     }

    //     // 5. Update salaries by company ID and job title
    //     @PutMapping("/jobs/salary")
    //     public ResponseEntity<List<Job>> updateSalary(
    //             @RequestParam Long companyId,
    //             @RequestParam String title,
    //             @RequestParam Double salary) {
    //         return ResponseEntity.ok(service.updateSalary(companyId, title, salary));
    //     }

    //     // 6. List jobs by industry and minimum salary
    //     @GetMapping("/jobs/search")
    //     public ResponseEntity<List<Job>> getJobsByIndustryAndSalary(
    //             @RequestParam Industry industry,
    //             @RequestParam Double minSalary) {
    //         return ResponseEntity.ok(service.getJobsByIndustryAndMinSalary(industry, minSalary));
    //     }

    //     // 7. Update job status to unavailable
    //     @PatchMapping("/jobs/status/unavailable")
    //     public ResponseEntity<List<Job>> closeJobStatus(
    //             @RequestParam String companyName,
    //             @RequestParam String title) {
    //         return ResponseEntity.ok(service.markJobsAsUnavailable(companyName, title));
    //     }
    // }

