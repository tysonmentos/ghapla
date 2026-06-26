
// @Service
// @Transactional
// @RequiredArgsConstructor
// public class JobPortalService {

//     private final CompanyRepository companyRepository;

//     private final JobRepository jobRepository;

//     // 1. List all companies by industry and location
//     public List<Company> getCompaniesByIndustryAndLocation(Industry industry, String location) {
//         return companyRepository.findByIndustryAndLocation(industry, location);
//     }

//     // 2. Post new job opening
//     public Job postJob(Job job) {
//         // Extract the company ID from the nested entity structure
// //        Long companyId = job.getCompany().getId();
// //
// //        // Fetch and verify the company exists to establish the relationship
// //        Company company = companyRepository.findById(companyId)
// //                .orElseThrow(() -> new RuntimeException("Company not found"));
// //
// //        // Attach the persistent Company entity back to the Job object
// //        job.setCompany(company);

//         return jobRepository.save(job);
//     }


//     // 3. List all job openings from a specific location
//     public List<Job> getJobsByLocation(String location) {
//         return jobRepository.findByLocation(location);
//     }

//     // 4. Delete jobs by type and company name
//     public void deleteJobsByTypeAndCompany(JobType jobType, String companyName) {
//         Company company = companyRepository.findByName(companyName)
//                 .orElseThrow(() -> new RuntimeException("Company not found"));
//         jobRepository.deleteByJobTypeAndCompany(jobType, company);
//     }

//     // 5. Update salary for specific company jobs by title
//     public List<Job> updateSalary(Long companyId, String title, Double newSalary) {
//         Company company = companyRepository.findById(companyId)
//                 .orElseThrow(() -> new RuntimeException("Company not found"));

//         List<Job> jobs = jobRepository.findByCompanyAndTitle(company, title);
//         jobs.forEach(job -> job.setSalary(newSalary));
//         return jobRepository.saveAll(jobs);
//     }

//     // 6. List jobs by industry and minimum salary
//     public List<Job> getJobsByIndustryAndMinSalary(Industry industry, Double minSalary) {
//         return jobRepository.findByIndustryAndMinSalary(industry, minSalary);
//     }

//     // 7. Update job status to UNAVAILABLE
//     public List<Job> markJobsAsUnavailable(String companyName, String title) {
//         Company company = companyRepository.findByName(companyName)
//                 .orElseThrow(() -> new RuntimeException("Company not found"));

//         List<Job> jobs = jobRepository.findByCompanyAndTitle(company, title);
//         jobs.forEach(job -> job.setStatus(Status.UNAVAILABLE));
//         return jobRepository.saveAll(jobs);
//     }
// }

