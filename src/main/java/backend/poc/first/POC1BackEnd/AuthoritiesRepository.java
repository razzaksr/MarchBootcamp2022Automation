package backend.poc.first.POC1BackEnd;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthoritiesRepository extends JpaRepository<Authorities, Integer>
{
	public Authorities findByUsername(String username);
}
