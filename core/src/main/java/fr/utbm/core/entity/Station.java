package fr.utbm.core.entity;

import java.sql.Date;
import java.util.Set;

public class Station {

	private int id;
	private String label;
	private Area are_id;
	private Date lastcom;
	private byte valid;
	private Set<Sensor> sensor;

	/**
	 * @return the lastcom
	 */
	public Date getLastcom() {
		return lastcom;
	}

	/**
	 * @param lastcom
	 *            the lastcom to set
	 */
	public void setLastcom(Date lastcom) {
		this.lastcom = lastcom;
	}

	/**
	 * @return the valid
	 */
	public byte isValid() {
		return valid;
	}

	/**
	 * @param valid
	 *            the valid to set
	 */
	public void setValid(byte valid) {
		this.valid = valid;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label
	 *            the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the are_id
	 */
	public Area getAre_id() {
		return are_id;
	}

	/**
	 * @param are_id
	 *            the are_id to set
	 */
	public void setAre_id(Area are_id) {
		this.are_id = are_id;
	}

	/**
	 * @return the valid
	 */
	public byte getValid() {
		return valid;
	}

	/**
	 * @return the sensor
	 */
	public Set<Sensor> getSensor() {
		return sensor;
	}

	/**
	 * @param sensor
	 *            the sensor to set
	 */
	public void setSensor(Set<Sensor> sensor) {
		this.sensor = sensor;
	}

}
