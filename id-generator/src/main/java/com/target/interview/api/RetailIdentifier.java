package com.target.interview.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class RetailIdentifier {
    private String id;
	private String name;
    private BusinessUnit unit;
    private Integer ttl;
    
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BusinessUnit getUnit() {
		return unit;
	}
	public void setUnit(BusinessUnit unit) {
		this.unit = unit;
	}
	public Integer getTtl() {
		return ttl;
	}
	public void setTtl(Integer ttl) {
		this.ttl = ttl;
	}
}
