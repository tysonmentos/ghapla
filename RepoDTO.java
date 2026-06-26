// import com.backend.entity.Company;
// import com.backend.entity.Industry;
// import com.backend.entity.Job;
// import com.backend.entity.JobType;
// import jakarta.persistence.*;
// import lombok.*;
// import org.hibernate.annotations.CreationTimestamp;
// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;

// import java.time.LocalDate;


// public interface CompanyRepository extends JpaRepository<Company, Long> {
//     List<Company> findByIndustryAndLocation(Industry industry, String location);
//     Optional<Company> findByName(String name);
// }

// ----------------------------------------------------------------------------------------------------


// public interface JobRepository extends JpaRepository<Job, Long> {
//     List<Job> findByLocation(String location);

//     List<Job> findByCompanyAndTitle(Company company, String title);

//     @Query("SELECT j FROM Job j WHERE j.company.industry = :industry AND j.salary >= :minSalary")
//     List<Job> findByIndustryAndMinSalary(@Param("industry") Industry industry, @Param("minSalary") Double minSalary);

//     void deleteByJobTypeAndCompany(JobType jobType, Company company);
// }


// ----------------------------------------------------------------------------------------------------------


// @Entity
// @Table(name = "jobs")
// @Getter
// @Setter
// @AllArgsConstructor
// @NoArgsConstructor
// @ToString

// public class Job {
//     @Id
//     @GeneratedValue(strategy = GenerationType.IDENTITY)
//     @Column(name = "job_id")
//     private Long id;


//     @Column(name = "title", length = 30, nullable = false)
//     private String title;

//     @Column(name = "salary")
//     private int salary;

//     @Column(name = "location", length = 30)
//     private String location;

//     @Enumerated(EnumType.STRING)
//     private JobType jobType;

//     @CreationTimestamp
//     @Column(name="posted_date")
//     private LocalDate postedDate;

//     @Enumerated(EnumType.STRING)
//     private Status status;

//     @ManyToOne(fetch = FetchType.LAZY)
//     @JoinColumn(name = "company_id", nullable = false)
//     private Company company;

// ----------------------------------------------------------------------------------------------------------------------------------------

//     @RestControllerAdvice
// public class GlobalExceptionHandler {

// @ExceptionHandler(ResourceNotFoundException.class)
// public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException e) {
// return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new apiResponse(e.getMessage(), "Failed"));
// }



// @ExceptionHandler(Exception.class)
// public ResponseEntity<?>handleException(Exception e){
// return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new apiResponse(e.getMessage(), "Failed"));
// }
// }
