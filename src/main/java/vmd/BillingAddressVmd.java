

package vmd;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.bind.BindUtils;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zk.ui.util.Clients;
import org.zkoss.zul.Include;
import org.zkoss.zul.Messagebox;

import service.MstBillingAddressService;
import dto.MstBillingAddressDto;

@VariableResolver(org.zkoss.zkplus.spring.DelegatingVariableResolver.class)
public class BillingAddressVmd {
	
	private List<MstBillingAddressDto> listBillingAddress = new ArrayList<MstBillingAddressDto>();
	private MstBillingAddressDto mstBillingAddressDto = new MstBillingAddressDto();
	private boolean readonly = false;
	
	@WireVariable
	private MstBillingAddressService mstBillingAddressSvc;
	
	@Init
	public void load(){
		listBillingAddress = mstBillingAddressSvc.findAll();
	}
	
	@Command(value="add")
	public void add(){
		MstBillingAddressDto mstBillingAddressDto = new MstBillingAddressDto();
		
		Sessions.getCurrent().setAttribute("objBillingAddress", mstBillingAddressDto);
		
		Include inc = (Include) Executions.getCurrent().getDesktop().getPage("index").getFellow("mainInclude");
		
		inc.setSrc("/master/karyawan/karyawanedit.zul");
	}
	
	@Command(value="edit")
	public void edit(){
		
		if(mstBillingAddressDto == null && mstBillingAddressDto.getId() == null){
			Messagebox.show("Pilih data yang akan diedit");
		}
		else{
			Sessions.getCurrent().setAttribute("objBillingAddress", mstBillingAddressDto);
			Include inc = (Include) Executions.getCurrent().getDesktop().getPage("index").getFellow("mainInclude");
			inc.setSrc("/master/karyawan/karyawanedit.zul");
		}
		
	}
	
	@Command("delete")
	public void delete(){
		if(mstBillingAddressDto == null && mstBillingAddressDto.getId() == null){
			Messagebox.show("Pilih data yang akan di delete");
		}
		else{
			mstBillingAddressSvc.delete(mstBillingAddressDto);
			listBillingAddress.remove(mstBillingAddressDto);
			BindUtils.postNotifyChange(null, null, BillingAddressVmd.this, "listBillingAddress");
			Clients.showNotification("Data Berhasil di Delete", Clients.NOTIFICATION_TYPE_INFO, null, null, 500);
		}
	}

	/* ----- Setter Getter ----- */
	public List<MstBillingAddressDto> getListBillingAddress() {
		return listBillingAddress;
	}

	public void setListBillingAddress(List<MstBillingAddressDto> listBillingAddress) {
		this.listBillingAddress = listBillingAddress;
	}

	public MstBillingAddressDto getMstBillingAddressDto() {
		return mstBillingAddressDto;
	}

	public void setMstBillingAddressDto(MstBillingAddressDto mstBillingAddressDto) {
		this.mstBillingAddressDto = mstBillingAddressDto;
	}

	public boolean isReadonly() {
		return readonly;
	}

	public void setReadonly(boolean readonly) {
		this.readonly = readonly;
	}

	public MstBillingAddressService getMstBillingAddressSvc() {
		return mstBillingAddressSvc;
	}

	public void setMstBillingAddressSvc(MstBillingAddressService mstBillingAddressSvc) {
		this.mstBillingAddressSvc = mstBillingAddressSvc;
	}
	
}
