package com.atguigu.crud.bean;

public class Department {
    private Integer deptId;

    private String deptName;
    
    

    public Department(Integer deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}

	public Department(Object object, String string) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }
}