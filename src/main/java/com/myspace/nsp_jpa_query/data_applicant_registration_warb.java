package com.myspace.nsp_jpa_query;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class data_applicant_registration_warb implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "DATA_APPLICANT_REGISTRATION_WARB_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "DATA_APPLICANT_REGISTRATION_WARB_ID_SEQ", name = "DATA_APPLICANT_REGISTRATION_WARB_ID_GENERATOR")
	private java.lang.Long id;

	private java.lang.String application_id;

	private java.lang.Character category_id;

	private java.lang.String force_no;

	private java.lang.String name_of_personnel;

	private java.lang.String current_working_status_of_personnel;

	private java.lang.String unit;

	private java.lang.String ppo_no;

	private java.lang.Integer force_type_id;

	private java.lang.Integer rank;

	private java.lang.Integer zone;

	private java.lang.Character railway_division;

	private java.lang.Integer railway_rank;

	private java.math.BigInteger lic_state_id;

	private java.lang.String lic_policy_no;

	private java.math.BigInteger lic_id;

	public data_applicant_registration_warb() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getApplication_id() {
		return this.application_id;
	}

	public void setApplication_id(java.lang.String application_id) {
		this.application_id = application_id;
	}

	public java.lang.Character getCategory_id() {
		return this.category_id;
	}

	public void setCategory_id(java.lang.Character category_id) {
		this.category_id = category_id;
	}

	public java.lang.String getForce_no() {
		return this.force_no;
	}

	public void setForce_no(java.lang.String force_no) {
		this.force_no = force_no;
	}

	public java.lang.String getName_of_personnel() {
		return this.name_of_personnel;
	}

	public void setName_of_personnel(java.lang.String name_of_personnel) {
		this.name_of_personnel = name_of_personnel;
	}

	public java.lang.String getCurrent_working_status_of_personnel() {
		return this.current_working_status_of_personnel;
	}

	public void setCurrent_working_status_of_personnel(
			java.lang.String current_working_status_of_personnel) {
		this.current_working_status_of_personnel = current_working_status_of_personnel;
	}

	public java.lang.String getUnit() {
		return this.unit;
	}

	public void setUnit(java.lang.String unit) {
		this.unit = unit;
	}

	public java.lang.String getPpo_no() {
		return this.ppo_no;
	}

	public void setPpo_no(java.lang.String ppo_no) {
		this.ppo_no = ppo_no;
	}

	public java.lang.Integer getForce_type_id() {
		return this.force_type_id;
	}

	public void setForce_type_id(java.lang.Integer force_type_id) {
		this.force_type_id = force_type_id;
	}

	public java.lang.Integer getRank() {
		return this.rank;
	}

	public void setRank(java.lang.Integer rank) {
		this.rank = rank;
	}

	public java.lang.Integer getZone() {
		return this.zone;
	}

	public void setZone(java.lang.Integer zone) {
		this.zone = zone;
	}

	public java.lang.Character getRailway_division() {
		return this.railway_division;
	}

	public void setRailway_division(java.lang.Character railway_division) {
		this.railway_division = railway_division;
	}

	public java.lang.Integer getRailway_rank() {
		return this.railway_rank;
	}

	public void setRailway_rank(java.lang.Integer railway_rank) {
		this.railway_rank = railway_rank;
	}

	public java.math.BigInteger getLic_state_id() {
		return this.lic_state_id;
	}

	public void setLic_state_id(java.math.BigInteger lic_state_id) {
		this.lic_state_id = lic_state_id;
	}

	public java.lang.String getLic_policy_no() {
		return this.lic_policy_no;
	}

	public void setLic_policy_no(java.lang.String lic_policy_no) {
		this.lic_policy_no = lic_policy_no;
	}

	public java.math.BigInteger getLic_id() {
		return this.lic_id;
	}

	public void setLic_id(java.math.BigInteger lic_id) {
		this.lic_id = lic_id;
	}

	public data_applicant_registration_warb(java.lang.Long id,
			java.lang.String application_id, java.lang.Character category_id,
			java.lang.String force_no, java.lang.String name_of_personnel,
			java.lang.String current_working_status_of_personnel,
			java.lang.String unit, java.lang.String ppo_no,
			java.lang.Integer force_type_id, java.lang.Integer rank,
			java.lang.Integer zone, java.lang.Character railway_division,
			java.lang.Integer railway_rank, java.math.BigInteger lic_state_id,
			java.lang.String lic_policy_no, java.math.BigInteger lic_id) {
		this.id = id;
		this.application_id = application_id;
		this.category_id = category_id;
		this.force_no = force_no;
		this.name_of_personnel = name_of_personnel;
		this.current_working_status_of_personnel = current_working_status_of_personnel;
		this.unit = unit;
		this.ppo_no = ppo_no;
		this.force_type_id = force_type_id;
		this.rank = rank;
		this.zone = zone;
		this.railway_division = railway_division;
		this.railway_rank = railway_rank;
		this.lic_state_id = lic_state_id;
		this.lic_policy_no = lic_policy_no;
		this.lic_id = lic_id;
	}
	
	@Override
	public java.lang.String toString() {
		return "data_applicant_registration_warb [id=" + id + ", application_id=" + application_id
				+ ", category_id=" + category_id + "]";
	    
	}
	
	

}