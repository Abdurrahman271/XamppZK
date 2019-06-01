package service;
import java.util.List;
public class MstBillingAddressService {

	
	public List<MstBillingAddressDto> findAllDeletedFalse();
	public void save(MstBillingAddressDto mstBillingAddressDto);
	public void update(MstBillingAddressDto mstBillingAddressDto);
	public void delete(MstBillingAddressDto mstBillingAddressDto);
	public MstBillingAddressDto findById(String Id);
	
}

