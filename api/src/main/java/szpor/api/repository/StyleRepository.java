package szpor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import szpor.api.model.Style;
@Repository
public interface StyleRepository extends JpaRepository<Style, Long> {
}
