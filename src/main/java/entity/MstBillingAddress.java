package entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import component.BaseEntity;
import entity.enumcol.GenderEnum;
import entity.pk.MstEmployeePk;



@Entity
@Table(name="mst_BillingAddress")
@IdClass(value=MstBillingAddressPk.class)
public class MstBillingAddress extends BaseEntity implements Serializable{

	private static final long serialVersionUID = 209321702337294118L;

	

}
