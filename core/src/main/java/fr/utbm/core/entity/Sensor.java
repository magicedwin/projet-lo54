package fr.utbm.core.entity;

import java.util.Set;



public class Sensor {

	private int id;
	private String label;
	private Station sta_id;
	private Set<Temperature> temperature;

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
	 * @return the sta_id
	 */
	public Station getSta_id() {
		return sta_id;
	}

	/**
	 * @param sta_id
	 *            the sta_id to set
	 */
	public void setSta_id(Station sta_id) {
		this.sta_id = sta_id;
	}

	/**
	 * @return the temperature
	 */
	public Set<Temperature> getTemperature() {
		return temperature;
	}

	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(Set<Temperature> temperature) {
		this.temperature = temperature;
	}

}
