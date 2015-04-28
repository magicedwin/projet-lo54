package fr.utbm.core.entity;

import java.sql.Date;
import java.util.Set;

public class Station {

	private int id;
	private String label;
	private Area area;
	private Date lastcom;
	private byte valid;
	private Set<Sensor> sensors;

	/**
	 * @return the id
	 */
	public int getId() {
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
	 * @return the area
	 */
	public Area getArea() {
		return area;
	}

	/**
	 * @param area
	 *            the area to set
	 */
	public void setArea(Area area) {
		this.area = area;
	}

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
	public byte getValid() {
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
	 * @return the sensors
	 */
	public Set<Sensor> getSensors() {
		return sensors;
	}

	/**
	 * @param sensors
	 *            the sensors to set
	 */
	public void setSensors(Set<Sensor> sensors) {
		this.sensors = sensors;
	}

}
