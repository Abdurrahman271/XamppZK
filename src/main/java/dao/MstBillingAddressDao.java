package dao;
import java.util.List;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import entity.MstBillingAddress;
import entity.pk.MstBillingAddressPk;

public interface MstBillingAddressDao extends JpaRepository<MstBillingAddress, MstBillingAddressPk>{
	
	@Query(value="SELECT p FROM MstBillingAddress p WHERE p.deleted = false")
	public List<MstBillingAddress> findAllDeleted();

}
