package in.ashokit;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.ashokit.entity.EligibilityDetails;

public interface EligibilityDetailsRepo extends JpaRepository<EligibilityDetails, Integer> {

	@Query("select distinct(planName) from EligibilityDetails")
	public List<String> findPlanNames();

	@Query("select distinct(planStatus) from EligibilityDetails")
	public List<String> findPlanStatuses();

}