package dto;

import java.util.Date;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import entity.enumcol.GenderEnum;
import entity.enumcol.ProductCategoryEnum;

public class MstBillingAddressDto {

	
	private Date createdDate;// = LocalDateTime.now();
	private String createdUser;
	private Date updatedDate;
	private String updatedUser;
	private Boolean deleted = false;
	
	
	private Integer Id;
	private String Nama;
	private GenderEnum Gender;
	private ProductCategoryEnum job;
	
	
	
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getUpdatedUser() {
		return updatedUser;
	}
	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}
	public Boolean getDeleted() {
		return deleted;
	}
	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getNama() {
		return Nama;
	}
	public void setNama(String nama) {
		Nama = nama;
	}
	public GenderEnum getGender() {
		return Gender;
	}
	public void setGender(GenderEnum gender) {
		Gender = gender;
	}
	public ProductCategoryEnum getJob() {
		return job;
	}
	public void setJob(ProductCategoryEnum job) {
		this.job = job;
	} 
	
	
	
	
	
	
}
