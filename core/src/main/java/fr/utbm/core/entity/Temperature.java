package fr.utbm.core.entity;

import java.sql.Date;

public class Temperature {

	private int id;
	private float value;
	private Date date;
	private Sensor sen_id;

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
	 * @return the value
	 */
	public float getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the sen_id
	 */
	public Sensor getSen_id() {
		return sen_id;
	}

	/**
	 * @param sen_id
	 *            the sen_id to set
	 */
	public void setSen_id(Sensor sen_id) {
		this.sen_id = sen_id;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(float value) {
		this.value = value;
	}

}
